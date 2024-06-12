package Observer.AulaRocketSeat.before.observer;

public class Receptionist {
    private boolean status = false;

    public Receptionist() {
    }
    public Receptionist(Boolean status) {
        this.status = status;
    }
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
