package week01.exercise04;

import week01.exercise04.classes.Driver;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver(
                "Ayrton Senna",
                "123.456.789-01",
                "123.456-MG",
                34,
                "Piloto",
                7500,
                "123.456.7890",
                "BRA1B23"
        );
        Driver driver2 = new Driver(
                "Michael Schumacher",
                "123.456.789-01",
                "123.456-MG",
                54,
                "Piloto",
                7500,
                "123.456.7890",
                "GER1G23"
        );
        DisplayDriversSelectData(driver1);
        DisplayDriversSelectData(driver2);
        System.out.println("-------------------------");
    }

    public static void DisplayDriversSelectData(Driver driver) {
        System.out.println("-------------------------");
        System.out.println("Nome: " + driver.getNome());
        System.out.println("Cargo: " + driver.getCargo());
        System.out.println("Placa do Carro: " + driver.getPlacaCarro());
    }
}
