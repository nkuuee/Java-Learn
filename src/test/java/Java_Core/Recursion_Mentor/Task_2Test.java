package Java_Core.Recursion_Mentor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_2Test {

    @Test
    void isPalindrome() {
        assertEquals(true, Task_2.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(true, Task_2.isPalindrome("racecar"));
        assertEquals(false, Task_2.isPalindrome("Java"));
        assertEquals(true, Task_2.isPalindrome("Race:Car"));
    }
}