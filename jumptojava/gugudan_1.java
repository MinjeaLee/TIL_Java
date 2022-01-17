package jumptojava;
public class gugudan_1{
    public void dan(int x){
        for(int i = 1; i <= 9; i++) {
            System.out.println(x + "*" + i + "=" + x*i);
        }
    }
    public static void main(String[] args){
        gugudan_1 gugu = new gugudan_1();
        for(int i = 1; i <= 9; i++){
            gugu.dan(i);
        }

    }
}