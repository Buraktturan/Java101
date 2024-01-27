import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= scan.nextInt();

        for (int i=n;i>0;i--){

            for(int j=n;j>=0;j--){
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }
}
