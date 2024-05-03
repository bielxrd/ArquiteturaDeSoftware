package Facade.RocketSeat.projetopayment.before.services;

import Facade.RocketSeat.projetopayment.before.model.Card;
import Facade.RocketSeat.projetopayment.before.model.Registration;

import java.util.*;

public class RegistrationService {
    private Map<Long, List<Registration>> memory;

    public RegistrationService() {
        memory = new HashMap<Long, List<Registration>>();
        memory.put(11223344L, new ArrayList<>(Arrays.asList(
                new Registration("Apple", 2000d, new Date()),
                new Registration("Shein", 33d, new Date()),
                new Registration("Mercado Livre shoes", 500d, new Date())
        )));
    }

    public List<Registration> getRegistersByCard(Card card) {
        return memory.get(card.getCardNumber());
    }


    public void removeByIndex(Card card, int i) {
        List<Registration> list = memory.get(card.getCardNumber());
        Registration reg = list.remove(i);
        System.out.println(reg.toString() + "Deleted");
        memory.put(card.getCardNumber(), list); // Coloque no hash novamente com o elemento removido
    }

    public void deleteCardRegistries(Card card) {
        memory.remove(card.getCardNumber());
    }

    public void addCardRegisters(Card card, List<Registration> registrationList) {
        System.out.println("Esta associando registros pendentes a um novo cartao");
        memory.put(card.getCardNumber(), registrationList);
    }
}
