package Java_Core.Theme_2;

/**
 * Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
 */

public class Task_4 {

    public int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1));
    }

    public static void main(String[] args) {
        Task_4 t4 = new Task_4();
        System.out.println(t4.flipBit(0, 1));
    }
}
