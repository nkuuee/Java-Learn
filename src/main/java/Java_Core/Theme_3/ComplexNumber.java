package Java_Core.Theme_3;

/**
 * Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так,
 * чтобы equals() сравнивал экземпляры ComplexNumber по содержимому полей re и im,
 * а hashCode() был бы согласованным с реализацией equals().
 * Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im,
 * засчитана не будет
 */

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ComplexNumber obj1 = (ComplexNumber) obj;
        return Double.compare(obj1.re, re) == 0 && Double.compare(obj1.im, im) == 0;
    }

    @Override
    public int hashCode() {
        int result = 10;
        result = 37 * result + Double.hashCode(re);
        result = 37 * result + Double.hashCode(im);
        return result;
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1.0, 1.0);
        ComplexNumber b = new ComplexNumber(1.0, 1.0);
        System.out.println(a.equals(b));
    }
}