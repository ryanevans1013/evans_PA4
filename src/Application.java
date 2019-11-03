import java.io.IOException;

public class Application {
    public static void main(String[]args) throws IOException{
        DuplicateRemover dr = new DuplicateRemover();
        dr.write("unique_words.txt");
        dr.remove("problem1.txt");
    }
}
