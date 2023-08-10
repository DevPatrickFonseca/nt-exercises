package week01.exercise02.classes;

public class PrimeNumbers {
    private int countNumbers;
    private int isPrime;
    private int divideNumbers;

    public void print(int number) {
        for (countNumbers = 2; countNumbers < number; countNumbers++) {
            isPrime = 0;
            for (divideNumbers = 2; divideNumbers < countNumbers; divideNumbers++) {
                if (countNumbers % divideNumbers == 0) {
                    isPrime = 1;
                }
            }
            if (isPrime != 1) {
                System.out.println(countNumbers);
            }
        }
        System.out.println("|---------------------------------------------|");
        System.out.println("| Estes são os números Primos entre 0 e " + number + ". |");
        System.out.println("|---------------------------------------------|");
    }
}
