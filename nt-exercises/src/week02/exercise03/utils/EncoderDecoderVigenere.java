package week02.exercise03.utils;

import week02.exercise03.VigenereCipher;

import java.text.Normalizer;

public class EncoderDecoderVigenere extends VigenereCipher {
    private static final int AMOUNT_CHARS_IN_ALPHABET = 26;

    public static String decrypt(String encryptedMessageOrWord, String keyword) {
        return processMessage(encryptedMessageOrWord, keyword, false);
    }

    public static String encrypt(String messageOrWord, String keyword) {
        return processMessage(messageOrWord, keyword, true);
    }

    private static String processMessage(String messageOrWord, String keyword, boolean encrypt) {
        StringBuilder processedMessage = new StringBuilder();
        String messageOrWordNormalized = Normalizer.normalize(messageOrWord, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        messageOrWord = messageOrWordNormalized.replaceAll("\\s+", "").toUpperCase();
        keyword = keyword.toUpperCase();

        for (int i = 0; i < messageOrWord.length(); i++) {
            char currentChar = messageOrWord.charAt(i);
            char currentKeyword = keyword.charAt(i % keyword.length());

            if (currentChar >= 'A' && currentChar <= 'Z') {
                int offset = encrypt ? (currentKeyword - 'A') : (AMOUNT_CHARS_IN_ALPHABET - (currentKeyword - 'A'));
                int processedChar = (currentChar + offset - 'A') % AMOUNT_CHARS_IN_ALPHABET + 'A';
                processedMessage.append((char) processedChar);
            }
        }
        return processedMessage.toString();
    }
}
