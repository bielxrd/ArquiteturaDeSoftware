package Template.bestbuy.after.service.template;

import Template.bestbuy.after.model.Cart;

import java.util.Calendar;
import java.util.Date;

public class BlackFriday extends BestBuyOfferTemplate {

    public BlackFriday(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isApplicable() {
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new Date());
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int blackFridayMonth = Calendar.NOVEMBER;
        int blackFridayDay = 29;

        if (month != blackFridayMonth) {
            return false;
        }

        return day == blackFridayDay;
    }

    @Override
    protected void calibrateVariables() {
        priceFactor = 0.75d;
    }
}
