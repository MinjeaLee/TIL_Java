package jumptojava;
import java.util.HashMap;
import java.util.ArrayList;


public class MapSection {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();

        map.put("name", "leeminjea");
        map.put("old", "21");

        System.out.println(map);
        System.out.println(String.format("map.get(\"name\') : %s", map.get("name")));

        System.out.println(String.format("map.get(\"GirlFrend\" : %s", map.get("GirlFrend")));
        System.out.println(String.format("map.gerOrDefault(\"GirlFrend\", \"?\") : %s", map.getOrDefault("GirlFrend", "?")));

        System.out.println("map.containsKey(\"name\") : " + map.containsKey("name"));

        map.put("gender", "male");

        System.out.println("map : " + map);
        System.out.println(String.format("map.remove(\"male\") : %s", map.remove("gender")));
        System.out.println("map : " + map);

        System.out.println(String.format("map.size : %d", map.size()));

        ArrayList<String> keys = new ArrayList<>(map.keySet());
        System.out.println("map.keySet() to ArrayList : " + keys);

    }
    
}
