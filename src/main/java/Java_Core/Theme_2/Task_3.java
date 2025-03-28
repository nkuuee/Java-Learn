package Java_Core.Theme_2;

/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 */

public class Task_3 {

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 0.0001;
    }

    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1, 0.2, 0.3));
    }
}
