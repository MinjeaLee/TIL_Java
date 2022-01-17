package jumptojava;
public class StringBufferSection {
    // StringBuffer --> 문자열 추가 변경 시 사용
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.toString();
        System.out.println(String.format("Stringbupper = %s", sb));

        String s = "";
        s += "Hello";
        s += " ";
        s += "World";
        System.out.println(String.format("String = %s", s));

        StringBuffer sb2 = new StringBuffer();
        sb2.append("Jump to java");
        sb2.insert(0, "hello ");
        System.out.println(String.format("Stringbuffer.insert : %s", sb2.toString()));

        StringBuffer sb3 = new StringBuffer();
        sb3.append("Hello Jump to java");
        System.out.println(String.format("StringBuffer.substring(0, 4) = %s", sb3.substring(0, 4)));

    }
    
}
