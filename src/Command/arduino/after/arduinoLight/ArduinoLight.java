package Command.arduino.after.arduinoLight;

import Command.arduino.after.commands.Command;

import java.util.HashMap;
import java.util.Map;

public class ArduinoLight {
    private Map<String, Command> integrations;
    private ArduinoResolver arduinoResolver;

    public ArduinoLight() {
        integrations = new HashMap<>();
        arduinoResolver = new ArduinoResolver();
    }

    public void addIntegration(String key, Command command, String... keywords) {
        integrations.put(key, command);
        arduinoResolver.addAssociation(key, keywords);
    }

    public void sendRequest(String request) {
        Command command = integrations.get(request);
        if (command == null) {
            String key  = arduinoResolver.getFindAssociations(request);
            command = integrations.get(key);
            if (command == null) {
                System.out.println("Sorry, I can't find the command for this request.");
                return;
            }
        }
        System.out.println("Executing command for request: " + request);
        command.execute();
    }
}
