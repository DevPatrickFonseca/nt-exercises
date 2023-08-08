package week01.exercise04.test;

import week01.exercise04.classes.Drivers;

public class DriversTest {
    public static void main(String[] args) {
        Drivers driver1 = new Drivers("Ayrton Senna", "123.456.789-01", "123.456-MG", 34, "Piloto", 7500, "123.456.7890", "BRA1B23");
        Drivers driver2 = new Drivers("Michael Schumacher", "123.456.789-01", "123.456-MG", 54, "Piloto", 7500, "123.456.7890", "GER1G23");

        driver1.printDriverSelectedData(driver1);
        driver2.printDriverSelectedData(driver2);
        System.out.println("-------------------------");
    }
}
