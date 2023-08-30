package week02.exercise02;

import week02.exercise02.utils.EncoderDecoder;

import java.util.Scanner;

public class CaesarCipher {

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
            result = EncoderDecoder.encrypt(messageOrWord, change);
        } else if (option == 2) {
            result = EncoderDecoder.decrypt(messageOrWord, change);
        } else {
            System.out.println("--------------------------------------");
            System.out.println(" Escolha uma opção válida entre 1 e 2 \n E tente novamente...");
            System.out.println("--------------------------------------");
            return;
        }

        System.out.println("Resultado: " + result.toLowerCase());
    }
}
