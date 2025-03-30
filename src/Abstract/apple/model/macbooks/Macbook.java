package apple.model.macbooks;

import apple.abstractfactory.CountryRulesAbstractFactory;

public abstract class Macbook {
    CountryRulesAbstractFactory rules;

    public Macbook(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling all the hardwares");
    }

    public void certificates() {
        System.out.println("Testing all the certificates");
        System.out.println(rules.getCertificates().applyCertificate());
    }

    public void pack() {
        System.out.println("Packing all the macbooks");
        System.out.println(rules.getPacking().pack());
    }
}
