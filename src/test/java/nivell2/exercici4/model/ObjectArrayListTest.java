package nivell2.exercici4.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ObjectArrayListTest {

    Item item1 = new Item("Llibre");
    Item item2 = new Item("Taula");
    Item item3 = new Item("Portàtil");
    Item item4 = new Item("Boli");


    @Test
    void givenList_whenCheckingInsertionOrder_thenOrderIsMaintained() {

        List<Item> itemList = new ArrayList<>(Arrays.asList(item1, item2, item3));

        assertThat(itemList).containsExactly(item1, item2, item3);

    }


    @Test
    void givenList_whenCheckingContentsInAnyOrder_thenTheyArePresent() {
        List<Item> itemList = new ArrayList<>(Arrays.asList(item1, item2, item3));

        assertThat(itemList).containsExactlyInAnyOrder(item3, item1, item2);
    }


    @Test
    void givenList_whenCheckingSingleOccurrence_thenItemAppearsOnlyOnce() {
        List<Item> itemList = new ArrayList<>(Arrays.asList(item1, item2, item3));

        assertThat(itemList).containsOnlyOnce(item2);
    }


    @Test
    void givenList_whenCheckingMissingItem_thenItemIsNotPresent() {
        List<Item> itemList = new ArrayList<>(Arrays.asList(item1, item2, item3));

        assertThat(itemList).doesNotContain(item4);
    }
}


