package Template.bestbuy.after.service.template;


import Template.bestbuy.after.model.Cart;

public class BigCartDiscounts extends BestBuyOfferTemplate {


     public BigCartDiscounts(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isApplicable() {
        return false;
    }

    @Override
    protected void calibrateVariables() {

    }
}
