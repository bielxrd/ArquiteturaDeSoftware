package bookstore;

import bookstore.abstractfactory.ServicesAbstractFactory;
import bookstore.abstractfactory.SoapFactory;
import bookstore.services.BookService;
import bookstore.services.UserService;

public class Client {
    public static void main(String[] args) {
        ServicesAbstractFactory factory = new SoapFactory();
//		ServicesAbstractFactory factory = new RestFactory();

        UserService userService = factory.getUserService();
        userService.save("GRAMOS");
        userService.delete(5);

        BookService carService = factory.getBookService();
        carService.save("Effective Java");
        carService.update("New Edition Effective Java");
    }
}
