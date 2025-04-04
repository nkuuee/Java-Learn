package Java_Core.Recursion_Mentor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_2Test {

    @Test
    void isPalindrome() {
        assertFalse(Task_2.isPalindrome("Java"));
        assertFalse(Task_2.isPalindrome("Race:far")); //Ошибка
    }

    @Test
    void isPalindrome1() {
        assertTrue(Task_2.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(Task_2.isPalindrome("racecar"));

    }
}