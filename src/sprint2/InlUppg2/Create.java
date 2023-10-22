package sprint2.InlUppg2;

import java.time.LocalDate;

public class Create {
    public static Person[] personArray(String[] s) {
        Person[] personArray = new Person[14];
        int comma;
        int space;
        double socialSecurityNumb;
        String name;
        LocalDate dateOfPayment;

        for (int i = 0; i < s.length; i++) {
            comma = s[i].indexOf(",");
            socialSecurityNumb = Double.parseDouble(s[i].substring(0, comma));
            space = s[i].lastIndexOf(" ");
            name = s[i].substring(comma + 2, space);
            dateOfPayment = LocalDate.parse(s[i].substring(space+1));
            personArray[i] = new Person(socialSecurityNumb, name, dateOfPayment);
        }
        return personArray;
    }
}
