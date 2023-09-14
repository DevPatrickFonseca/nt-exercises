package week01.exercise01;

public class EvenNumbers {
    public void print(int numbers) {
        StringBuilder number = new StringBuilder();
        for (int i = 0; i <= numbers; i++) {
            if (i % 2 == 0) {
                number.append(i + " ");
            }
        }
        System.out.println(number);

        System.out.println("|-------------------------------------------|");
        System.out.println("| Estes são os números pares entre 0 e " + numbers + ". |");
        System.out.println("|-------------------------------------------|");
    }
}
