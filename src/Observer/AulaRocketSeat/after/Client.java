package Observer.AulaRocketSeat.after;

import Observer.AulaRocketSeat.after.observer.MeetUpOrganizer;
import Observer.AulaRocketSeat.after.observer.MeetUpParticipant;
import Observer.AulaRocketSeat.after.subject.Receptionist;

public class Client {
    public static void main(String[] args) {

        Receptionist receptionist = new Receptionist();

        receptionist.add(new MeetUpOrganizer());
        receptionist.add(new MeetUpParticipant());

        System.out.println("Participants are comming...");

        receptionist.setStatus(true);
    }
}
