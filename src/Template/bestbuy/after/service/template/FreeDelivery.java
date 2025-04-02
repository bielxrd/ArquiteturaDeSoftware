package Template.bestbuy.after.service.template;


import Template.bestbuy.after.model.Cart;

public class FreeDelivery extends BestBuyOfferTemplate {

    public FreeDelivery(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isApplicable() {
        return regularItemsPrice > 500;
    }

    @Override
    protected void calibrateVariables() {
        deliveryFactor = 0d;
    }
}
