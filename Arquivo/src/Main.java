import java.util.List;

public class Main {
    public static void main(String[] args) {
        String caminhoCSV = "precos.csv";
        String caminhoObjetos = "registros.obj";

        List<Registro> registros = LeituraCSV.lerArquivoCSV(CaminhoCSV);

        GravacaoObjetos.gravarRegistros(caminhoObjetos, registros);

        EstatisticasPrecos.calcularEstatisticas(caminhoObjetos);

        ContagemPrecosPorLocal.contarPrecosPorEstabelecimento(caminhoObjetos);
    }
}