package nivell2.exercici5.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MapClassTest {

    @Test
    public void givenMapWithValues_whenCheckingForSpecificKey_thenItIsPresent() {

        MapClass nameAgeMap = new MapClass();
        nameAgeMap.enterValues("Joan", 32);
        nameAgeMap.enterValues("Mònica", 30);
        nameAgeMap.enterValues("Marta", 43);

        assertThat(nameAgeMap.getMap()).containsKey("Marta");
    }
}