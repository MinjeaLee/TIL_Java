package jumptojava;
import java.util.HashMap;

public class MapSection {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();

        map.put("name", "leeminjea");
        map.put("old", "21");

        System.out.println(map);
        System.out.println(String.format("map.get(\"name\') : %s", map.get("name")));

        System.out.println(String.format("map.get(\"GirlFrend\" : %s", map.get("GirlFrend")));
        System.out.println(String.format("map.gerOrDefault(\"GirlFrend\", \"?\") : %s", map.getOrDefault("GirlFrend", "?")));
        

    }
    
}
