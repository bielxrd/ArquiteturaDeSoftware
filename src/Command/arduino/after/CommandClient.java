package Command.arduino.after;

import Command.arduino.after.arduinoLight.ArduinoLight;
import Command.arduino.after.commands.TurnLightOffCommand;
import Command.arduino.after.commands.TurnLightOnCommand;
import Command.arduino.after.rooms.BoyLivingRoom;
import Command.arduino.after.rooms.GarageRoom;

public class CommandClient {
    public static void configureArduino(ArduinoLight arduinoLight) {
        BoyLivingRoom livingRoom = new BoyLivingRoom();
        GarageRoom garageRoom = new GarageRoom();

        arduinoLight.addIntegration("Turn on the Living Room light", new TurnLightOnCommand(livingRoom), "on", "Living Room", "light");
        arduinoLight.addIntegration("Turn off the Living Room light", new TurnLightOffCommand(livingRoom), "off", "Living Room", "light");
        arduinoLight.addIntegration("Turn on the Garage light", new TurnLightOnCommand(garageRoom), "on", "Garage", "light");
        arduinoLight.addIntegration("Turn off the Garage light", new TurnLightOffCommand(garageRoom), "off", "Garage", "light");


    }

    public static void main(String[] args) {
        ArduinoLight arduinoLight = new ArduinoLight();
        configureArduino(arduinoLight);

        arduinoLight.sendRequest("Turn on the Living Room light");
        arduinoLight.sendRequest("Turn off the Living Room light");

        arduinoLight.sendRequest("Turn on the Garage light");
        arduinoLight.sendRequest("Turn off the Garage light");

        arduinoLight.sendRequest("Please, could you Turn off the Living room light?");
    }
}
