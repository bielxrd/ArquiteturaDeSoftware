package apple.factory;

import apple.abstractfactory.CountryRulesAbstractFactory;
import apple.model.macbooks.MacAir;
import apple.model.macbooks.MacPro;
import apple.model.macbooks.MacProM1;
import apple.model.macbooks.Macbook;

public class MacAirFactory extends MacbookFactory {
    public MacAirFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected Macbook createMacbook(String level) {
        if (level.equals("AIR")) {
            return new MacAir(rules);
        } else if (level.equals("PROM1")) {
            return new MacProM1(rules);
        } else return null;
    }
}
