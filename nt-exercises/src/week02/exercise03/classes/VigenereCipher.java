package week02.exercise03.classes;

import java.text.Normalizer;
import java.util.Scanner;

public class VigenereCipher {
    private static final int AMOUNT_CHARS_IN_ALPHABET = 26;

    private static String encrypt(String messageOrWord, String keyword) {
        StringBuilder encryptedMessageOrWord = new StringBuilder();
        String messageOrWordNormalized = Normalizer.normalize(messageOrWord, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        messageOrWord = messageOrWordNormalized.replaceAll("\\s+", "").toUpperCase();
        keyword = keyword.toUpperCase();

        for (int i = 0; i < messageOrWord.length(); i++) {
            char currentChar = messageOrWord.charAt(i);
            char currentKeyword = keyword.charAt(i % keyword.length());

            if (currentChar >= 'A' && currentChar <= 'Z') {
                int encryptedChar = (currentChar + currentKeyword - 2 * 'A') % AMOUNT_CHARS_IN_ALPHABET + 'A';
                encryptedMessageOrWord.append((char) encryptedChar);
            }
        }
        return encryptedMessageOrWord.toString();
    }

    public static String decrypt(String encryptedMessageOrWord, String keyword) {
        StringBuilder decryptedMessageOrWord = new StringBuilder();
        String messageOrWordNormalized = Normalizer.normalize(encryptedMessageOrWord, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        String messageOrWord = messageOrWordNormalized.toUpperCase();
        keyword = keyword.toUpperCase();

        for (int i = 0; i < messageOrWord.length(); i++) {
            char currentChar = messageOrWord.charAt(i);
            char keywordChar = keyword.charAt(i % keyword.length());

            if (currentChar >= 'A' && currentChar <= 'Z') {
                int decryptedChar = (currentChar - keywordChar + AMOUNT_CHARS_IN_ALPHABET) % AMOUNT_CHARS_IN_ALPHABET + 'A';
                decryptedMessageOrWord.append((char) decryptedChar);
            }
        }

        return decryptedMessageOrWord.toString();
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma mensagem: ");
        String messageOrWord = scanner.nextLine();

        System.out.println("Digite a palavra chave: ");
        String keyword = scanner.nextLine();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Criptografar");
        System.out.println("2 - Descriptografar");
        int option = scanner.nextInt();

        String result = "";
        if (option == 1) {
            result = VigenereCipher.encrypt(messageOrWord, keyword);
        } else if (option == 2) {
            result = VigenereCipher.decrypt(messageOrWord, keyword);
        } else {
            System.out.println("--------------------------------------");
            System.out.println(" Escolha uma opção válida entre 1 e 2 \n E tente novamente...");
            System.out.println("--------------------------------------");
            return;
        }

        System.out.println("Resultado: " + result);
    }
}
