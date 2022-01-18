package jumptojava;
import java.util.ArrayList;

public class ListSection{
    public static void main(String[] args){ 
        ArrayList<String> ar = new ArrayList<>();
        // ArrayList ar = new ArrayList();
        ar.add("123");
        ar.add("456");
        ar.add("789");

        ar.add(0, "000");

        System.out.println(String.format("ar[0] : %s",ar.get(0)));
        System.out.println(String.format("ar[1] : %s",ar.get(1)));

        System.out.println(String.format("ar's size : %d", ar.size()));

        System.out.println(String.format(""));
    }
}