import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeCalTest {
    @Test
    public void timeCalculator() {
        assertEquals(1.0, TimeCal.timeCalculator(100.0, 100.0));
    }
}
