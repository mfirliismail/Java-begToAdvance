package Hashmap;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Dog");
        map.put(3, "Penguin");
        map.put(6, "Giraffe");
        map.put(10, "Lion");

        String animal = map.get(3);
        System.out.println(animal);

        for(Map.Entry<Integer , String> myAnimals: map.entrySet()){
            int key = myAnimals.getKey();
            String value = myAnimals.getValue();

            System.out.println(key + ":" + value);
        }

    }
}
