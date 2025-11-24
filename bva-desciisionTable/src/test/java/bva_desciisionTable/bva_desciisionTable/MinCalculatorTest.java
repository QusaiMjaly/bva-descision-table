package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCalculatorTest {
    
    @Test
    public void testA_LowerBoundaryShouldBeValid() {
        assertDoesNotThrow(() ->
            MinCalculator.findMin(1, 500, 500, 500, 500)
        );
    }

    @Test
    public void testB_UpperBoundary1000ShouldBeValid() {
        assertDoesNotThrow(() ->
            MinCalculator.findMin(500, 1000, 500, 500, 500)
        );
    }
}
