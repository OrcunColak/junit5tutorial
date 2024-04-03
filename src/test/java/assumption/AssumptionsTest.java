package assumption;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

/**
 * See <a href="https://medium.com/@bubu.tripathy/junit5-assumptions-d67d8cb6c28d">...</a>
 */
class AssumptionsTest {

    @Test
    void testOnLinux() {
        boolean linux = System.getProperty("os.name").toLowerCase().contains("linux");
        Assumptions.assumeTrue(linux, "OS is not Linux");
        // Test logic specific to Linux
        Assertions.fail("Test failed");
    }

    @Test
    void testLoanApprovalProcess() {
        // Simulating the user's credit score
        final int creditScore1 = 750;
        int thresholdScore = 700;

        // Assume the user has a high credit score for instant approval
        Assumptions.assumingThat(creditScore1 >= thresholdScore, () -> {
            // Test the loan approval process for users with high credit scores
            String expectedStatus = "Approved";
            String actualStatus = approveLoan(creditScore1);
            Assertions.assertEquals(expectedStatus, actualStatus);
        });

        final int creditScore2 = 600;
        // Additional verification may be required for users with lower credit scores
        // Test the loan approval process with additional verification
        String expectedStatus = "Pending";
        String actualStatus = approveLoan(creditScore2);
        Assertions.assertEquals(expectedStatus, actualStatus);
    }

    private String approveLoan(int creditScore) {
        // Logic to determine loan approval status based on credit score
        if (creditScore >= 700) {
            return "Approved";
        } else {
            return "Pending";
        }
    }
}
