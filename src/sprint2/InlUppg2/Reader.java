package sprint2.InlUppg2;

import java.io.*;
import java.util.ArrayList;

public class Reader {
    public static String[] fileToList() {
        int lines = 28;
        String[] s = new String[lines/2];
        try (FileReader fr = new FileReader(".\\src\\sprint2\\InlUppg2\\gym_members");
             BufferedReader reader = new BufferedReader(fr)) {

            for (int i = 0; i < lines; i += 2) {

                s[i/2] = reader.readLine() + " ";
                s[i/2] += reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return s;
    }
}