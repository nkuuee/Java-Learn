package Java_Core.Theme_4;

public class Task_1 {

    public static double sqrt(double x) throws IllegalArgumentException {

        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got ?");
        }

        return Math.sqrt(x);
    }

    public static void main(String[] args) {

        try {
            System.out.println(sqrt(-2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
