package sprint2.InlUppg2;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class WriterTest {

    @Test
    void toPtFile() {

        double ssn1 = 8601011234d;
        LocalDate date1 = LocalDate.parse("2023-03-23");
        String name1 = "Bert Sannsson";

        Person p1 = new Person(ssn1, name1, date1);
        p1.setVisitor(Visitor.CLIENT.toText);

        double ssn2 = 7202050678d;
        LocalDate date2 = LocalDate.parse("2017-01-01");
        String name2 = "Stefan Falsksson";

        Person p2 = new Person(ssn2, name2, date2);
        p2.setVisitor(Visitor.EX_CLIENT.toText);

        //Kund
        Writer.toPtFile(p1);

        assert (p1.getName().equals(getLastNameFromPtList()));

        //Fd. kund
        Writer.toPtFile(p2);

        assert (!p2.getName().equals(getLastNameFromPtList()));

    }

    public static String getLastNameFromPtList() {
        String currentLine;
        String[] ptFileArray = new String[200];
        int i = 0;

        try (FileReader fr = new FileReader(".\\src\\sprint2\\InlUppg2\\pt_file");
             BufferedReader reader = new BufferedReader(fr)) {

            while ((currentLine = reader.readLine()) != null) {

                ptFileArray[i] = currentLine;
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        int lastNamePosition = 0;
        for (int j = 0; j < ptFileArray.length; j++) {
            if (ptFileArray[j] == null) {
                lastNamePosition = j - 4;
                break;
            }
        }

        return ptFileArray[lastNamePosition];
    }
}