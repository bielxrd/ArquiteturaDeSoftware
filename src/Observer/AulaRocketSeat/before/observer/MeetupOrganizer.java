package Observer.AulaRocketSeat.before.observer;

public class MeetupOrganizer {

    private Receptionist receptionist;

    public MeetupOrganizer(Receptionist receptionist) {
        this.receptionist = receptionist;
    }
    public void startMeetUpIfPossible() {
        if (receptionist.getStatus()) {
            meetUpTime();
        } else {
            System.out.println("Hold on... the meet up cannot start yet");
        }
    }
    public void meetUpTime() {
        System.out.println("The meetup will start");
    }

}
