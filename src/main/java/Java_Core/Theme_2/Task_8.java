package Java_Core.Theme_2;

import java.math.BigInteger;

/**
 * Реализуйте метод, вычисляющий факториал заданного натурального числа.
 */

public class Task_8 {

    public static BigInteger factorial(int value) {
        final BigInteger VALUE = BigInteger.valueOf(value);
        BigInteger result = BigInteger.ONE;

        for (BigInteger a = BigInteger.ONE; a.compareTo(VALUE) <= 0;
             a = a.add(BigInteger.ONE)) {
            result = result.multiply(a);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
