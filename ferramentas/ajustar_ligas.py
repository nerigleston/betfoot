#!/usr/bin/env python3
"""Ajusta conf_ligas_nacionais/BRA.cfg para os regulamentos de 2026.

É o mesmo arquivo que o jogo grava pela tela "Ligas Nacionais > configurar" (est.ArrayLigaType com um
est.ConfigLigaType por divisão), então só usa recursos que o motor já tem. Guarda o original em BRA.cfg.original.

| Divisão | 2026 real                                                       | Configuração                                   |
|---------|-----------------------------------------------------------------|------------------------------------------------|
| Série A | 20 times, 38 rodadas, 4 rebaixados                              | sem mudança                                    |
| Série B | 2 sobem direto; 3º×6º e 4º×5º (ida e volta) valem 2 vagas       | vagasSobemPeloMataMata=2, ida e volta          |
| Série C | turno único, 2 quadrangulares (1020), final; só 2 rebaixados    | nRebaixados=rebaixadosDireto=2                 |
| Série D | 96 times, 16 grupos de 6 (ida e volta), 4 por grupo → mata-mata | nTimes=96, nGrupos=16, 4 por grupo, ida e volta|

Limite do motor: o número de clubes por divisão é fixo, então quem sobe da D = quem cai da C (2). Na vida real
sobem 6 porque a Série C cresce para 24 em 2027.
"""
import argparse
from pathlib import Path
import shutil
import sys

sys.path.insert(0, str(Path(__file__).resolve().parent))
from java_serial import read, write, list_items, Array  # noqa: E402

IDA_E_VOLTA = [True] * 7


def ajustar(divs):
    serie = {x.fields['divisao']: x.fields for x in divs}
    b, c, d = serie[2], serie[3], serie[4]
    b['vagasSobemPeloMataMata'] = 2
    b['duasVoltasMataMataSobe'] = Array(b['duasVoltasMataMataSobe'].desc, [True, True, False])
    c['nRebaixados'] = 2
    c['rebaixadosDireto'] = 2
    d.update(nTimes=96, nGrupos=16, numeroTimesMataMata=4, doisTurnos=True, rebaixadoPeloGrupo=False,
             melhoresTerceiros=False)
    d['duasVoltasMataMata'] = Array(d['duasVoltasMataMata'].desc, list(IDA_E_VOLTA))
    for x in divs:
        x.fields['versaoArquivo'] = 22


def main():
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument('jogo', type=Path, help='pasta do jogo')
    a = ap.parse_args()
    cfg = a.jogo / 'conf_ligas_nacionais' / 'BRA.cfg'
    original = cfg.with_name('BRA.cfg.original')
    if not original.exists():
        shutil.copy2(cfg, original)
    obj = read(original.read_bytes())[0]
    divs = list_items(obj.fields['a'])
    ajustar(divs)
    dados = write([obj])
    assert len(list_items(read(dados)[0].fields['a'])) == len(divs)
    cfg.write_bytes(dados)
    for x in divs:
        f = x.fields
        print(f"{f['nomeDivisao']}: {f['nTimes']} times, {f['nGrupos']} grupos, mata-mata {f['numeroTimesMataMata']}, "
              f"rebaixados {f['rebaixadosDireto']}/{f['nRebaixados']}, vagas por playoff {f['vagasSobemPeloMataMata']}")


if __name__ == '__main__':
    main()
