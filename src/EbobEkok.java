import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        int n1,n2;

        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number: ");
        n1= scan.nextInt();
        System.out.print("Enter other number: ");
        n2= scan.nextInt();

        int i=1;
        while(i<=(n1*n2)){
            i++;
            if (i%n1==0 && i%n2==0){
                System.out.println("Ekok=" + i);
                break;
            }
        }

        int j=n1;
        while(j<=n1) {
            j--;
            if (n1 % j == 0 && n2 % j == 0) {
                System.out.println("Ebob=" + j);
                break;
            }
        }
    }
}
