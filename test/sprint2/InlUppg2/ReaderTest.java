package sprint2.InlUppg2;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {

@Test
void fileToListTest() throws IOException {

        String[] s = Reader.fileToList();
        assert s[5].equals("7911061234, Fritjoff Flacon 2018-12-16");
        assert !s[5].equals("4604151234, Kadine Karlsson 2019-01-09");
        assert s[10].equals("4604151234, Kadine Karlsson 2019-01-09");

    }
}
