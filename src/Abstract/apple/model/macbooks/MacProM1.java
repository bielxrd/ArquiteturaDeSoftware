package apple.model.macbooks;

import apple.abstractfactory.CountryRulesAbstractFactory;

public class MacProM1 extends Macbook {

    public MacProM1(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("MacbookPro M1 Hardware");
        System.out.println("MacbookPro M1 CPU: Apple M1");
        System.out.println("MacbookPro M1 RAM: 16GB");
        System.out.println("MacbookPro M1 Storage: 512GB SSD");
    }

}
