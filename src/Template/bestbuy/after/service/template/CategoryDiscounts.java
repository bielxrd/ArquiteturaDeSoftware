package Template.bestbuy.after.service.template;


import Template.bestbuy.after.model.Cart;
import Template.bestbuy.after.model.Category;

import java.util.HashMap;
import java.util.Map;

public class CategoryDiscounts extends BestBuyOfferTemplate {

    Map<Category, Double> discountsByCategory;

    public CategoryDiscounts(Cart cart) {
        super(cart);
        loadDiscounts();
    }

    private void loadDiscounts() {
        discountsByCategory = new HashMap<>();
        discountsByCategory.put(Category.ELETRONICS, 0.3);
        discountsByCategory.put(Category.CLOTHES, 0.5);
        discountsByCategory.put(Category.SPORTS, 0.1);
    }

    @Override
    public boolean isApplicable() {
        return true;
    }

    @Override
    protected void calibrateVariables() {
        regularItemsPrice = cart.getItems().stream()
                .reduce(0d, (acc, item) ->
                                acc + (item.getValue() *
                                        (discountsByCategory.get(item.getCategory()) != null? 1 - discountsByCategory.get(item.getCategory()): 1d))
                        , Double::sum);
    }
}
