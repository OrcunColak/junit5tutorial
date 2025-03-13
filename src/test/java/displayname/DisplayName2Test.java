package displayname;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DisplayName2Test {

    // testSerialize(String, int, int)
    //  1 Max values test - Payload : 0xFFFFFF Port : 65535
    //  2 Min values test - Payload : 0 Port : 0
    @ParameterizedTest(name = "{index} {0} Payload : {1} Port : {2}")
    @CsvSource({
            "Max values test - , 0xFFFFFF, 65535",
            "Min values test - , 0, 0"
    })
    void testSerialize(String testName, int payloadLength, int port) {

    }

}
