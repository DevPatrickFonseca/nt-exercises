package week01.exercise03.test;

import week01.exercise03.classes.Palindrome;

public class PalindromeTest {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        String word = "Roma é Amor";
        palindrome.print(word);
    }
}
