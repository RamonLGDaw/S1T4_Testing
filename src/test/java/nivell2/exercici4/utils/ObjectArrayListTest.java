package nivell2.exercici4.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ObjectArrayListTest {

    private ObjectArrayList objectArrayList;

    @BeforeEach
    public void setup() {
        objectArrayList = new ObjectArrayList();
        objectArrayList.addObject("hello");
        objectArrayList.addObject(1234);
        objectArrayList.addObject(true);
    }


    @Test
    public void objectsAreInInsertionOrder() {
        assertThat(objectArrayList.getObjectsArray()).containsExactly("hello", 1234, true);
    }


    @Test
    public void objectsArePresentInAnyOrder() {
        assertThat(objectArrayList.getObjectsArray()).contains("hello", 1234, true);
    }


    @Test
    public void objectIsAddedOnlyOnce() {
        assertThat(objectArrayList.getObjectsArray())
                .filteredOn(object -> object.equals(1234))
                .hasSize(1);
    }


    @Test
    public void objectIsNotPresent() {
        assertThat(objectArrayList.getObjectsArray()).doesNotContain("goodbye");
    }
}
