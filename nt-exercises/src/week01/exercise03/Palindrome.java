package week01.exercise03;

public class Palindrome {
    public boolean isPalindrome(String word) {
        String wordFormat = word.replace(" ", "").toLowerCase();
        StringBuilder wordReverse = new StringBuilder(wordFormat).reverse();

        return wordFormat.equals(wordReverse.toString());
    }

    public void print(String word) {
        System.out.println(isPalindrome(word) ? word + " é um palíndromo!" : word + " NÃO é um palíndromo!");
    }
}
