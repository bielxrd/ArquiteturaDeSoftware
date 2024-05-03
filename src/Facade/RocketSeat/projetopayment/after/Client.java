package Facade.RocketSeat.projetopayment.after;

import Facade.RocketSeat.projetopayment.after.facade.SupportSystemFacade;
import Facade.RocketSeat.projetopayment.after.models.Card;

public class Client {
    public static void main(String[] args) {
        SupportSystemFacade supportSystemFacade = new SupportSystemFacade();

        Card card = supportSystemFacade.getCardByUser(123456L);
        System.out.println(card);

        supportSystemFacade.getSumary(card);

        supportSystemFacade.getPaymentInfoByCard(card);

        supportSystemFacade.cancelLastRegister(card);

        Card newCard = supportSystemFacade.getCardByUser(123456L);
        System.out.println(newCard);
    }
}
