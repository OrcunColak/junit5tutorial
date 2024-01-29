package parameterizedtest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Slf4j
class ParameterizedTestTest {

    @ParameterizedTest(name = "{index} {0} {1} test")
    @CsvSource({
            "apple,         1",
            "banana,        2",
            "'lemon, lime', 0xF1",
            "strawberry,    700_000"
    })
    void testCustomizeTestName(String fruit, int rank) {
        log.info("fruit is : {} rank : {}", fruit, rank);
    }
}
