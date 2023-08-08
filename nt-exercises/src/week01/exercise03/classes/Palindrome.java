package week01.exercise03.classes;

public class Palindrome {
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean isPalindrome(String word) {
        String wordReverse = "";
        for (int charIndex = (word.length() - 1); charIndex >= 0; charIndex--) {
            wordReverse = wordReverse + word.charAt(charIndex);
        }
        return word.equals(wordReverse);
    }

    public void print(String word) {
        System.out.println(isPalindrome(word) ? word + " é um palíndromo!" : word + " NÃO é um palíndromo!");
    }
}
