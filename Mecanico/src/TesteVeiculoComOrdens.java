import java.util.List;

public class TesteVeiculoComOrdens {

    public static void main(String[] args) {
        VeiculoDao veiculoDao = new VeiculoDao();

        try {
            VeiculoDTO veiculoDTO = veiculoDao.recuperaVeiculoComOrdens("ABC1234");

            // Exibe as informações do veículo
            Veiculo veiculo = veiculoDTO.getVeiculo();
            System.out.println("Dono: " + veiculo.getDono());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Ano: " + veiculo.getAno());

            // Exibe as ordens de serviço do veículo
            List<OrdemServico> ordensServico = veiculoDTO.getOrdensServico();
            for (OrdemServico ordem : ordensServico) {
                System.out.println("Data: " + ordem.getData());
                System.out.println("Valor: " + ordem.getValor());
                System.out.println("Mecânico: " + ordem.getMecanico());
                System.out.println("Descrição: " + ordem.getDescricao());
                System.out.println("--------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
