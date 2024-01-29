package parameterizedtest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
class EmptySourceTest {

    @ParameterizedTest
    // ""
    @EmptySource
    void nullEmptyAndBlankStrings(String value) {
        log.info("Value is \"{}\"", value);
        assertTrue(value.trim().isEmpty());
    }
}
