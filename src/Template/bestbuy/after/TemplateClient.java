package Template.bestbuy.after;

import Template.bestbuy.after.model.Buyer;
import Template.bestbuy.after.model.Cart;
import Template.bestbuy.after.model.Category;
import Template.bestbuy.after.model.Product;
import Template.bestbuy.after.service.BestBuyOfferService;

import java.util.Arrays;

public class TemplateClient {
    public static void main(String[] args) {
        Buyer simpleBuyer1 = new Buyer("Simple #1", 1500, false);
        Buyer simpleBuyer2 = new Buyer("Simple #2", 3000, false);
        Buyer specialBuyer = new Buyer("Special #1", 500, true);
        Buyer specialBuyer2 = new Buyer("Special #2", 3000, true);

        Product notebook = new Product("Notebook", 999.99d, Category.ELETRONICS, 10d);
        Product shoes = new Product("Ultra Runnins shoes", 200d, Category.SPORTS, 1.25d);
        Product shorts = new Product("Denim shorts", 20d, Category.CLOTHES, 0.5d);
        Product mouse = new Product("Mouse", 10d, Category.ELETRONICS, 0.2d);

        Cart cart1 = new Cart(simpleBuyer1, Arrays.asList(notebook, shoes, shorts, mouse));
        Cart cart2 = new Cart(simpleBuyer2, Arrays.asList(notebook, shoes, shorts, mouse));
        Cart cart3 = new Cart(specialBuyer, Arrays.asList(notebook, shoes, shorts, mouse));
        Cart cart4 = new Cart(specialBuyer2, Arrays.asList(notebook, shoes, shorts, mouse));
        Cart cart5 = new Cart(specialBuyer2, Arrays.asList(notebook));
        Cart cart6 = new Cart(specialBuyer2, Arrays.asList(shorts));

        BestBuyOfferService service = new BestBuyOfferService();
        service.calculateBestOffer(cart1);
        System.out.println("--------------");
        service.calculateBestOffer(cart2);
        System.out.println("--------------");
        service.calculateBestOffer(cart3);
        System.out.println("--------------");
        service.calculateBestOffer(cart4);
        System.out.println("--------------");
        service.calculateBestOffer(cart5);
        System.out.println("--------------");
        service.calculateBestOffer(cart6);
    }
}
