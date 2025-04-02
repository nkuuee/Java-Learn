package Java_Core.Recursion_Mentor;

/**
 * Простая задача: Сумма цифр числа
 * Описание: Напишите рекурсивную функцию sumDigits(int n), которая принимает целое число n
 * и возвращает сумму его цифр.
 * Сигнатура метода: public static int sumDigits(int n)
 * Возвращаемое значение: int - сумма цифр числа n.
 * Пример:
 * sumDigits(123) == 6 (1 + 2 + 3)
 * sumDigits(4) == 4
 * sumDigits(999) == 27
 */

public class Task_1 {

    public static int sumDigits(int n) {

        if (n < 10) {
            return n;
        }

        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(999));
    }
}
