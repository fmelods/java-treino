public class Triagem extends Prontuario {
    private double temperatura;
    private double pressao;
    private double saturacao;

    public Triagem() {
        super();
        this.temperatura = temperatura;
        this.pressao = pressao;
        this.saturacao = saturacao;
    }

    // Getters e setters
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    public double getSaturacao() {
        return saturacao;
    }

    public void setSaturacao(double saturacao) {
        this.saturacao = saturacao;
    }
}