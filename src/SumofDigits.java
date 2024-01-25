import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {

        int num,dignum;
        int result=0;

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Number: ");
        num=scan.nextInt();

        while(num!=0){
            dignum=num%10;
            num=num/10;
            result=result+dignum;
        }
        System.out.println(result);
    }
}
