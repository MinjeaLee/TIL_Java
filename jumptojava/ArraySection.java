package jumptojava;

public class ArraySection {
    public static void main(String[] args){
        String[] args1 = new String[7];
        // 크기가 정해져있고 정적임
        // String[] args2 = new String[]; --> error
        args1[0] = "A";
        args1[1] = "B";
        for(int i = 2; i < args1.length; i++){
            args1[i] = Integer.toString(i); // int --> String
        }

        for(int i = 0; i < args1.length; i++){ 
            System.out.println(args1[i]);
        }

        // System.out.println(args1[7]); --> error


    }
}
