package ChainOfResponsability.process.repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private static Map<String, Object> memory;
    private static UserRepository userRepository = new UserRepository();

    public static UserRepository getInstance() {
        return userRepository;
    };

    private UserRepository() {
        Map<String, Object> user = new LinkedHashMap<>();
        user.put("name", "Gabriel Dias");
        user.put("email", "gabrieldias@gmail.com");
        user.put("password", "123456");
        memory = new LinkedHashMap<>();
        memory.put("user@email.com", user);
    }

    public Object getUserByEmail(String email) {
        return memory.get(email);
    }

    public List getUsers() {
        return new ArrayList(memory.values());
    }

    public void saveUser(Map<String, Object> user) {
        memory.put((String) user.get("email"), user);
    }
}
