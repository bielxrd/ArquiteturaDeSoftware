package Command.arduino.after.rooms;

public class GarageRoom implements GenericRoom {
    public void turnOn() {
        System.out.println("The light on garage room are ON!");
    }

    public void turnOff() {
        System.out.println("The light on garage room are OFF!");
    }
}
