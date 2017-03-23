package JanelleRepackagerCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by janelle on 2017-03-22.
 */
public class RepackagerCalculatorTest {
    RepackagerCalculator calculator = new RepackagerCalculator();
    @Test
    public void testOne() {
        double result= calculator.calculateCost(1299.99,3,0,1,0);
        assertEquals(result, 1591.58, 0.05);
    }
    @Test
    public void testTwo() {
        double result= calculator.calculateCost(5432.00,1,1,0,0);
        assertEquals(result, 6199.81, 0.05);
    }
    @Test
    public void testThree() {
        double result= calculator.calculateCost(12456.95,4,0,0,0);
        assertEquals(result, 13707.63, 0.05);
    }
}