package Java_Core.Recursion_Mentor;

public class Task_3 {

    public static long factorialTailRecursive(int n) {
        return factorialHelper(n, 1);
    }

    private static long factorialHelper(int n, long accumulator) {

        if (n == 0 || n == 1) {
            return accumulator;
        }

        return factorialHelper(n - 1, accumulator * n);
    }

    public static void main(String[] args) {
        System.out.println(factorialTailRecursive(5));
    }
}
