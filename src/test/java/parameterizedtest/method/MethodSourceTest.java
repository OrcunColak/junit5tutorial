package parameterizedtest.method;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@Slf4j
class MethodSourceTest {

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWithExplicitLocalMethodSource(String value) {
        log.info("Value is \"{}\"", value);
    }

    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana");
    }
}
