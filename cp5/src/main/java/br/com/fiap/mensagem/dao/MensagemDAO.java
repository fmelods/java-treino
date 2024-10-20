package br.com.fiap.mensagem.dao;

import br.com.fiap.mensagem.model.Mensagem;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MensagemDAO {

    private Connection conexao;

    public MensagemDAO() throws Exception {
        this.conexao = new ConexaoFactory().getConexao();
    }

    public void inclui(Mensagem m) throws Exception {
        String sql = "INSERT INTO tbl_mensagem (id, assunto, destinatario, remetente, data, conteudo, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setLong(1, m.getId());
            stmt.setString(2, m.getAssunto());
            stmt.setString(3, m.getDestinatario());
            stmt.setString(4, m.getRemetente());
            stmt.setDate(5, Date.valueOf(m.getData()));
            stmt.setString(6, m.getConteudo());
            stmt.setInt(7, m.getStatus());
            stmt.executeUpdate();
        }
    }

    public void altera(Mensagem m) throws Exception {
        String sql = "UPDATE tbl_mensagem SET assunto = ?, destinatario = ?, remetente = ?, data = ?, conteudo = ?, status = ? WHERE id = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, m.getAssunto());
            stmt.setString(2, m.getDestinatario());
            stmt.setString(3, m.getRemetente());
            stmt.setDate(4, Date.valueOf(m.getData()));
            stmt.setString(5, m.getConteudo());
            stmt.setInt(6, m.getStatus());
            stmt.setLong(7, m.getId());
            stmt.executeUpdate();
        }
    }

    public Mensagem recupera(long id) throws Exception {
        String sql = "SELECT * FROM tbl_mensagem WHERE id = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Mensagem(
                        rs.getLong("id"),
                        rs.getString("assunto"),
                        rs.getString("destinatario"),
                        rs.getString("remetente"),
                        rs.getDate("data").toLocalDate(),
                        rs.getString("conteudo"),
                        rs.getInt("status")
                );
            }
        }
        return null;
    }

    public List<Mensagem> recuperaPorData(LocalDate data) throws Exception {
        List<Mensagem> mensagens = new ArrayList<>();
        String sql = "SELECT * FROM tbl_mensagem WHERE data = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setDate(1, Date.valueOf(data));
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                mensagens.add(new Mensagem(
                        rs.getLong("id"),
                        rs.getString("assunto"),
                        rs.getString("destinatario"),
                        rs.getString("remetente"),
                        rs.getDate("data").toLocalDate(),
                        rs.getString("conteudo"),
                        rs.getInt("status")
                ));
            }
        }
        return mensagens;
    }

    public List<Mensagem> recuperaPorDestinatario(String destinatario) throws Exception {
        List<Mensagem> mensagens = new ArrayList<>();
        String sql = "SELECT * FROM tbl_mensagem WHERE destinatario = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, destinatario);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                mensagens.add(new Mensagem(
                        rs.getLong("id"),
                        rs.getString("assunto"),
                        rs.getString("destinatario"),
                        rs.getString("remetente"),
                        rs.getDate("data").toLocalDate(),
                        rs.getString("conteudo"),
                        rs.getInt("status")
                ));
            }
        }
        return mensagens;
    }
}
