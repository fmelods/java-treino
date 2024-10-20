import java.time.LocalDate;

public class Prontuario {
    private Long id;
    private LocalDate data;
    private String observacoes;
    private Funcionario responsavel;
    private Paciente paciente;

    public Prontuario() {
        this.data = data;
        this.observacoes = observacoes;
        this.responsavel = responsavel;
        this.paciente = paciente;
    }

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}