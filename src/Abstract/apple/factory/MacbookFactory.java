package apple.factory;

import apple.abstractfactory.CountryRulesAbstractFactory;
import apple.model.macbooks.Macbook;

public abstract class MacbookFactory {
    CountryRulesAbstractFactory rules;

    public MacbookFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public Macbook orderMacbook(String level) {
        Macbook notebook = null;

        notebook = createMacbook(level);

        notebook.getHardware();
        notebook.assemble();
        notebook.certificates();
        notebook.pack();

        return notebook;
    }

    protected abstract Macbook createMacbook(String level);
}
