package Facade.RocketSeat.projetopayment.after.facade;

import Facade.RocketSeat.projetopayment.after.models.Card;
import Facade.RocketSeat.projetopayment.after.models.Registration;
import Facade.RocketSeat.projetopayment.after.services.*;

import java.util.List;

public class SupportSystemFacade {

    private CardService cardService;
    private RegistrationService registrationService;
    private ReportService reportService;
    private PaymentService paymentService;
    private SecurityService securityService;

    public SupportSystemFacade() {
        this.cardService = new CardService();
        this.registrationService = new RegistrationService();
        this.reportService = new ReportService(registrationService);
        this.paymentService = new PaymentService(registrationService);
        this.securityService = new SecurityService(cardService, registrationService);
    }

    public Card getCardByUser(Long l) {
        return cardService.getCardByUser(l);
    }

    public void getSumary(Card card) {
        reportService.getSummary(card);
    }

    public void getPaymentInfoByCard(Card card) {
        paymentService.getPaymentInfoByCard(card);
    }

    public void cancelLastRegister(Card card) {
        List<Registration> registers = registrationService.getRegistersByCard(card);
        registrationService.removeByIndex(card, registers.size() - 1);
        List<Registration> pendingRegisters = securityService.blockCard(card);
        Card newCard = cardService.createNewCard(123456L, 33445566L);
        registrationService.addCardRegisters(newCard, pendingRegisters);
        reportService.getSummary(newCard);
    }

}
