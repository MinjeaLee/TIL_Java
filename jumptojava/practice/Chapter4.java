package jumptojava.practice;

public class Chapter4 {
    static void q2 () {
        int result = 0;

        for(int  i = 0; i <= 1000; i++) {
            if(i % 3 == 0) {
                result += i;
            }
        }

        System.out.println(String.format("Q2 : %d", result));
    }

    static void q3 () {
        System.out.println("Q3 : ");
        for(int i = 0; i <= 5; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }    

    static void q5 () {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        double avg = 0;

        for(int score : marks) {
            avg += (double)score;
        }
        avg /= marks.length;

        System.out.println(String.format("Q5 : %.1f", avg));
    }

    public static void main(String[] args){
        q2();
        q3();
        q5();
    }
    
}
