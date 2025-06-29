package nivell2.exercici6.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    public void testIndexOutOfBoundsException() {
        ArrayUtils arrayManagment = new ArrayUtils();
        int[] array1 = {1, 2, 3, 4};

        assertThatThrownBy(() -> arrayManagment.getElementAtIndex(array1, 4))
                .isInstanceOf(IndexOutOfBoundsException.class);
    }
}
