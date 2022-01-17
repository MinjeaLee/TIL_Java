package jumptojava;

public class StringSection {
    public static void main(String[] args){
        String a = "Hello";
        String b = "World";
        
        System.out.println("1. a equals b : " + a.equals(b));
        
        String c = "Java";
        String d = new String("Java");

        System.out.println("2. c equals d : " + c.equals(d)); 
        // ���� Java�̱⿡ true ���
        System.out.println("3. c == d : " + (c == d));
        // ���� Java������ ���� �ٸ� ��ü�̱⿡ False ���

        String e = "Hello Java World";

        System.out.println("4. e.indexof(\"Java\") : " + e.indexOf("Java"));    // String���� �ܾ��� �ε��� ��ȯ

        System.out.println("5. e.contains(\"Java\") : " + e.contains("Java"));  // String�� �ܾ� ���� ���� ��ȯ

        System.out.println("6. e.replaceAll(\"Java\", \"JumpToJava\") : "+ e.replaceAll("Java", "JumpToJava"));

        

        
    }
}
