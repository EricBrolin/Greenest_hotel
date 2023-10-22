package sprint2.InlUppg2;

public enum Visitor {
    CLIENT ("kund"),
    EX_CLIENT ("fd. kund"),
    UNAUTHORIZED ("obehörig");

    public final String toText;

    Visitor(String s) {
        toText = s;
    }
}