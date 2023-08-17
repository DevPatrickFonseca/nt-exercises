package week02.exercise03.utils;

import week02.exercise03.classes.VigenereCipher;

import java.text.Normalizer;

public class DecoderVigenere extends VigenereCipher {
    private static final int AMOUNT_CHARS_IN_ALPHABET = 26;

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
}
