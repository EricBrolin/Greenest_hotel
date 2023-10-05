package sprint1.InlUppg1;

public enum Liquids {   //enum
    MINERALVATTEN("mineralvatten"),
    KRANVATTEN("kranvatten"),
    PROTEINDRYCK("proteindryck");


    public final String liquid;

    Liquids(String l) {
        liquid = l;
    }
}