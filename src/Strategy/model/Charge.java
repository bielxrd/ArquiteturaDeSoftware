package Strategy.model;

public class Charge {

    private double peso;
    private String descriçao;

    public Charge() {

    }

    public Charge(double peso, String descriçao) {
        this.peso = peso;
        this.descriçao = descriçao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    @Override
    public String toString() {
        return "Charge{" +
                "peso=" + peso +
                ", descriçao='" + descriçao + '\'' +
                '}';
    }
}
