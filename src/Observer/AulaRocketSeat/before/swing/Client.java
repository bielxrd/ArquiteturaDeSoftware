package Observer.AulaRocketSeat.before.swing;

import Observer.AulaRocketSeat.before.observer.MeetupOrganizer;
import Observer.AulaRocketSeat.before.observer.Receptionist;

public class Client {
    public static void main(String[] args) {

        Receptionist receptionist = new Receptionist();
        MeetupOrganizer meetupOrganizer = new MeetupOrganizer(receptionist);

        meetupOrganizer.startMeetUpIfPossible();

        System.out.println("5 minutes later...");
        meetupOrganizer.startMeetUpIfPossible();

        System.out.println("5 minutes later...");
        meetupOrganizer.startMeetUpIfPossible();

        System.out.println("5 minutes later...");
        meetupOrganizer.startMeetUpIfPossible();

        System.out.println("participants are coming");
        receptionist.setStatus(true);
        meetupOrganizer.startMeetUpIfPossible();

        System.out.println("5 minutes later...");
        meetupOrganizer.startMeetUpIfPossible();
    }
}
