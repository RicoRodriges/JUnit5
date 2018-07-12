import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Test8 {

    @ParameterizedTest
    @ValueSource(strings = {"Hello ", "World"})
    void testWithStringParameter(String argument) {
        System.out.print(argument);
    }

    @ParameterizedTest
    @CsvSource({"foo, 1", "'bar ', 2", "'foo and bar ', 3"})
    void testWithCsvSource(String first, int second) {
        System.out.print(first);
        System.out.println(second);
    }

    @ParameterizedTest
    @EnumSource(value = TimeUnit.class, names = {"DAYS", "HOURS"})
    void testWithEnumSourceInclude(TimeUnit timeUnit) {
        assertTrue(EnumSet.of(TimeUnit.DAYS, TimeUnit.HOURS).contains(timeUnit));
    }
}
