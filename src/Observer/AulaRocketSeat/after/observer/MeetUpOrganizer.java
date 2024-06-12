package Observer.AulaRocketSeat.after.observer;

public class MeetUpOrganizer implements Observer {

    public void meetUpTime() {
        System.out.println("The meet up will start");
    }
    @Override
    public void update(boolean status) {
        if (status) {
            meetUpTime();
        } else {
            System.out.println("Hold on . . . ");
        }
    }
}
