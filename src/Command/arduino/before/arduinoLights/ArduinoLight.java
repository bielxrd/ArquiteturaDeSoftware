package Command.arduino.before.arduinoLights;

import Command.arduino.before.rooms.GirlLivingRoom;
import Command.arduino.before.rooms.KitchenRoom;

import java.util.HashMap;
import java.util.Map;

public class ArduinoLight {
    private Map<String, Object> integrations;

    public ArduinoLight() {
        this.integrations = new HashMap<String, Object>();
        integrations.put("KitchenRoom", new KitchenRoom());
        integrations.put("LivingRoomLight", new GirlLivingRoom());
    }

    public void sendRequest(String request) {
        if (request.equals("Turn on the Living Room light")) {
            System.out.println("Turning on the Living room light");
            GirlLivingRoom light = (GirlLivingRoom) integrations.get("LivingRoomLight");
            light.turnOn();
        } else if (request.equals("Turn off the Living Room light")) {
            System.out.println("Turning off the Living room light");
            GirlLivingRoom light = (GirlLivingRoom) integrations.get("LivingRoomLight");
            light.turnOff();
        } else if (request.equals("Turn on the Kitchen light")) {
            System.out.println("Turning on the Kitchen light");
            KitchenRoom light = (KitchenRoom) integrations.get("KitchenRoom");
            light.turnOn();
        } else if (request.equals("Turn off the Kitchen light")) {
            System.out.println("Turning off the Kitchen light");
            KitchenRoom light = (KitchenRoom) integrations.get("KitchenRoom");
            light.turnOff();
        } else {
            System.out.println("Invalid request");
        }

    }

}
