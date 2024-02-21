package parameterizedtest.csvsource;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@Slf4j
class CsvFileSourceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/assets.csv"}, numLinesToSkip = 1)
    void testCsvFileSource(String value1, String value2) {
        log.info("Value is : {} and : {}", value1, value2);

    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/assets.csv"}, useHeadersInDisplayName = true)
    void testCsvFileSourceWithHeader(String value1, String value2) {
        log.info("Value is : {} and : {}", value1, value2);
    }
}
