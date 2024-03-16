package Composite.ProjetoCestaDeCafe.composite;

import java.awt.*;

public class Leaf implements Component {

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
