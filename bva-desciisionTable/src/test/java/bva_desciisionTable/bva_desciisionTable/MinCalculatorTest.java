package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCalculatorTest {

    @Test
    void a_min_minus_1() {
        MinCalculator mc = new MinCalculator();
        assertThrows(IllegalArgumentException.class,
            () -> mc.findMin(0,50,50,50,50));
    }

    @Test
    void a_min() {
        MinCalculator mc = new MinCalculator();
        assertEquals(1, mc.findMin(1,50,50,50,50));
    }

    @Test
    void a_min_plus_1() {
        MinCalculator mc = new MinCalculator();
        assertEquals(2, mc.findMin(2,50,50,50,50));
    }

    @Test
    void a_nominal() {
        MinCalculator mc = new MinCalculator();
        assertEquals(50, mc.findMin(50,50,50,50,50));
    }

    @Test
    void a_max() {
        MinCalculator mc = new MinCalculator();
        assertEquals(5, mc.findMin(1000,5,6,7,8));
    }

    @Test
    void a_max_plus_1() {
        MinCalculator mc = new MinCalculator();
        assertThrows(IllegalArgumentException.class,
            () -> mc.findMin(1001,50,50,50,50));
    }
}
