package jumptojava;

public class EnumSection {
    enum CoffeType { 
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
    public static void main (String[] args){

        for(CoffeType type : CoffeType.values()){
            System.out.println(type);
        }


    }
}
