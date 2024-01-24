import java.util.Scanner;

public class Divide34 {
    public static void main(String[] args) {

        int k;
        int sum = 0 ;
        int loop= 0 ;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number!");
        k=scan.nextInt();
        scan.close();

        for(int i=1 ; i<=k ; i++ ){
            if(i % 3 ==0 && i % 4 ==0){
                loop ++;
                sum += i;
            }
        }
        double result = sum / loop;
        System.out.println(result);
    }
}
