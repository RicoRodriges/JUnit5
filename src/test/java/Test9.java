import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Test9 {

    @ParameterizedTest
    @ArgumentsSource(MyArgumentsProvider.class)
    void test1(Integer argument) {
        System.out.println(argument);
    }

    static class MyArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(2, 1, 3).map(Arguments::of);
        }
    }


    @ParameterizedTest
    @MethodSource("provideArguments")
    void test2(String arg1, Integer arg2) {
        System.out.print(arg1);
        System.out.println(arg2);
    }

    private static Stream<? extends Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("foo ", 1),
                Arguments.of("bar ", 2)
        );
    }
}
