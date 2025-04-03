package Java_Core.Recursion_Mentor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_3Test {

    @Test
    void factorialTailRecursive() {
        assertEquals(1, Task_3.factorialTailRecursive(0));
        assertEquals(1, Task_3.factorialTailRecursive(1));
        assertEquals(120, Task_3.factorialTailRecursive(5));
    }
}