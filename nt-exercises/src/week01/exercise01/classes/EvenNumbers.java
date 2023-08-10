package week01.exercise01.classes;

public class EvenNumbers {
    private int numbers;

    public void print(int numbers) {
        for (int i = 0; i <= numbers; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println("|-------------------------------------------|");
        System.out.println("| Estes são os números pares entre 0 e " + numbers + ". |");
        System.out.println("|-------------------------------------------|");
    }
}
