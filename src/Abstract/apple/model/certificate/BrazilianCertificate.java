package apple.model.certificate;

public class BrazilianCertificate implements Certificate {

    @Override
    public String applyCertificate() {
        return "\t- Calibrating Brazilian rules\n\t- Applying Anatel's Model";
    }
}

