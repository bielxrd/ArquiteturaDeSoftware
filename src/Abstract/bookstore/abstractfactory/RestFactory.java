package bookstore.abstractfactory;

import bookstore.services.BookRestService;
import bookstore.services.BookService;
import bookstore.services.UserRestService;
import bookstore.services.UserService;

public class RestFactory implements ServicesAbstractFactory{
    @Override
    public UserService getUserService() {
        return new UserRestService();
    }

    @Override
    public BookService getBookService() {
        return new BookRestService();
    }
}
