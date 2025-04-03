package Command.arduino.after.rooms;

public class BoyLivingRoom implements GenericRoom {
    public void turnOn() {
        System.out.println("The light on boy living room are ON!");
    }

    public void turnOff() {
        System.out.println("The light on boy living room are OFF!");
    }
}
