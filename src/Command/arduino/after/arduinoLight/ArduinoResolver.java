package Command.arduino.after.arduinoLight;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ArduinoResolver {

    private Map<String, String[]> associations;

    public ArduinoResolver() {
        associations = new HashMap<String, String[]>();
    }

    public void addAssociation(String key, String[] association) {
        associations.put(key, association);
    }

    public String getFindAssociations(String request) {
        for (String[] association : associations.values()) {
            if (Stream.of(association).allMatch(request::contains)) {
                return getKeyFromAssociation(association);
            }
        }

        return null;
    }

    private String getKeyFromAssociation(String... keywords) {
        return associations
                .entrySet()
                .stream()
                .filter(entry -> keywords.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst().get();
    }

}
