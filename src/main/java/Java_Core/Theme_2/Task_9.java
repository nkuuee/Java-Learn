package Java_Core.Theme_2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел
 * в один отсортированный в том же порядке массив. Массивы могут быть любой длины,
 * в том числе нулевой.
 */

public class Task_9 {

    public static int[] mergeArrays(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }

        return c;
    }

    public static void main(String[] args) {
        int[] a = {0, 2, 2};
        int[] b = {1, 3};
        System.out.println(Arrays.toString(mergeArrays(a, b)));
    }
}
