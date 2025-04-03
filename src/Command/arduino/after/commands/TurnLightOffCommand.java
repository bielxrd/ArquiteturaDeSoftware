package Command.arduino.after.commands;

import Command.arduino.after.rooms.GenericRoom;

public class TurnLightOffCommand implements Command {

    private GenericRoom light;

    public TurnLightOffCommand(GenericRoom light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
