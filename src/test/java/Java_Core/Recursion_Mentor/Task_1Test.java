package Java_Core.Recursion_Mentor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_1Test {

    @Test
    void sumDigits() {
        assertEquals(6, Task_1.sumDigits(123));
        assertEquals(4, Task_1.sumDigits(4));
        assertEquals(27, Task_1.sumDigits(999));
    }
}