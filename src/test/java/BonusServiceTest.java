import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Bonus.csv")
    void shouldCalculateForRegisteredAndUnderLimit(boolean register, long amount, long expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, register);

        assertEquals(expected, actual);
    }
}