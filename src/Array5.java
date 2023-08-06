import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int [][] A =new int[3][3];
        int digonalinput=0;
        int upperinput=0;
        int lowerinput=0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col]=input.nextInt();
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if(row==col){
                    digonalinput = digonalinput+A[row][col];
                }
                if(row<col){
                    upperinput = upperinput+A[row][col];
                }
                if(row>col){
                    lowerinput = lowerinput+A[row][col];
                }

            }

        }
        System.out.println("sum: "+digonalinput);
        System.out.println("sum: "+upperinput);
        System.out.println("sum: "+lowerinput);

    }
}
