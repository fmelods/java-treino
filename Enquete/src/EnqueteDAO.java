import java.sql.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class EnqueteDao {

    public List<Enquete> recupera() throws Exception {
        String sql = "SELECT * FROM tbl_enquete ORDER BY datacriacao";
        List<Enquete> retorno = new LinkedList<>();

        try (Connection con = new ConnectionFactory().getConexao();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Enquete enq = new Enquete();
                enq.setId(rs.getLong("id"));
                enq.setNome(rs.getString("nome"));
                enq.setDescricao(rs.getString("descricao"));
                enq.setCriador(rs.getString("criador"));
                enq.setDataCriacao(rs.getDate("datacriacao").toLocalDate());
                retorno.add(enq);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        return retorno;
    }


    public void altera(Enquete enq) throws Exception {
        String sql = "UPDATE tbl_enquete SET nome = ?, descricao = ?, criador = ?, datacriacao = ? WHERE id = ?";
        try (Connection con = new ConnectionFactory().getConexao();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, enq.getNome());
            pstmt.setString(2, enq.getDescricao());
            pstmt.setString(3, enq.getCriador());
            pstmt.setDate(4, Date.valueOf(enq.getDataCriacao()));
            pstmt.setLong(5, enq.getId());

            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    public void insere(Enquete enq) throws Exception {
        String sql = "INSERT INTO tbl_enquete (nome, descricao, criador, datacriacao) VALUES (?, ?, ?, ?)";
        try (Connection con = new ConnectionFactory().getConexao();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, enq.getNome());
            pstmt.setString(2, enq.getDescricao());
            pstmt.setString(3, enq.getCriador());
            pstmt.setDate(4, Date.valueOf(enq.getDataCriacao()));

            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void deleta(long id) throws Exception {
        String sql = "DELETE FROM tbl_enquete WHERE id = ?";
        try (Connection con = new ConnectionFactory().getConexao();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setLong(1, id);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
