package apple.abstractfactory;

import apple.model.certificate.Certificate;
import apple.model.certificate.USACertificate;
import apple.model.packing.Packing;
import apple.model.packing.USAPacking;

public class USARulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new USACertificate();
    }

    @Override
    public Packing getPacking() {
        return new USAPacking();
    }
}
