package week02.exercise01.classes;

public class FactorialCalculator {
    private double number;

    public static String calculateFactorial(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Insira um número positivo");
        }

        double factorialNumber = 1;
        for (int i = 1; i <= number; i++) {
            factorialNumber *= i;
        }

        return "O fatorial de " + number + " é " + factorialNumber;
    }

    public void print(double number) {
        String resultFactorial = FactorialCalculator.calculateFactorial(number);
        System.out.println("\n " + "--->  " + resultFactorial + "  <---");
    }
}
