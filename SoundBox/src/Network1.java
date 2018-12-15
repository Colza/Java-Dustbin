import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Network1 {

    public static void readSocket() {
        try {
            Socket sk = new Socket("127.0.0.1", 5000);
            InputStreamReader is = new InputStreamReader(sk.getInputStream());
            BufferedReader reader = new BufferedReader(is);
            System.out.println(reader.readLine());
        } catch (Exception e) {
            //to do
        }

    }

    public static void writeSocket() {
        try {
            Socket sk = new Socket("127.0.0.1", 5000);
            PrintWriter writer = new PrintWriter(sk.getOutputStream());
            writer.println("Message");
        } catch (Exception e) {
            //to do
        }
    }

    public static void main(String[] args) {
        writeSocket();
        readSocket();
    }

}