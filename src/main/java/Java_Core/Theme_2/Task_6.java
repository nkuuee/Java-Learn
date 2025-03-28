package Java_Core.Theme_2;

/**
 * Реализуйте метод, проверяющий, является ли заданное число
 * по абсолютной величине степенью двойки.
 */

public class Task_6 {

    public static boolean isPowerOfTwo(int value) {
        return (value % 2 == 0 && value != 0 || value == 1);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
    }
}
