import java.io.*;
import java.util.Scanner;


public class ReadWriteFile {

    static String input = "";
    static String output = "";

    void writeFile(String s) {
        File f = new File("testfile.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(s);
            bw.flush();
            bw.close();
            System.out.println("File written");

        }
        catch (Exception e) {
            System.out.println("Broken");
        }
    }

    String readFile() {
        File f = new File("testfile.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            output = br.readLine();
            System.out.println("File read");
            br.close();
        }
        catch (Exception e) {
            System.out.println("Broken");
        }
        return output;
    }

    void renameFile(String oldName, String newName) {
        File of = new File(oldName);
        File nf = new File(newName);
        try {
            of.renameTo(nf);
        } catch (Exception e) {
            System.out.println("Rename failed");
        }
    }

    void deleteFile(String filename) {
        File f = new File(filename);
        System.out.println(filename);
        System.out.println(f.getName());
        if (f.delete()) System.out.println("File " + filename + " deleted");
             else System.out.println("File not found");
    }

    public static void main(String[] args) {
        ReadWriteFile rw = new ReadWriteFile();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to add to file : ");
         input = sc.nextLine();
        rw.writeFile(input);                //write file
        System.out.println(rw.readFile());  //read file
        rw.renameFile("testfile.txt", "renamed.txt");
        rw.deleteFile("renamed.txt");

    }
}
