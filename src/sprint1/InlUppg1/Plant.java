package sprint1.InlUppg1;

public abstract class Plant implements liquidVolumeCalc {
    protected double height;    //Inkapsling
    protected String name;      //Inkapsling

    Plant(String name, double height) {
        this.height = height;
        this.name = name;
    }

    abstract public String liquidOfChoice();

}
