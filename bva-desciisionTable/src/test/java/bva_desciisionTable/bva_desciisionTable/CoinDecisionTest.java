package bva_desciisionTable.bva_desciisionTable;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoinDecisionTest {

    @Test
    void R1_TTTT() {
        CoinDecision cd = new CoinDecision();
        assertEquals("Negative", cd.CoinDecision("T","T","T","T"));
    }

    @Test
    void R2_HTTT() {
        CoinDecision cd = new CoinDecision();
        assertEquals("Negative", cd.CoinDecision("H","T","T","T"));
    }

    @Test
    void R3_HHTT() {
        CoinDecision cd = new CoinDecision();
        assertEquals("Positive", cd.CoinDecision("H","H","T","T"));
    }

    @Test
    void R4_HHHT() {
        CoinDecision cd = new CoinDecision();
        assertEquals("Positive", cd.CoinDecision("H","H","H","T"));
    }

    @Test
    void R5_HHHH() {
        CoinDecision cd = new CoinDecision();
        assertEquals("Positive", cd.CoinDecision("H","H","H","H"));
    }
}
