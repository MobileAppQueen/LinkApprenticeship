package JanelleRepackagerCalculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by janelle on 2017-03-22.
 */
public class RepackagerCalculatorTest {

    public void testOne() {
        double result = RepackagerCalculator.calculateCost(1299.99,3,0,1,0);
        assertEquals(result, 1591.58, 0.005);
    }

}