package nivell2.exercici3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompareArraysTest {

    int[] array1 = {1, 2, 3};
    int[] array2 = {1, 2, 3};
    int[] array3 = {1, 1, 1};

    @Test
    public void givenTwoIdenticalIntArrays_whenCompared_thenTheyAreEqual() {
        assertThat(array1).isEqualTo(array2);

    }

    @Test
    public void givenTwoDifferentIntArrays_whenCompared_thenTheyAreNotEqual(){

        assertThat(array1).isNotEqualTo(array3);
    }

}
