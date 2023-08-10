package week01.exercise03.classes;

public class Palindrome {
    private String word;

    public boolean isPalindrome(String word) {
        String wordReverse = "";
        for (int charIndex = (word.length() - 1); charIndex >= 0; charIndex--) {
            wordReverse = wordReverse + word.charAt(charIndex);
        }
        return word.equals(wordReverse.toLowerCase());
    }

    public void print(String word) {
        System.out.println(isPalindrome(word.toLowerCase()) ? word + " é um palíndromo!" : word + " NÃO é um palíndromo!");
    }
}
