package Factory.ProjetoFabricaCarros.fabrica;

public class Argo implements Carro{

    private double preco;
    private String modelo;


    public Argo(double preco, String modelo) {
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
        return "Argo{" +
                "preco=" + preco +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
