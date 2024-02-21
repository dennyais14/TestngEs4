import org.junit.Test;
import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import static org.junit.Assert.assertEquals;

public class MainTest {

    public Main test1 = new Main();

    @Test
    public void testGetYearFunction() {
        String date1 = "2023-03-01T13:00:00Z";
        OffsetDateTime data1 = OffsetDateTime.parse(date1);
        int result = test1.trovaAnno(data1);
        assertEquals(2023, result);
    }

    @Test
    public void testGetDayOfWeekFunction() {
        String date1 = "2023-03-01T13:00:00Z";
        OffsetDateTime data1 = OffsetDateTime.parse(date1);
        DayOfWeek result = test1.trovaGiornoDellaSettimana(data1);
        assertEquals(DayOfWeek.WEDNESDAY, result);
    }
}