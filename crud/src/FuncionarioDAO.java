import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FuncionarioDAO {

    public void inclui(Funcionario f) throws Exception {
        String sql = "INSERT INTO Funcionario (nome, tipo) VALUES (?, ?)";
        try (Connection con = DriverManager.getConnection("sua_string_de_conexao");
             PreparedStatement pstmt = con.prepareStatement(sql, new String[] { "id" })) {

            pstmt.setString(1, f.getNome());
            pstmt.setString(2, f.getTipo().name()); // Armazenando o tipo como string

            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                f.setId(rs.getLong(1)); // Atribui o ID gerado ao funcionário
            }
        }
    }

    public void altera(Funcionario f) throws Exception {
        String sql = "UPDATE Funcionario SET nome = ?, tipo = ? WHERE id = ?";
        try (Connection con = DriverManager.getConnection("sua_string_de_conexao");
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, f.getNome());
            pstmt.setString(2, f.getTipo().name());
            pstmt.setLong(3, f.getId());

            pstmt.executeUpdate();
        }
    }

    public void apaga(long id) throws Exception {
        String sql = "DELETE FROM Funcionario WHERE id = ?";
        try (Connection con = DriverManager.getConnection("sua_string_de_conexao");
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setLong(1, id);
            pstmt.executeUpdate();
        }
    }

    public Funcionario recupera(long id) throws Exception {
        String sql = "SELECT id, nome, tipo FROM Funcionario WHERE id = ?";
        Funcionario funcionario = null;

        try (Connection con = DriverManager.getConnection("sua_string_de_conexao");
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setLong(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    funcionario = new Funcionario();
                    funcionario.setId(rs.getLong("id"));
                    funcionario.setNome(rs.getString("nome"));
                    funcionario.setTipo(Funcionario.Tipo.valueOf(rs.getString("tipo"))); // Recupera o tipo
                }
            }
        }

        return funcionario;
    }
}
