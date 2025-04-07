package Java_Core.Theme_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    @Test
    public void testEquals() {
        ComplexNumber cn = new ComplexNumber(1.0, 1.0);
        ComplexNumber cn1 = new ComplexNumber(1.0, 1.0);
        ComplexNumber cn2 = new ComplexNumber(2.0, 7.0);

        assertTrue(cn.equals(cn1));
        assertFalse(cn.equals(cn2));
    }

    @Test
    public void testHashCode() {
        ComplexNumber cn = new ComplexNumber(1.0, 3.0);
        ComplexNumber cn1 = new ComplexNumber(1.0, 3.0);

        assertEquals(cn.hashCode(), cn1.hashCode());
    }
}