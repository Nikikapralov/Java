package Ex2;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Containers {
    public static void array(){
        // Array of strings
        String[] cars = {"Car1", "Car2"};
        String[] boats = new String[3];
        boats[0] = "Boat";

        for (final String car : cars){
            System.out.println(car);
        }

        for (final String boat : boats){
            System.out.println(boat);
        }

        if (cars[0].equals("Car1")){
            System.out.println("You need to use .equals since == compares memory addresses.");
        }
    }

    public static void array_list(){
        ArrayList<String> list_of_strings = new ArrayList<>();
        list_of_strings.add("Hello");
        list_of_strings.add("World");
        list_of_strings.add("!");
        list_of_strings.remove("!");

        for (final String string : list_of_strings){
            System.out.println(string);
        }
    }

    public static void hash_map(){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Hello", 1);
        map.put("World", 2);
        map.put("!", 3);
        map.remove("!");

        for (final Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + map.get(entry.getKey()));
        }
    }
}
