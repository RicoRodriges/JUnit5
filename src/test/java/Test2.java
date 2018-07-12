import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test2 {

    @Test
    void test1() {
        assertEquals(1, 1,
                () -> {
                    System.out.print("ALARM1");
                    return " Error1";
                }
        );
    }

    @Test
    void test2() {
        assertEquals(1, 2,
                () -> {
                    System.out.print("ALARM2");
                    return " Error2";
                }
        );
    }
}
