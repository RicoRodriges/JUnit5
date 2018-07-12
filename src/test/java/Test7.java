import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class Test7 {

    @Test
    @DisabledOnOs({OS.MAC, OS.LINUX})
    void test1() {
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void test2() {
    }

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    void test3() {
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "JAVA_HOME", matches = ".*development.*")
    void test4() {
    }

    @RepeatedTest(10)
    @DisabledIf("Math.random() < 0.314159")
    void mightNotBeExecuted() {
    }
}
