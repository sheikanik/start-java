import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
        int [] number= {-10,5,60,30,12};
        Arrays.sort(number);
        System.out.print("Assending : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+number[i]);

        }
        System.out.println();
        System.out.print("dessending : ");
        for (int i = 4; i >=0 ; i--) {
            System.out.print(" "+number[i]);

        }


    }
}
