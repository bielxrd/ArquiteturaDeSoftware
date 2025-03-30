package bookstore.services;

public class BookSoapService implements BookService {
    @Override
    public void save(String model) {
        System.out.println("Saving " + model + " book through SOAP's interface");

    }

    @Override
    public void update(String newModel) {
        System.out.println("Updating " + newModel + " book through SOAP's interface");

    }
}
