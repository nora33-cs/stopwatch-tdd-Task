import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StopWatchTest {

    @Test
    void test1() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(14);
        int minutes = stopWatch.getMinutes();
        Assertions.assertEquals(14, minutes);
    }

   @Test
void test2() {
    StopWatch stopWatch = new StopWatch();
    stopWatch.record(-5);

    int minutes = stopWatch.getMinutes();

    if (minutes != 0) {
        Assertions.fail("Invalid value");
    }
}
@Test
void sixtyMinutesShouldBecomeOneHour() {
    // Arrange
    StopWatch stopWatch = new StopWatch();

    // Act
    stopWatch.record(70);

    // Assert
    Assertions.assertEquals(1, stopWatch.getHours());
    Assertions.assertEquals(10, stopWatch.getMinutes());
}
@Test
void twentyFourHoursShouldBecomeOneDay() {
    StopWatch stopWatch = new StopWatch();

    stopWatch.record(1440);

    Assertions.assertEquals(1, stopWatch.getDays());
}
@Test
void eightWorkingHoursShouldBecomeOneDay() {
    StopWatch stopWatch = new StopWatch();

    stopWatch.record(8 * 60);

    Assertions.assertEquals(1, stopWatch.getWorkingDays());
}
}
