import java.io.*;

public class FileCopierBufferedReader {

    public static void main(String[] args) {
        try (
                BufferedReader in = new BufferedReader(
                        new FileReader("groceries.txt"));
                BufferedWriter out = new BufferedWriter(
                        new FileWriter("groceries (copy).txt"));
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line + System.lineSeparator());
                System.out.println(line);
            }
        } catch (IOException x) {
            x.printStackTrace();
        }
    }
}


