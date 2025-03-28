package Java_Core.Theme_2;

/**
 * Реализуйте метод, возвращающий true, если среди четырех его аргументов
 * ровно два истинны (любые). Во всех остальных случаях
 * метод должен возвращать false.
 */

public class Task_1 {

    public boolean FindMe(boolean a, boolean b, boolean c, boolean d) {
        int result = 0;

        if (a == true) result++;
        if (b == true) result++;
        if (c == true) result++;
        if (d == true) result++;

        return result == 2 ? true : false;
    }

    public static void main(String[] args) {
        Task_1 t1 = new Task_1();
        System.out.println(t1.FindMe(true, true, true, false));
    }
}
