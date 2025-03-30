package bookstore.abstractfactory;

import bookstore.services.BookService;
import bookstore.services.UserService;

public interface ServicesAbstractFactory {
    UserService getUserService();

    BookService getBookService();
}
