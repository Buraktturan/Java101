import java.util.Scanner;

public class StarsDiamond {
    public static void main(String[] args) {

        int n;

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=scan.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j=n;j>= 0;j--){
            for (int k=0;k<(n-j);k++){
                System.out.print(" ");
            }
            for (int i=0;i<=(2*j-1);i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
