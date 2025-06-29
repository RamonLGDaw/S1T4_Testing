package nivell2.exercici7.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OptionalEmptyTest {

    @Test
    public void optionalIsEmpty() {
        OptionalEmpty optionalEmpty = new OptionalEmpty();

        assertThat(optionalEmpty.getEmptyOptional()).isEmpty();
    }
}
