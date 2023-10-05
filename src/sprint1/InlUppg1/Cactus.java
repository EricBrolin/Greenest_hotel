package sprint1.InlUppg1;

public class Cactus extends Plant { //arv

    Cactus(String name, double height) {
        super(name, height);
    }
    public String liquidOfChoice() {
        return Liquids.MINERALVATTEN.liquid;
    }

    @Override
    public double liquidVolume() {
        return 0.02;
    }


}
