package jumptojava;

public class StringFormating {
    public static void main(String[] args) {
        System.out.println(String.format("Int substitution : %d", 1));
        // String.format ���

        System.out.println(String.format("String substitution : %s", "String"));
        
        int num = 100;
        System.out.println(String.format("Variable substition : %d", num));

        // string format code
        // ** String.fomat("%s", 1) --> 1
        // ** String.format("%s", 3.14) --> 3.14
        // ** ���ڿ� ���� �ڵ� ����ϸ� �� ���� --> ���ڿ��� ����ϱ� ����

        System.out.println(String.format("%d", 1));
        System.out.printf("%d\n", 2);
        // String.format --> ���ڿ��� ��ȯ�ϴ� �޼���
        // System.out.printf --> �׳� ���ڿ��� ���

    }
}
