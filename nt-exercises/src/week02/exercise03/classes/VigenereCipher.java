package week02.exercise03.classes;

import week02.exercise03.utils.DecoderVigenere;
import week02.exercise03.utils.EncoderVigenere;

import java.util.Scanner;

public class VigenereCipher {
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
            result = EncoderVigenere.encrypt(messageOrWord, keyword);
        } else if (option == 2) {
            result = DecoderVigenere.decrypt(messageOrWord, keyword);
        } else {
            System.out.println("--------------------------------------");
            System.out.println(" Escolha uma opção válida entre 1 e 2 \n E tente novamente...");
            System.out.println("--------------------------------------");
            return;
        }

        System.out.println("Resultado: " + result);
    }
}
