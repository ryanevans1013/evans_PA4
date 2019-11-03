import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class DuplicateRemover {

    private Set <String> uniqueWords;

    public DuplicateRemover() {
        uniqueWords = new HashSet<>();
    }

    public void remove(String dataFile) {
        try {
            Scanner scnr = new Scanner(new File(dataFile));

            while(scnr.hasNext()) {
                uniqueWords.add(scnr.next());
            }
            scnr.close();
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public void write(String outputFile) {
        try {
            FileWriter fw = new FileWriter(new File(outputFile));

            for(String string: uniqueWords) {
                fw.println(string);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }
}