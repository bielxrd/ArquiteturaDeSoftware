package apple.abstractfactory;

import apple.model.certificate.BrazilianCertificate;
import apple.model.certificate.Certificate;
import apple.model.packing.BrazilianPacking;
import apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
