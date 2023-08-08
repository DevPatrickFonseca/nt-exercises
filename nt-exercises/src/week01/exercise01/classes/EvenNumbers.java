package week01.exercise01.classes;

public class EvenNumbers {
    private int numbers;

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public void print() {
        numbers = 100;

        for (int i = 0; i <= numbers; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println("|-------------------------------------------|");
        System.out.println("| Estes são os números pares entre 0 e 100. |");
        System.out.println("|-------------------------------------------|");
    }
}
