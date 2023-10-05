package sprint1.InlUppg1;

public class CarnivorousPlant extends Plant {   //arv

    CarnivorousPlant(String name, double height) {
        super(name, height);
    }
    public String liquidOfChoice() {
        return Liquids.PROTEINDRYCK.liquid;
    }
    @Override
    public double liquidVolume() {
        return 0.1+0.2*this.height;
    }
}
