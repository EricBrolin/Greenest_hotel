package sprint1.InlUppg1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousPlantTest {    //Enhetstest

    Plant p = new CarnivorousPlant("Köttätarn",2);

    @Test
    void testLiquidOfChoice() {
        assert(p.liquidOfChoice().equals("proteindryck"));
    }

    @Test
    void testLiquidVolume() {
        assert(p.liquidVolume() == 0.5);
    }
}