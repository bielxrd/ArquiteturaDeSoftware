package Command.arduino.after.commands;

import Command.arduino.after.rooms.GenericRoom;

public class TurnLightOnCommand implements Command {

    public GenericRoom room;

    public TurnLightOnCommand(GenericRoom room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.turnOn();
    }
}
