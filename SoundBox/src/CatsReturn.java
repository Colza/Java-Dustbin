import java.io.*;

public class CatsReturn {

        public static void main(String [] args) {
            Cat cat1 = null;
            Cat cat2 = null;
            try {
                FileInputStream fileIn = new FileInputStream("freezedriedCat");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                cat1 = (Cat) in.readObject();
                cat2 = (Cat) in.readObject();
                in.close();
                fileIn.close();
            } catch(Exception e) {
                System.out.println("Cat is lost");
                return;
            }

            System.out.println(cat1.toString());
            System.out.println(cat2.toString());

        }
    }










