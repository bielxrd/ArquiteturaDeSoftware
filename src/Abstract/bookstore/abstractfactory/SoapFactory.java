package bookstore.abstractfactory;

import bookstore.services.BookService;
import bookstore.services.BookSoapService;
import bookstore.services.UserService;
import bookstore.services.UserSoapService;

public class SoapFactory implements ServicesAbstractFactory {
    @Override
    public UserService getUserService() {
        return new UserSoapService();
    }

    @Override
    public BookService getBookService() {
        return new BookSoapService();
    }
}
