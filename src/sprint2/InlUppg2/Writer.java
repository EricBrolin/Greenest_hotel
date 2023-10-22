package sprint2.InlUppg2;

import java.io.*;
import java.time.*;

public class Writer {
    public static void toPtFile(Person foundPerson) {
        try (FileWriter fw = new FileWriter(".\\src\\sprint2\\InlUppg2\\pt_file", true);
        BufferedWriter writer = new BufferedWriter(fw)) {
            if (foundPerson.getVisitor() != null && foundPerson.getVisitor().equals(Visitor.CLIENT.toText)) {
                writer.write(foundPerson.getName() + "\n" + String.format("%.0f",foundPerson.getSocialSecurityNumb()) + "\n" + LocalDate.now() + "\n\n");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}