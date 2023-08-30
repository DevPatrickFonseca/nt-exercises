package week02.exercise04.classes;

import week02.exercise04.interfaces.User;

public class BasicUser implements User {
    private double discount;


    @Override
    public double getDiscountValue(double productValue) {
        double discount = 0;
        if (productValue > 300) {
            discount = productValue * 0.05;
        }
        return discount;
    }

    @Override
    public String getUserType() {
        return "BASE";
    }

    @Override
    public double getDiscountShippingCost(double shippingCost, double productValue) {
        if (productValue > 300) {
            return Math.max(0, shippingCost * 0.95 - discount);
        }

        return Math.max(0, productValue - shippingCost);
    }
}
