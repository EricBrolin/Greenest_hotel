package sprint1.InlUppg1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusTest {  //Enhetstest

    Plant p = new Cactus("Taggis",2);

    @Test
    void testLiquidOfChoice() {
        assert(p.liquidOfChoice().equals("mineralvatten"));
    }

    @Test
    void testLiquidVolume() {
        assert(p.liquidVolume() == 0.02);
    }
}