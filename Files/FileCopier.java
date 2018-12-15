import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//old school code

public class FileCopier {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("groceries.txt");
            out = new FileOutputStream("groceries (copy).txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) try { in.close(); } catch (IOException e) { e.printStackTrace(); }
            if (out != null) try { out.close(); } catch (IOException e) { e.printStackTrace(); }
        }
    }
}

