package Java_Core.Theme_2;

/**
 * Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
 */

public class Task_7 {

    public static boolean isPalindrome(String text) {
        String text1 = text.replaceAll("[^a-zA-Z0-9]", "");
        String textReverse = new StringBuilder(text1).reverse().toString();

        return text1.equalsIgnoreCase(textReverse);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
}
