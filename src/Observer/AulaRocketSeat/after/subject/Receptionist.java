package Observer.AulaRocketSeat.after.subject;

public class Receptionist extends Subject {
    private boolean status = false;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean newStatus) {
        if (newStatus !=  status) {
            this.status = newStatus;
            notifyObservers(status);
        }
    }

}
