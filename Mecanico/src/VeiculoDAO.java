import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VeiculoDao {

    // Método para recuperar um veículo e suas ordens de serviço
    public VeiculoDTO recuperaVeiculoComOrdens(String placaVeiculo) throws Exception {
        VeiculoDTO veiculoDTO = new VeiculoDTO();
        List<OrdemServico> ordensServico = new ArrayList<>();

        String sqlVeiculo = "SELECT * FROM tbl_veiculo WHERE placa = ?";
        String sqlOrdens = "SELECT * FROM tbl_ordemservico WHERE veiculo_placa = ?";

        try (Connection con = new ConnectionFactory().getConexao()) {
            // Consultar as informações do veículo
            try (PreparedStatement pstmtVeiculo = con.prepareStatement(sqlVeiculo)) {
                pstmtVeiculo.setString(1, placaVeiculo);
                try (ResultSet rsVeiculo = pstmtVeiculo.executeQuery()) {
                    if (rsVeiculo.next()) {
                        Veiculo veiculo = new Veiculo();
                        veiculo.setDono(rsVeiculo.getString("dono"));
                        veiculo.setPlaca(rsVeiculo.getString("placa"));
                        veiculo.setMarca(rsVeiculo.getString("marca"));
                        veiculo.setModelo(rsVeiculo.getString("modelo"));
                        veiculo.setAno(rsVeiculo.getInt("ano"));

                        veiculoDTO.setVeiculo(veiculo);
                    }
                }
            }

            // Consultar as ordens de serviço do veículo
            try (PreparedStatement pstmtOrdens = con.prepareStatement(sqlOrdens)) {
                pstmtOrdens.setString(1, placaVeiculo);
                try (ResultSet rsOrdens = pstmtOrdens.executeQuery()) {
                    while (rsOrdens.next()) {
                        OrdemServico ordem = new OrdemServico();
                        ordem.setData(rsOrdens.getDate("data").toLocalDate());
                        ordem.setValor(rsOrdens.getDouble("valor"));
                        ordem.setMecanico(rsOrdens.getString("mecanico"));
                        ordem.setDescricao(rsOrdens.getString("descricao"));
                        ordensServico.add(ordem);
                    }
                }
            }

            veiculoDTO.setOrdensServico(ordensServico);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        return veiculoDTO;
    }
}
