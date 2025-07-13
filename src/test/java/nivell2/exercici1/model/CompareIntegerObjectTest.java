package nivell2.exercici1.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CompareIntegerObjectTest {

    @Test
    void testIntegersObjectsAreEqual() {

        IntegerModel value1 = new IntegerModel(1);
        IntegerModel value2 = new IntegerModel(1);

        assertThat(value1).isEqualTo(value2);
    }

    @Test
    void testIntegersObjectsAreNotEqual() {
        IntegerModel value1 = new IntegerModel(1);
        IntegerModel value2 = new IntegerModel(2);

        assertThat(value1).isNotEqualTo(value2);
    }

}
