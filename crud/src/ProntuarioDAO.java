import br.com.fiap.futiba.dao.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProntuarioDAO {
    public List<Prontuario> recuperaProntuario(Paciente pac) throws Exception {
        List<Prontuario> prontuarios = new ArrayList<>();
        String sql = "SELECT id, data, observacoes, funcionario_id, temperatura, pressao, saturacao, discriminator " +
                "FROM tbl_prontuario " +
                "WHERE paciente_id = ? " +
                "ORDER BY data DESC";

        try (Connection con = new ConnectionFactory().getConexao()) {
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {

                // Define o ID do paciente para a busca
                pstmt.setLong(1, pac.getId());

                try (ResultSet rs = pstmt.executeQuery()) {
                    while (rs.next()) {
                        // Recupera os dados básicos do prontuário
                        long id = rs.getLong("id");
                        Date data = rs.getDate("data");
                        String observacoes = rs.getString("observacoes");
                        long funcionarioId = rs.getLong("funcionario_id");
                        String discriminator = rs.getString("discriminator");

                        // Verifica se é um prontuário ou triagem
                        if (discriminator.equals("TRIAGEM")) {
                            double temperatura = rs.getDouble("temperatura");
                            double pressao = rs.getDouble("pressao");
                            double saturacao = rs.getDouble("saturacao");

                            // Criando objeto Triagem
                            Triagem t = new Triagem();
                            t.setId(id);
                            t.setData(data.toLocalDate());
                            t.setObservacoes(observacoes);
                            t.setTemperatura(temperatura);
                            t.setPressao(pressao);
                            t.setSaturacao(saturacao);
                            t.setPaciente(pac);

                            prontuarios.add(t);  // Adiciona o objeto Triagem à lista
                        } else {
                            // Criando objeto Prontuario
                            Prontuario p = new Prontuario();
                            p.setId(id);
                            p.setData(data.toLocalDate());
                            p.setObservacoes(observacoes);
                            p.setPaciente(pac);

                            prontuarios.add(p);  // Adiciona o objeto Prontuario à lista
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return prontuarios;
    }

    public void inclui(Prontuario p) throws Exception {
        String cols;
        cols = "data, observacoes, funcionario_id, paciente_id, temperatura, pressao, saturacao, discriminator";
        String sql = "INSERT INTO tbl_prontuario (" + cols + ") values (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = new ConnectionFactory().getConexao();
             PreparedStatement pstmt = con.prepareStatement(sql, new String[]{"id"})) {  // Alteração: "id" indica a coluna de chave primária que será retornada

            // setando dados do prontuario
            pstmt.setDate(1, Date.valueOf(p.getData()));
            pstmt.setString(2, p.getObservacoes());
            pstmt.setLong(3, p.getResponsavel().getId());
            pstmt.setLong(4, p.getPaciente().getId());

            if (p instanceof Triagem) {
                Triagem t = (Triagem) p;
                pstmt.setDouble(5, t.getTemperatura());
                pstmt.setDouble(6, t.getPressao());
                pstmt.setDouble(7, t.getSaturacao());
                pstmt.setString(8, "TRIAGEM");
            } else {
                pstmt.setNull(5, java.sql.Types.DOUBLE);
                pstmt.setNull(6, java.sql.Types.DOUBLE);
                pstmt.setNull(7, java.sql.Types.DOUBLE);
                pstmt.setString(8, "PRONTUARIO");
            }

            pstmt.executeUpdate();

            // Recuperando o ID gerado pelo banco
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                p.setId(rs.getLong(1));  // Atualiza o ID do prontuário com o ID gerado
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


