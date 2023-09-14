package week01.exercise06;

public class Main {
    public static void main(String[] args) {
        PaymentChange paymentChange = new PaymentChange();

        double cost = 7.35;
        double payment = 20;

        paymentChange.displayChange(cost,payment);
    }
}
