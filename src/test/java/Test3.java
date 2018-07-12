import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class Test3 {

    @Test
    void test1() {
        assertAll(
                () -> assertEquals(1, 1),
                () -> assertEquals(2, 2),
                () -> assertEquals(2, 3)
        );
    }

    @Test
    void test2() {
        assertLinesMatch(
                asList("можно сравнивать строки", "а можно по regex: \\d{2}\\.\\d{2}\\.2018 июль"),
                asList("можно сравнивать строки", "а можно по regex: 13.07.2017 июль")

        );
    }
}
