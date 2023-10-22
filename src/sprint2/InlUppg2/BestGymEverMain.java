package sprint2.InlUppg2;

import java.io.*;

public class BestGymEverMain {
    public static void main(String[] args) throws IOException {

        String[] s = Reader.fileToList();

        Person[] personArray = Create.personArray(s);

        Check.memberShip(personArray);

        Person foundPerson = Check.ifPersonIsRegistered(personArray);

        System.out.println(foundPerson);

        Writer.toPtFile(foundPerson);
    }
}
