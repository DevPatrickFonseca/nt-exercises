package week02.exercise04.classes;

import week02.exercise04.interfaces.User;

public class PremiumUser implements User {
    private double discount;

    @Override
    public double getDiscountValue(double productValue) {
        double discount = 0;
        if (productValue > 200) {
            discount = productValue * 0.3;
        }
        return discount;
    }

    @Override
    public String getUserType() {
        return "PREMIUM";
    }

    @Override
    public double getDiscountShippingCost(double shippingCost, double productValue) {
        if (productValue > 100) {
            return shippingCost = 0;
        }

        return shippingCost;
    }
}
