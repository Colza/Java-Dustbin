import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NIO2Reader {
    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>();
        try {
            //reads the whole file
            groceries = Files.readAllLines(
                    Paths.get("groceries.txt"),
                    Charset.defaultCharset());
        } catch (IOException | SecurityException e) {
            e.printStackTrace();
        }
        for (String item : groceries) {
            System.out.println("Don't forget to pickup: " + item);
        }
    }
}