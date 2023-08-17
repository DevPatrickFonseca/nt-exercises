package week02.exercise04.test;

import week02.exercise04.classes.BasicUser;
import week02.exercise04.classes.PremiumUser;
import week02.exercise04.classes.StandardUser;
import week02.exercise04.utils.DisplayTotals;

public class UserTest {
    public static void main(String[] args) {
        DisplayTotals displayTotals = new DisplayTotals();

        BasicUser basicUser = new BasicUser();
        StandardUser standardUser = new StandardUser();
        PremiumUser premiumUser = new PremiumUser();

        double productValue = 500;
        double shippingCost = 75;

        displayTotals.printDetails(basicUser, shippingCost, productValue);
        displayTotals.printDetails(standardUser, shippingCost, productValue);
        displayTotals.printDetails(premiumUser, shippingCost, productValue);
        System.out.println("-----------------------------------");
    }
}
