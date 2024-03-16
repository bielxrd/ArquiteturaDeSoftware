package Composite.ProjetoCestaDeCafe.cliente;

import Composite.ProjetoCestaDeCafe.composite.*;
import Composite.ProjetoCestaDeCafe.composite.Component;
import Composite.ProjetoCestaDeCafe.composite.Composite;

import java.awt.*;

public class MontarCestas {
    public static void main(String[] args) {

        Composite composite = new Composite("CESTA DE CAFE");


        Component p1 = new Leaf("Capuccino", 11.0);
        Component p2 = new Leaf("Leite", 7.0);
        Component p3 = new Leaf("Pao de Queijo", 5.0);
        Component p4 = new Leaf("Coxinha", 3.0);
        Component p5 = new Leaf("Toddy", 5.0);
        Component p6 = new Leaf("Ovomaltine", 8.0);

        //bombons
        Component p7 = new Leaf("Maracuja", 9.36);
        Component p8 = new Leaf("Cereja", 7.21);
        Component p9 = new Leaf("Avelã", 11.78);

        // Criar caixa de bombom
        Composite caixaBombom = new Composite("Caixa bombom");
        caixaBombom.add(p7);
        caixaBombom.add(p8);
        caixaBombom.add(p9);


        composite.add(p1);
        composite.add(p2);
        composite.add(p3);
        composite.add(p4);
        composite.add(p5);
        composite.add(p6);
        composite.add(caixaBombom);


        System.out.println(composite.getPreco());




    }
}
