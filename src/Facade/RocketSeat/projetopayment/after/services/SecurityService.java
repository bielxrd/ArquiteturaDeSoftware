package Facade.RocketSeat.projetopayment.after.services;

import Facade.RocketSeat.projetopayment.after.models.Card;
import Facade.RocketSeat.projetopayment.after.models.Registration;

import java.util.List;

public class SecurityService {
    private CardService cardService;
    private RegistrationService registrationService;

    public SecurityService(CardService cardService, RegistrationService registrationService) {
        this.cardService = cardService;
        this.registrationService = registrationService;
    }

    public List<Registration> blockCard(Card card) {
        System.out.println("Blocking card: "+card);
        List<Registration> pendingsRegistries = registrationService.getRegistersByCard(card);
        cardService.removeCard(card);
        registrationService.deleteCardRegistries(card);
        return pendingsRegistries;
    }
}
