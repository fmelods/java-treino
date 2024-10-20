import java.time.LocalDate;

public class Enquete {
    private String nome;
    private String descricao;
    private String criador;
    private LocalDate dataCriacao;

    public Enquete() {
        this.nome = nome;
        this.descricao = descricao;
        this.criador = criador;
        this.dataCriacao = dataCriacao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCriador() {
        return criador;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setNome(String s) {
    }

    public void setDescricao(String s) {
    }

    public void setCriador(String joãoSilva) {
    }

    public void setDataCriacao(LocalDate now) {

    }

    public long getId() {
        return 0;
    }

    public void setId(long id) {

    }
}
