package sprint2.InlUppg2;

import java.time.LocalDate;

public class Person {
    private double socialSecurityNumb;
    private String name;
    private LocalDate dateOfPayment;
    private String visitor;

    public Person(double socialSecurityNumb, String name, LocalDate dateOfPayment) {
        this.socialSecurityNumb = socialSecurityNumb;
        this.name = name;
        this.dateOfPayment = dateOfPayment;
    }

    public Person() {
    }

    @Override
    public String toString() {
        if (this.name == null)
            return ("Personen är inte skriven på gymmet och är " + Visitor.UNAUTHORIZED.toText + ".");
        else {
            String ssnPrint = String.format("%.0f", socialSecurityNumb);
            return "Personen " + name + " är " + this.getVisitor() + ".";
        }
    }

    public void setVisitor(String s) {
        this.visitor = s;
    }
    public double getSocialSecurityNumb() {
        return socialSecurityNumb;
    }
    public LocalDate getDateOfPayment() {
        return dateOfPayment;
    }
    public String getName() {
        return name;
    }
    public String getVisitor() {
        return visitor;
    }
}
