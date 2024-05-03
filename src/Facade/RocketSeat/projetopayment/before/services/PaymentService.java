package Facade.RocketSeat.projetopayment.before.services;

import Facade.RocketSeat.projetopayment.before.model.Card;
import Facade.RocketSeat.projetopayment.before.model.Registration;

import java.util.List;

public class PaymentService {

    private RegistrationService registrationService;

    public PaymentService(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    public void getPaymentInfoByCard(Card card) {
        List<Registration> registrations = registrationService.getRegistersByCard(card);
        double sum = registrations.stream().reduce(0d, (partialValue, reg) -> partialValue + reg.getValue(), Double::sum);
        System.out.println(String.format("You need to pay %.2f until next week", sum));
    }
}