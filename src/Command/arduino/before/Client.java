package Command.arduino.before;

import Command.arduino.before.arduinoLights.ArduinoLight;

public class Client {
    public static void main(String[] args) {
        ArduinoLight arduinoLight = new ArduinoLight();
        arduinoLight.sendRequest("Turn on the Living Room light");
        arduinoLight.sendRequest("Turn off the Living Room light");
        arduinoLight.sendRequest("Turn on the Kitchen light");
        arduinoLight.sendRequest("Turn off the Kitchen light");
    }
}
