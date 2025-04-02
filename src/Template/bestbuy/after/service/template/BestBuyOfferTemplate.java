package Template.bestbuy.after.service.template;

import Template.bestbuy.after.model.Cart;

public abstract class BestBuyOfferTemplate {
    protected Cart cart;
    protected Double regularItemsPrice;
    protected Double deliveryFax;
    protected Double priceFactor;
    protected Double deliveryFactor;

    public BestBuyOfferTemplate(Cart cart) {
        this.cart = cart;
        this.regularItemsPrice = calculateRegularItemsPrice();
        this.deliveryFax = calculateDeliveryTax();
        this.priceFactor = 1d;
        this.deliveryFactor = 1d;
    }

    private Double calculateDeliveryTax() {
        Integer distance = cart.getBuyer().getDistance();
        Double totalWeight = cart.getItems().stream()
                .reduce(0d, (acc, item) -> acc + item.getWeight(), Double::sum);
        return (distance * totalWeight) / 100;
    }

    private Double calculateRegularItemsPrice() {
        return cart.getItems().stream()
                .reduce(0d, (acc, item) -> acc + item.getValue(), Double::sum);
    }

    public Double calculateOffer(Cart cart) {
        calibrateVariables();

        return (regularItemsPrice * priceFactor) + (deliveryFax * deliveryFactor);
    }

    public abstract boolean isApplicable();
    protected abstract void calibrateVariables();
}
