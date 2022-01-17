package jumptojava;

public class StringSection {
    public static void main(String[] args){
        String a = "Hello";
        String b = "World";
        
        System.out.println("1. a equals b : " + a.equals(b));
        
        String c = "Java";
        String d = new String("Java");

        System.out.println("2. c equals d : " + c.equals(d)); 
        // 같은 Java이기에 true 출력
        System.out.println("3. c == d : " + (c == d));
        // 같은 Java이지만 서로 다른 객체이기에 False 출력

        String e = "Hello Java World";

        System.out.println("4. e.indexof(\"Java\") : " + e.indexOf("Java"));    // String에서 단어의 인덱스 반환

        System.out.println("5. e.contains(\"Java\") : " + e.contains("Java"));  // String에 단어 포함 여부 반환

        System.out.println("6. e.replaceAll(\"Java\", \"JumpToJava\") : "+ e.replaceAll("Java", "JumpToJava"));

        

        
    }
}
