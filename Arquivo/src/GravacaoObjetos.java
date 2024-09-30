import java.io.*;
import java.util.List;

public class GravacaoObjetos {
    public static void gravarRegistros(String caminhoArquivo, List<Registro> registros) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminhoArquivo))) {
            oos.writeObject(registros);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
