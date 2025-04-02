package Template.bestbuy.after.service.template;


import Template.bestbuy.after.model.Cart;

public class RegularPrice extends BestBuyOfferTemplate {

    public RegularPrice(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isApplicable() {
        return true;
    }

    @Override
    protected void calibrateVariables() {
        // Nothing to ajust
    }
}
