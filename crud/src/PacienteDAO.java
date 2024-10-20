import java.sql.*;

public class PacienteDAO {
    public void inclui(Paciente p) throws Exception {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DriverManager.getConnection("sua_string_de_conexao");
            String sql = "INSERT INTO Paciente (nome, cpf, email, nascimento) VALUES (?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql, new String[] { "id" });

            pstmt.setString(1, p.getNome());
            pstmt.setLong(2, p.getCpf());
            pstmt.setString(3, p.getEmail());
            pstmt.setDate(4, new java.sql.Date(p.getNascimento().getTime()));

            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                p.setId(rs.getLong(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        }
    }

    public void altera(Paciente p) throws Exception {
        String sql = "UPDATE Paciente SET nome = ?, cpf = ?, email = ?, nascimento = ? WHERE id = ?";
        try (Connection con = DriverManager.getConnection("sua_string_de_conexao");
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, p.getNome());
            pstmt.setLong(2, p.getCpf());
            pstmt.setString(3, p.getEmail());
            pstmt.setDate(4, new java.sql.Date(p.getNascimento().getTime()));
            pstmt.setLong(5, p.getId());

            pstmt.executeUpdate();
        }
    }

    public void apaga(long id) throws Exception {
        String sql = "DELETE FROM Paciente WHERE id = ?";
        try (Connection con = DriverManager.getConnection("sua_string_de_conexao");
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setLong(1, id);
            pstmt.executeUpdate();
        }
    }

    public Paciente recupera(long id) throws Exception {
        String sql = "SELECT id, nome, cpf, email, nascimento FROM Paciente WHERE id = ?";
        Paciente paciente = null;

        try (Connection con = DriverManager.getConnection("sua_string_de_conexao");
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setLong(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    paciente = new Paciente();
                    paciente.setId(rs.getLong("id"));
                    paciente.setNome(rs.getString("nome"));
                    paciente.setCpf(rs.getLong("cpf"));
                    paciente.setEmail(rs.getString("email"));
                    paciente.setNascimento(rs.getDate("nascimento"));
                }
            }
        }

        return paciente;
    }
}