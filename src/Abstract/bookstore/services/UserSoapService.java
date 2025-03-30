package bookstore.services;

public class UserSoapService implements UserService {
    @Override
    public void save(String name) {
        System.out.println("Saving " + name + " through SOAP's interface");

    }

    @Override
    public boolean delete(Integer id) {
        System.out.println("Removing User #" + id + " through SOAP's interface");
        return true;
    }
}
