import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LeituraCSV {
    public static List<Registro> lerArquivoCSV(String caminhoArquivo) {
        List<Registro> registros = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;

            br.readLine();

            while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(",");

                String nomeProduto = valores[0];
                String estabelecimento = valores[1];
                double preco = Double.parseDouble(valores[2]);

                registros.add(new Registro(nomeProduto, estabelecimento, preco));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return registros;
    }
}
