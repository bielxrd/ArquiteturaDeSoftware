package Facade.RocketSeat.projetopayment.after.services;

import Facade.RocketSeat.projetopayment.after.models.Card;
import Facade.RocketSeat.projetopayment.after.models.Registration;

import java.util.List;

public class ReportService {

    private RegistrationService registrationService;

    public ReportService(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    public void getSummary(Card card) {
        List<Registration> registers = registrationService.getRegistersByCard(card);
        for(Registration reg: registers) {
            System.out.printf(String.format("%s\t%.2f\t%s",
                    reg.getStoreName(),
                    reg.getValue(),
                    reg.getDate().toString()
            ));
        }
    }
}
