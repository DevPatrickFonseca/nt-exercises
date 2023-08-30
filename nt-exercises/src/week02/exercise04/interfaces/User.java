package week02.exercise04.interfaces;

public interface User {
    double getDiscountValue(double productValue);

    String getUserType();

    double getDiscountShippingCost(double shippingCost, double productValue);
}
