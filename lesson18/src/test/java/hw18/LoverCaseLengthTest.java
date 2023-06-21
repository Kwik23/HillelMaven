package hw18;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class LoverCaseLengthTest {
    @Test
    public void testFilterStrings() {
        LoverCaseLength main = new LoverCaseLength();
        List<String> filteredStrings = main.filterStrings();
        List<String> expectedStrings = List.of("kiwi");
        assertEquals(expectedStrings, filteredStrings);
    }
}

























