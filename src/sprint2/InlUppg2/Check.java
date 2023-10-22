package sprint2.InlUppg2;

import javax.swing.*;
import java.time.*;

public class Check {
    public static Person ifPersonIsRegistered(Person[] personArray) {
        Person foundPerson = new Person();
        String input = JOptionPane.showInputDialog(null,"Vem dyker upp på gymmet? (Namn eller personnummer)");
        if (input.contains("1") || input.contains("0")) {
            for (int i = 0; i < personArray.length; i++) {
                if (Double.parseDouble(input.replace("-", "").trim()) == personArray[i].getSocialSecurityNumb()) {
                    foundPerson = personArray[i];
                    break;
                }

            }
        } else {
            for (int i = 0; i < personArray.length; i++) {
                if (input.trim().equalsIgnoreCase(personArray[i].getName())) {
                    foundPerson = personArray[i];
                    break;
                }
            }
        }

        return foundPerson;
    }

    public static void memberShip(Person[] personArray) {
        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].getName() != null) {
                LocalDate expireDate = personArray[i].getDateOfPayment().plusYears(1);
                LocalDate currentDate = LocalDate.now();

                if (currentDate.isBefore(expireDate)) {
                    personArray[i].setVisitor(Visitor.CLIENT.toText);
                } else if (currentDate.isAfter(expireDate)) {
                    personArray[i].setVisitor(Visitor.EX_CLIENT.toText);
                }
            }
            else {
                personArray[i].setVisitor(Visitor.UNAUTHORIZED.toText);
            }
        }
    }
}
