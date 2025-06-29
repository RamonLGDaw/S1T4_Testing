package nivell2.exercici3.utils;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CompareArraysTest {
    int[] array1 = {1, 2, 3};
    int[] array2 = {1, 2, 3};
    int[] array3 = {1, 1, 1};

    CompareArrays compareArrays = new CompareArrays();

    @Test
    public void returnsTrueWhenArraysAreEqual() {

        assertThat(compareArrays.isSameArray(array1, array2)).isTrue();

    }

    @Test
    public void returnsFalseWhenArraysAreNotEqual(){

        assertThat(compareArrays.isSameArray(array1, array3)).isFalse();
    }


}
