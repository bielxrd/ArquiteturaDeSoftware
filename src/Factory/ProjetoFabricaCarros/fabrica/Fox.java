package Factory.ProjetoFabricaCarros.fabrica;

public class Fox implements Carro {

    private double preco;

    private String modelo;

    public Fox(double preco, String modelo) {
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
        return "Fox{" +
                "preco=" + preco +
                ", modelo='" + modelo + '\'' +
                '}';
    }


}
