import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class Test6 {

    private int i = 0;

    @RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("Repeat!")
    void test() {
        System.out.println(++i);
    }

}
