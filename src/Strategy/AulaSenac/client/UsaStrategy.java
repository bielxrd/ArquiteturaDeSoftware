package Strategy.AulaSenac.client;

import Strategy.AulaSenac.model.Charge;
import Strategy.AulaSenac.strategy.ListaEmpresas;

public class UsaStrategy {
    public static void main(String[] args) {
        Charge charge = new Charge(30, "iPhone 14 plus");
        double frete;
        frete = ListaEmpresas.values()[2].calcularPreco(charge);
        System.out.println("Frete para iPhone 14 plus na entrega XPTO: " + frete);
    }
}
