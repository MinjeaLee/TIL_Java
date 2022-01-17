package jumptojava;

public class StringFormating {
    public static void main(String[] args) {
        System.out.println(String.format("Int substitution : %d", 1));
        // String.format 사용

        System.out.println(String.format("String substitution : %s", "String"));
        
        int num = 100;
        System.out.println(String.format("Variable substition : %d", num));

        // string format code
        // ** String.fomat("%s", 1) --> 1
        // ** String.format("%s", 3.14) --> 3.14
        // ** 문자열 포멧 코드 사용하면 다 가능 --> 문자열로 취급하기 때문

        System.out.println(String.format("%d", 1));
        System.out.printf("%d\n", 2);
        // String.format --> 문자열을 반환하는 메서드
        // System.out.printf --> 그냥 문자열을 출력

    }
}
