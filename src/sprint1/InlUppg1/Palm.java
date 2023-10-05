package sprint1.InlUppg1;

public class Palm extends Plant {   //arv

    Palm(String name, double height) {
        super(name, height);
    }

    public String liquidOfChoice() {
        return Liquids.KRANVATTEN.liquid;
    }

    @Override
    public double liquidVolume() {
        return 0.5 * this.height;
    }
}
