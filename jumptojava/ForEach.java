package jumptojava;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach {
    public static void main(String[] args){
        String[] numbers = {"one", "two", "three"};

        for(String num : numbers){
            System.out.println(num);
        }
        // for - each
        // for(type var : iterate){
        //      body-of-loof
        // }

        System.out.println("--------------------");
        
        ArrayList<String> numlist = new ArrayList<String>(Arrays.asList(numbers));

        for(String num : numlist){
            System.out.println(num);
        }

    }
    
}
