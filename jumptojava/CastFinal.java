package jumptojava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CastFinal {
    public static void main(String[] args){
        // �� ��ȯ
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
        // ����Ʈ ��� final�� ����� ����Ʈ�� ���� ���ϰų� ���� ���� ����, but ���Ҵ��� �ȵǴ� ��.
        // �� �� ���� �Ұ����ϰ� �Ϸ��� List.of �� ������ �Ұ����� ����Ʈ�� �����ؾ���

        final List<String>b = List.of("a", "b");

    }


}
