package nivell2.exercici1.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CompareIntegersTest {

    CompareIntegers compareIntegers = new CompareIntegers();

    @Test
    public void isSameIntegerTest(){

        assertThat(compareIntegers.compareIntegers(3,3)).isTrue();

    }

    @Test
    public void isNotSameIntegerTest(){

        assertThat(compareIntegers.compareIntegers(3,2)).isFalse();

    }

}
