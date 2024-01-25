import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {

        int n;
        double result=0;

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=scan.nextInt();

        for(double i=1;i<=n;i++){
            result=(result+(1/i));
        }
        System.out.println(result);
    }
}
