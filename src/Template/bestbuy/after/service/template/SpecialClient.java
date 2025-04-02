package Template.bestbuy.after.service.template;


import Template.bestbuy.after.model.Cart;

public class SpecialClient extends BestBuyOfferTemplate {
    public SpecialClient(Cart cart) {
        super(cart);
    }

    /**
     * @return
     */
    @Override
    public boolean isApplicable() {
        return cart.getBuyer().isSpecialClient();
    }

    /**
     *
     */
    @Override
    protected void calibrateVariables() {
        priceFactor = 0.85D;
        deliveryFactor = 0.5;
    }
}
