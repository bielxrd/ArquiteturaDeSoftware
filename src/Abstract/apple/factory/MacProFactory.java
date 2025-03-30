package apple.factory;

import apple.abstractfactory.CountryRulesAbstractFactory;
import apple.model.macbooks.MacPro;
import apple.model.macbooks.MacProM1;
import apple.model.macbooks.Macbook;

public class MacProFactory extends MacbookFactory {

    public MacProFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected Macbook createMacbook(String level) {
        if (level.equals("PRO")) {
            return new MacPro(rules);
        } else if (level.equals("PROM1")) {
            return new MacProM1(rules);
        } else return null;
    }
}
