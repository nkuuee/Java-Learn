package Java_Core.Theme_4;

public class Task_2 extends Thread {

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();

        if (element.length > 3) {
            StackTraceElement caller = element[2];
            return caller.getClassName() + "#" + caller.getMethodName();
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }
}

