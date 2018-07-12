import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Test12 {

    @TestFactory
    Iterator<DynamicTest> translateDynamicTestsFromIterator() {

        List<String> inPhrases =
                new ArrayList<>(Arrays.asList("Hello", "Yes", "No", "Goodbye", "Good night", "Thank you"));

        return inPhrases.stream()
                .map(
                        phrs ->
                                DynamicTest.dynamicTest("Test translate " + phrs, () -> {/*TEST*/})
                )
                .iterator();
    }
}
