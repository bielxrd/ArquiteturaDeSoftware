package bookstore.services;

public class BookRestService implements BookService {
    @Override
    public void save(String model) {
        System.out.println("Saving " + model + " book through Rest's interface");

    }

    @Override
    public void update(String newModel) {
        System.out.println("Updating " + newModel + " book through Rest's interface");

    }
}
