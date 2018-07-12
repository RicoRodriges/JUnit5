import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Cool class name")
class Test5 {

    @Test
    @DisplayName("Cool test")
    @Disabled("IGNORED!!!")
    void skippedTest() {
    }
}
