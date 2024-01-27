import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Fibonacci Number: ");
        int n = scan.nextInt();
        int f1=0;
        int f2=1;
        int f3=0;

        for(int i=0;i<n-1;i++){
            f3=f1+f2;
            System.out.println(f1 + "+" + f2 + "=" + f3);
            f1=f2;
            f2=f3;
        }
        System.out.println();
        System.out.println(n+ ". fibonacci number= " + f3);
    }
}
