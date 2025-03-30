package apple;

import apple.abstractfactory.BrazilianRulesAbstractFactory;
import apple.abstractfactory.CountryRulesAbstractFactory;
import apple.factory.MacAirFactory;
import apple.factory.MacProFactory;
import apple.factory.MacbookFactory;
import apple.model.macbooks.Macbook;

public class Client {
    public static void main(String[] args) {
        CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
        MacbookFactory macAirFactory = new MacAirFactory(rules);
        MacbookFactory macProFactory = new MacProFactory(rules);

        System.out.println("### Ordering the MacAir");
        Macbook mac1 = macAirFactory.orderMacbook("AIR");
        System.out.println(mac1);

        System.out.println("\n\n### Ordering the MacPro finally");
        Macbook mac2 = macProFactory.orderMacbook("PROM1");
        System.out.println(mac2);
    }
}
