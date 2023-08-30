package week02.exercise04.classes;

import week02.exercise04.interfaces.User;

public class StandardUser implements User {
    private double discount;

    @Override
    public double getDiscountValue(double productValue) {
        double discount = 0;
        if (productValue > 200) {
            discount = productValue * 0.15;
        }
        return discount;
    }

    @Override
    public String getUserType() {
        return "STANDARD";
    }

    @Override
    public double getDiscountShippingCost(double shippingCost, double productValue) {
        if (productValue > 200) {
            return Math.max(0, shippingCost * 0.90 - discount);
        }

        return Math.max(0, productValue - shippingCost);
    }
}
