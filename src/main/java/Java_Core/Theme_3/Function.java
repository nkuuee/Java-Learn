package Java_Core.Theme_3;

import java.util.function.DoubleUnaryOperator;

public class Function {

    public static double integrate(DoubleUnaryOperator f, double a, double b) {

        double sum = 0.0;
        double step = 1e-6;

        for (double x = a; x < b; x+=step) {
            sum += f.applyAsDouble(x) * step;
        }


        return sum;
    }

    public static void main(String[] args) {

        System.out.println(integrate(x -> 1, 0, 10));
    }
}
