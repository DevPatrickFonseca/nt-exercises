package week02.exercise02.classes;

import java.text.Normalizer;
import java.util.Scanner;

public class CesarCipher {

    private static String encrypt(String messageOrWord, int change) {
        StringBuilder encryptedMessageOrWord = new StringBuilder();
        String messageOrWordNormalized = Normalizer.normalize(messageOrWord, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");

        for (char c : messageOrWordNormalized.toCharArray()) {
            if (Character.isLetter(c)) {
                char baseMessageOrWord = Character.isLowerCase(c) ? 'a' : 'A';
                char encryptedChar = (char) (baseMessageOrWord + (c - baseMessageOrWord + change) % 26);
                encryptedMessageOrWord.append(encryptedChar);
            } else {
                encryptedMessageOrWord.append(c);
            }
        }
        return encryptedMessageOrWord.toString();
    }

    private static String decrypt(String encryptedMessageOrWord, int change) {
        String messageOrWord = Normalizer.normalize(encryptedMessageOrWord, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        return encrypt(messageOrWord, 26 - change);
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma mensagem: ");
        String messageOrWord = scanner.nextLine();

        System.out.println("Digite o número de posições de deslocamento: ");
        int change = scanner.nextInt();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Criptografar");
        System.out.println("2 - Descriptografar");
        int option = scanner.nextInt();

        String result;
        if (option == 1) {
            result = CesarCipher.encrypt(messageOrWord, change);
        } else if (option == 2) {
            result = CesarCipher.decrypt(messageOrWord, change);
        } else {
            System.out.println("--------------------------------------");
            System.out.println(" Escolha uma opção válida entre 1 e 2 \n E tente novamente...");
            System.out.println("--------------------------------------");
            return;
        }

        System.out.println("Resultado: " + result.toLowerCase());
    }
}
