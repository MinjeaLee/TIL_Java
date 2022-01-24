package jumptojava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CastFinal {
    public static void main(String[] args){
        // 형 변환
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(String.format("1. Integer.parseInt(num) = %d", n));
        
        String inttostring =  "" + n;
        System.out.println(String.format("2. String = \"\" + n = %s", inttostring));

        String num1 = String.valueOf(n);
        System.out.println(String.format("3. String.valueOf(n) = %s", num1));

        String float_num = "123.456";
        double d = Double.parseDouble(float_num);
        System.out.println(String.format("4. Double.parseDouble(float_num) = %s", d));

        int n2 = (int)d;
        System.out.println(String.format("5. (int)d = %d", n2));
        // Integer.parseInt(float_num) --> NumberFormatException

        // final
        final int fianl_n = 123;
        // final_n = 456 --> compile error
    
        final ArrayList<String>a = new ArrayList<>(Arrays.asList("a", "b"));

        // a = new ArrayList<>(Arrays.asList("c", "d")) --> compile error
        // 리스트 경우 final로 선언시 리스트에 값을 더하거나 뺴는 것을 가능, but 재할당이 안되는 것.
        // 이 것 또한 불가능하게 하려면 List.of 로 수정이 불가능한 리스트를 생성해야함

        final List<String>b = List.of("a", "b");

    }


}
