package displaynametest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * Instead of grouping all ParameterizedTests under the test method name, @DisplayName allows us give a custom name
 */
class DisplayNameTest {

    @DisplayName("Parameterized test for  docker images")
    // If we don't provide a name then the test name is "," join of all parameters. But this is not readable
    // Here we are using the first parameter as test display name
    @ParameterizedTest(name = "{index} {0}")
    @MethodSource("testData")
    void testDynamicDisplayName(String dockerImageName, Class<?> expectedClassType) {
        Assertions.assertNotNull(dockerImageName);
        Assertions.assertNotNull(expectedClassType);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("gvenzl/oracle-free:23-slim-faststart", String.class),
                Arguments.of("gvenzl/oracle-xe:21-slim-faststart", Integer.class)
        );
    }
}
