package nivell1.exercici2.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoDniTest {

    @ParameterizedTest
    @CsvSource({
            "00000000, 00000000T",
            "00000008, 00000008P",
            "00000001, 00000001R",
            "00000002, 00000002W",
            "00000003, 00000003A",
            "00000004, 00000004G",
            "00000005, 00000005M",
            "00000006, 00000006Y",
            "00000007, 00000007F",

    })
    public void testDniLetters(String dniNumber, String expectedResult) {

        DniCalculator calculoDni = new DniCalculator();
        assertEquals(expectedResult, calculoDni.calculateDniLetter(dniNumber));
    }
}
