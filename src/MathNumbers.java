import java.util.Scanner;

public class MathNumbers {
    public static void main(String[] args) {

        int k;
        int sum=0;

        do {
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter a number: ");
            k=scan.nextInt();
            if(k%2==0 && k%4==0){
                sum=sum+k;
            }
        }
        while (k%2 == 0);
        System.out.println(sum);
    }
}
