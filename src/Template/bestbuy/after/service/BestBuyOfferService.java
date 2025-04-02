package Template.bestbuy.after.service;

import Template.bestbuy.after.model.Cart;
import Template.bestbuy.after.service.template.*;

import java.util.ArrayList;
import java.util.List;

public class BestBuyOfferService {
    private List<BestBuyOfferTemplate> templates;

    private void loadTemplates(Cart cart) {
        templates = new ArrayList<BestBuyOfferTemplate>();
        templates.add(new RegularPrice(cart));
        templates.add(new FreeDelivery(cart));
        templates.add(new BigCartDiscounts(cart));
        templates.add(new SpecialClient(cart));
        templates.add(new CategoryDiscounts(cart));
        templates.add(new BlackFriday(cart));
    }

    public void calculateBestOffer(Cart cart) {
        loadTemplates(cart);
        Double bestOffer = Double.MAX_VALUE;
        for(BestBuyOfferTemplate template: templates) {
            if(template.isApplicable()) {
                Double currentPrice = template.calculateOffer(cart);
                System.out.println(String.format("%s: %.2f", template.getClass().getSimpleName(), currentPrice));
                bestOffer = (bestOffer > currentPrice)? currentPrice: bestOffer;
            }
        }
        System.out.println(String.format("Final Price: %.2f", bestOffer));
    }

}
