package apple.model.macbooks;

import apple.abstractfactory.CountryRulesAbstractFactory;

public class MacAir extends Macbook {

    public MacAir(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("MacbookAir Hardware");
        System.out.println("Retina screen");
        System.out.println("6GB");
    }
}
