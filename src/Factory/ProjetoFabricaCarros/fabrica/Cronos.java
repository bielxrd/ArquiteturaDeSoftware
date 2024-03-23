package Factory.ProjetoFabricaCarros.fabrica;

public class Cronos implements Carro{

    private double preco;
    private String modelo;


    public Cronos(double preco, String modelo) {
        this.preco = preco;
        this.modelo = modelo;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Cronos{" +
                "preco=" + preco +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
