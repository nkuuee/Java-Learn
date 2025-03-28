package Java_Core.Theme_2;

/**
 * Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
 */

public class Task_7 {

    public static boolean isPalindrome(String text) {
        text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();
        String text1 = stringBuilder.toString();
        text1.replaceAll("[^a-zA-Z0-9]", "");

        return text.equalsIgnoreCase(text1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
}
