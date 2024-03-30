package Composite.ProjetoCestaDeCafe.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    // A composite (composicao) é o elemento da nossa aplicação que sera nossa cesta de cafe, que vai conter tantos leafs(folhas, produtos) e outras composites.

    private List<Component> listaProdutos;
    private String nome;

    public Composite(String nome) {
        listaProdutos = new ArrayList<>();
        this.nome = nome;
    }

    public void add(Component component) {
        listaProdutos.add(component);
    }

    public void delete(Component component) {
        if (listaProdutos.contains(component))
            listaProdutos.remove(component);
        else
            System.out.println("Not found");

    }

    @Override
    public double getPreco() {
        double total = 0;
        for (Component item : listaProdutos) {
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Composite{" +
                "listaProdutos=" + listaProdutos +
                ", nome='" + nome + '\'' +
                '}';
    }
}
