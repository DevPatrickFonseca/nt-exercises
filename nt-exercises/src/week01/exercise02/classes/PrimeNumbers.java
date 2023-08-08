package week01.exercise02.classes;

public class PrimeNumbers {
    private int countNumbers;
    private int isPrime;
    private int divideNumbers;

    public int getCountNumbers() {
        return countNumbers;
    }

    public void setCountNumbers(int countNumbers) {
        this.countNumbers = countNumbers;
    }

    public int getIsPrime() {
        return isPrime;
    }

    public void setIsPrime(int isPrime) {
        this.isPrime = isPrime;
    }

    public int getDivideNumbers() {
        return divideNumbers;
    }

    public void setDivideNumbers(int divideNumbers) {
        this.divideNumbers = divideNumbers;
    }

    public void print() {
        for (countNumbers = 2; countNumbers < 1000; countNumbers++) {
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
        System.out.println("| Estes são os números Primos entre 0 e 1000. |");
        System.out.println("|---------------------------------------------|");
    }
}
