package week02.exercise02.utils;

import week02.exercise02.classes.CaesarCipher;

import java.text.Normalizer;

public class EncoderDecoder extends CaesarCipher {
    public static String encrypt(String messageOrWord, int change) {
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

    public static String decrypt(String encryptedMessageOrWord, int change) {
        String messageOrWord = Normalizer.normalize(encryptedMessageOrWord, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        return encrypt(messageOrWord, 26 - change);
    }
}
