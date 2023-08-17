package week02.exercise03.utils;

import week02.exercise03.classes.VigenereCipher;

import java.text.Normalizer;

public class EncoderVigenere extends VigenereCipher {
    private static final int AMOUNT_CHARS_IN_ALPHABET = 26;

    public static String encrypt(String messageOrWord, String keyword) {
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
}
