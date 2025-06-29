package nivell2.exercici2.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CompareObjectsTest {

    CompareObjects compareObjects = new CompareObjects();
    Object object1 = new Object();
    Object object2 = object1;
    Object object3 = new Object();

    @Test
    void isSameObjectTest() {
        assertThat(compareObjects.isSameObject(object1, object2)).isTrue();
    }

    @Test
    void isDifferentObjectTest() {
        assertThat(compareObjects.isSameObject(object1, object3)).isFalse();
    }
}
