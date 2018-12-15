import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private int weight;

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

        @Override
    public String toString() {
            return "Cat " + name + " Weighs " + weight;
        }
        public static void main(String[] args) {
            Cat lola = new Cat("Lola", 4);
            Cat molasses = new Cat("Molasses", 3);
            System.out.println(lola.toString());
            System.out.println(molasses.toString());

            try {
                FileOutputStream fs = new FileOutputStream("freezedriedCat");
                ObjectOutputStream os = new ObjectOutputStream(fs);
                os.writeObject(lola);
                os.writeObject(molasses);
                System.out.println("Cats successfully flattened");
            } catch (Exception e) {
                System.out.println("Well that didn't work");
            }



            }

        }




