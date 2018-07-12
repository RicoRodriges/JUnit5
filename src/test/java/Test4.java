import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;

class Test4 {

    @Test
    void test1() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    throw new IllegalArgumentException("что-то пошло не так");
                }
        );

        assertEquals("что-то пошло не так", exception.getMessage());
    }

    @Test
    void timeoutNotExceededWithResult() {
        String actualResult = assertTimeout(ofSeconds(1), () -> {
            TimeUnit.SECONDS.sleep(3);
            return "a result";
        });
        assertEquals("a result", actualResult);
    }
}
