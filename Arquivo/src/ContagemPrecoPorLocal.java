import java.io.*;
import java.util.List;
import java.util.Map;

public class ContagemPrecoPorLocal {
    public static void contarPrecosPorEstabelecimento(String caminhoArquivoObjetos) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminhoArquivoObjetos))) {
            List<Registro> registros = (List<Registro>) ois.readObject();
            Map<String, Integer> contagemPorLocal = new HashMap<>();

            for (Registro registro : registros)  {
                String estabelecimento = registro.getEstabelecimento();
                contagemPorLocal.put(estabelecimento, contagemPorLocal.getOrDefault(estabelecimento, 0) + 1);
            }

            for (Map.Entry<String, Integer> entry : contagemPorLocal.entrySet()) {
                System.out.println("Estabelecimento: " + entry.getKey() + ", Preços coletados: " + entry.getValue());
            }

        } catch (IOException | ClassNotException e) {
            e.printStackTrace();
        }
    }
}
