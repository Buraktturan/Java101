import java.util.Scanner;

public class Power45 {
    public static void main(String[] args) {

        int n;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number: ");
        n= scan.nextInt();

        for (int i =1; i <=n; i=i*4){
            System.out.println(i);
        }
        System.out.println("----------------");
        for (int i =1; i <=n; i=i*5) {
            System.out.println(i);
        }
    }
}
