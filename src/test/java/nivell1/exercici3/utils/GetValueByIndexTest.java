package nivell1.exercici3.utils;

import nivell1.exercici3.util.StringArrayMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GetValueByIndexTest {

    private StringArrayMethod stringArrayMethod = new StringArrayMethod();
    private String[] stringArrayForTest = {"orange", "grape", "strawberry"};

    @Test
    public void returnStringValueByIndexTest() {

        assertEquals("strawberry", stringArrayMethod.getValueByIndex(stringArrayForTest, 2));
    }

    @Test
    public void returnStringValueByIndex_InvalidIndexThrowsException(){

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            stringArrayMethod.getValueByIndex(stringArrayForTest, 3);
        });
    }
}
