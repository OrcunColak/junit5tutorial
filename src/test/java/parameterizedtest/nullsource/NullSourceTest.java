package parameterizedtest.nullsource;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertNull;

@Slf4j
class NullSourceTest {

    @ParameterizedTest
    // Null
    @NullSource
    void nullEmptyAndBlankStrings(String value) {
        log.info("Value is \"{}\"", value);
        assertNull(value);
    }
}
