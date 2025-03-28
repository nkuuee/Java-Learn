package Java_Core.Theme_2;

/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE
 * после символа "\" (обратный слэш) на расстоянии a.
 */

public class Task_5 {

    public char charExpression(int a) {
        final char c = '\\';
        int b;
        int result = ((b = (int) c) + (b += a) + ((char) b));
        return (char) b;
    }

    public static void main(String[] args) {
        Task_5 t5 = new Task_5();
        System.out.println(t5.charExpression(29));
    }
}
