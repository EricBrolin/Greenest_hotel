package sprint2.InlUppg2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CheckTest {

    @Test
    void memberShip() {
        double ssn1 = 7512166544d;
        LocalDate date1 = LocalDate.parse("2023-03-23");
        double ssn2 = 9902149834d;
        LocalDate date2 = LocalDate.parse("2020-09-27");

        Person p1 = new Person(ssn1, "Greger Ganache", date1);
        Person p2 = new Person(ssn2, "Jicky Juul", date2);
        Person p3 = new Person();
        Person[] personArr = new Person[]{p1, p2, p3};

        Check.memberShip(personArr);
        LocalDate expireDate1 = p1.getDateOfPayment().plusYears(1);
        LocalDate expireDate2 = p2.getDateOfPayment().plusYears(1);

        if (LocalDate.now().isBefore(expireDate1))
            assert (p1.getVisitor().equals(Visitor.CLIENT.toText));
        else
            assert (p1.getVisitor().equals(Visitor.EX_CLIENT.toText));

        if (LocalDate.now().isBefore(expireDate2))
            assert (p2.getVisitor().equals(Visitor.CLIENT.toText));
        else
            assert (p2.getVisitor().equals(Visitor.EX_CLIENT.toText));

        assert (p3.getVisitor().equals(Visitor.UNAUTHORIZED.toText));

    }
}