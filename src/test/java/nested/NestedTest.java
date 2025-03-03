package nested;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Customer Service Tests")
public class NestedTest {

    @Nested
    @DisplayName("Account Creation")
    class AccountCreation {

        @Test
        @DisplayName("Should create account when valid details provided")
        void testSuccessfulAccountCreation() {
            // Test logic
        }

        @Test
        @DisplayName("Should throw exception when email is invalid")
        void testInvalidEmailCreation() {
            // Test logic
        }
    }
}
