package week02.exercise04;

import week02.exercise04.classes.BasicUser;
import week02.exercise04.classes.PremiumUser;
import week02.exercise04.classes.StandardUser;
import week02.exercise04.interfaces.User;
import week02.exercise04.utils.DisplayTotals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DisplayTotals displayTotals = new DisplayTotals();

        List<User> users = new ArrayList<>();
        users.add(new BasicUser());
        users.add(new StandardUser());
        users.add(new PremiumUser());

        double productValue = 500;
        double shippingCost = 75;

        for (User user : users) {
            displayTotals.printDetails(user, shippingCost, productValue);
        }

        System.out.println("-----------------------------------");
    }
}
