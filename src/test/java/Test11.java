import org.junit.jupiter.api.Test;

class Test11 implements MyInterface {

    @Override
    public String getString() {
        return "hello";
    }
}

interface MyInterface {

    String getString();

    @Test
    default void test1() {
        System.out.println(getString());
    }
}