import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= scan.nextInt();
        int result=0;
        for (int i=n-1;i>=1;i--){
            if (n%i==0){
               result=result+i;
            }
        }
        if(result==n){
            System.out.println(n + " is a perfect number.");
        }else
            System.out.println(n + " is not a perfect number.");
    }
}
