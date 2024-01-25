import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {

        int n,k;
        int result=1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        n=scan.nextInt();
        System.out.print("Enter power number: ");
        k=scan.nextInt();

        for (int i=1;i<=k;i++){
        result=result*n;
        }
        System.out.println(result);
    }
}
