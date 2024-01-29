package parameterizedtest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * The following types can be provided as parameters for parameterized tests.
 * <p>
 * short
 * byte
 * int
 * long
 * float
 * double
 * char
 * boolean
 * java.lang.String
 * java.lang.Class
 */
@Slf4j
class ValueSourceTest {

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba" , " ", "   ", "\t", "\n"})
    void testStrings(String value) {
        log.info("Value is {}", value);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testInts(int value) {
        log.info("Value is {}", value);
    }
}
