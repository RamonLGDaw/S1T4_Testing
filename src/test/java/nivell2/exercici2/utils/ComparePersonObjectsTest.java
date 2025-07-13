package nivell2.exercici2.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ComparePersonObjectsTest {

    PersonModel person1 = new PersonModel("Marta");
    PersonModel person2 = person1;
    PersonModel person3 = new PersonModel("Marta");

    @Test
    void givenSameReference_whenCompared_thenIsSame() {
        assertThat(person1).isSameAs(person2);
    }

    @Test
    void givenDifferentInstances_whenCompared_thenIsNotSame() {
        assertThat(person1).isNotSameAs(person3);
    }
}
