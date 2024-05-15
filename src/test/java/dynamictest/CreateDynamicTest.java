package dynamictest;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class CreateDynamicTest {

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStream() {
        Function<String, DynamicTest> stringDynamicTestFunction = fruit -> dynamicTest("Test for " + fruit, () -> {
            assertTrue(fruit.length() > 4);
        });
        return Stream.of("apple", "banana", "lemon")
                .map(stringDynamicTestFunction);
    }

    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection() {
        DynamicTest positiveTest = dynamicTest("Positive Test", () -> assertEquals(2, 1 + 1));
        DynamicTest negativeTest = dynamicTest("Negative Test", () -> assertEquals(-2, -1 + -1));
        return Arrays.asList(positiveTest, negativeTest);
    }
}
