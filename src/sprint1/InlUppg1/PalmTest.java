package sprint1.InlUppg1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {    //Enhetstest

    Plant p = new Palm("Olof Palme",2);

    @Test
    void testLiquidOfChoice() {
        assert(p.liquidOfChoice().equals("kranvatten"));
    }

    @Test
    void testLiquidVolume() {
        assert(p.liquidVolume() == 1);
    }
}