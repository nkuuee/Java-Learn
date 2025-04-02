package Java_Core.Recursion_Mentor;

/**
 * Средняя задача: Проверка палиндрома
 * Описание: Напишите рекурсивную функцию isPalindrome(String s), которая принимает строку s
 * и возвращает true, если строка s является палиндромом (читается одинаково в обоих направлениях),
 * и false в противном случае. Игнорируйте пробелы и регистр букв.
 * Сигнатура метода: public static boolean isPalindrome(String s)
 * Возвращаемое значение: boolean - true, если строка s является палиндромом,
 * и false в противном случае.
 * Пример:
 * isPalindrome("racecar") == true
 * isPalindrome("A man, a plan, a canal: Panama") == true
 * isPalindrome("hello") == false
 */

public class Task_2 {

    public static Boolean isPalindrome(String s) {

        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (s.isEmpty() || s.length() == 1) {
            return true;
        }

        if (s1.charAt(0) == s1.charAt(s1.length() - 1)) {
            return isPalindrome(s1.substring(s1.length() - 1));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
