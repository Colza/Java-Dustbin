import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsTester {
    public static void main(String[] args) {
        long start =  System.currentTimeMillis();
        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("First Item");
        listOfStrings.add("Second Item");
        listOfStrings.add("Third Item");
        listOfStrings.add("Fourth Item");

        listOfStrings.remove(0);
        listOfStrings.remove("Second Item");

        HashSet<Integer> listOfInts = new HashSet<>();
        listOfInts.add(2);
        listOfInts.add(3);
        listOfInts.add(4);
        listOfInts.add(5);
        listOfInts.remove(4);

        //listOfStrings.addAll((String) listOfInts);

        HashMap<String, Integer> ages = new HashMap();
        ages.put("Julian",59);
        ages.put("Averil",58);
        ages.put("Luca",14);
        ages.remove("Julian");

        ArrayList olist = new ArrayList();
        olist.add(1);
        olist.add("Nigel");
        olist.add(ages);

        int x = (int) olist.get(0);


        for (Long i = 0L; i < 1000000; i++) {
            String s = (String) olist.get(1) + "Hello";
        }

        long finish =  System.currentTimeMillis();
        System.out.println(finish - start);
        LocalDate myTime = new LocalDate();
        System.out.println(Tim);




    }
}
