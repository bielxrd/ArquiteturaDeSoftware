package Composite.ProjetoCestaDeCafe.composite;

import java.awt.*;

public class Leaf implements Component {

    // A leaf (folha) vai ser a representação de um produto simples, nesse caso pode ser um item da cesta de cafe.

    private String nome;
    private double preco;

    public Leaf(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
