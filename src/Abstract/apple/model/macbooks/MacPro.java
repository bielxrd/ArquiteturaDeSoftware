package apple.model.macbooks;

import apple.abstractfactory.CountryRulesAbstractFactory;

public class MacPro extends Macbook {

    public MacPro(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("MacbookPro Hardware");
        System.out.println("Retina screen");
        System.out.println("8GB");
    }
}
