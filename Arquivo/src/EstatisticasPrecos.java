import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstatisticasPrecos {
    public static void calcularEstatisticas(String caminhoArquivoObjetos) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminhoArquivoObjetos))) {
            List<Registro> registros = (List<Registro>) ois.readObject();
            Map<String, PrecoEstatistica> estatisticas = new HashMap<>();

            for (Registro registro : registros) {
                String nomeProduto = registro.getNomeProduto();
                PrecoEstatistica estatistica = estatisticas.getOrDefault(nomeProduto, new PrecoEstatistica(nomeProduto));
                estatistica.adicionarPreco(registro.getPreco());
                estatisticas.put(nomeProduto, estatistica);
            }

            for (PrecoEstatistica estatistica : estatisticas.values()) {
                System.out.println(estatistica);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
