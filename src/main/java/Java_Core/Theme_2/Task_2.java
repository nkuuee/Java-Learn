package Java_Core.Theme_2;

/**
 * В Григорианском календаре год является високосным в двух случаях: либо он кратен 4,
 * но при этом не кратен 100, либо кратен 400. Реализуйте метод, вычисляющий количество
 * високосных лет с начала нашей эры(первого года)
 */

public class Task_2 {

    public int leapYearCount(int Year) {
        return (Year / 4) - (Year / 100) + (Year / 400);
    }

    public static void main(String[] args) {
        Task_2 t2 = new Task_2();
        System.out.println(t2.leapYearCount(2025));
    }
}

