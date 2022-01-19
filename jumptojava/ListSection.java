package jumptojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListSection{
    // list --> interface 
    public static void main(String[] args){ 

        ArrayList<String> ar = new ArrayList<>();
        // ArrayList ar = new ArrayList();
        ar.add("123");
        ar.add("456");
        ar.add("789");
        System.out.println("ar : " + ar);

        ar.add(0, "000");
        System.out.println("ar : " + ar);

        System.out.println(String.format("ar[0] : %s",ar.get(0)));

        System.out.println(String.format("ar's size : %d", ar.size()));

        System.out.println("\"123\" in ar : " + ar.contains("123"));

        System.out.println(String.format("ar.remove(0) : %s", ar.remove(0)));

        System.out.println("ar : " + ar);

        String[] list = {"A", "B", "C", "D"};

        ArrayList<String> ar2 = new ArrayList<>(Arrays.asList(list));
        // ArrayList<string> ar2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D));

        System.out.println("ar2 : " + ar2);

        String result = String.join(",", ar2);
        System.out.println("String.join(\",\", ar2) : " + result);
        // String result = "";
        // for(int i = 0; i < ar2.size(); i++){
        //     result += ar2.get(i);
        //     result += ",";
        // }
        // result = result.substring(0, result.length() - 1);

        ar.sort(Comparator.reverseOrder());
        System.out.println("ar.sort(Comparator.reverseOrder()) : " + ar);
        
        ar.sort(Comparator.naturalOrder());
        System.out.println("ar.sort(Comparator.naturalOrder()) : " + ar);
    }
}