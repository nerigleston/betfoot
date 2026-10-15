package persistencia;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashMap;
import java.util.Map;

/*
 * Lê os arquivos de dados do jogo (teams/*.ban, selecoes, sav…) gravados com os nomes antigos das classes.
 * Os times e jogadores foram serializados como e.t e e.g; aqui eles são lidos como modelos.ModeloTime2 e
 * modelos.ModeloJogador2 (mesmos campos e mesmo serialVersionUID). Arquivos gravados com os nomes novos
 * são lidos normalmente.
 */
public class EntradaObjetosCompativel
extends ObjectInputStream {
    private static final Map<String, Class<?>> NOMES_ANTIGOS = new HashMap<String, Class<?>>();

    static {
        NOMES_ANTIGOS.put("e.t", modelos.ModeloTime2.class);
        NOMES_ANTIGOS.put("e.g", modelos.ModeloJogador2.class);
    }

    public EntradaObjetosCompativel(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    @Override
    protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
        ObjectStreamClass objectStreamClass = super.readClassDescriptor();
        Class<?> classe = NOMES_ANTIGOS.get(objectStreamClass.getName());
        if (classe == null) {
            return objectStreamClass;
        }
        ObjectStreamClass local = ObjectStreamClass.lookup(classe);
        if (local.getSerialVersionUID() != objectStreamClass.getSerialVersionUID()) {
            throw new IOException("serialVersionUID diferente para " + objectStreamClass.getName());
        }
        return local;
    }
}
