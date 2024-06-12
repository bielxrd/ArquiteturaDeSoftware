package Observer.AulaRocketSeat.after.observer;

public class MeetUpParticipant implements Observer {

    public void sendData() {
        System.out.println("Pessoa X chegou, RG: 1374831258");
    }

    @Override
    public void update(boolean status) {
        if (status) {
            sendData();
        } else {
            System.out.println("Sleep...");
        }
    }
}
