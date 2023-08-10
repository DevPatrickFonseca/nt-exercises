package week01.exercise06.test;

import week01.exercise06.classes.PaymentChange;

public class PaymentChangeTest {
    public static void main(String[] args) {
        PaymentChange paymentChange = new PaymentChange();

        double cost = 17.35;
        double payment = 20;

        paymentChange.displayChange(cost,payment);
    }
}
