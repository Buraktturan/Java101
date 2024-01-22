import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {
        double a,b,c;

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a number");
        a=scan.nextDouble();
        System.out.println("Please Enter a number");
        b=scan.nextDouble();
        System.out.println("Please Enter a number");
        c=scan.nextDouble();
        scan.close();

        if (a>b && a>c && b>c){
            System.out.println(a + " > " + b + " > " + c );
        }else if (a>c && a<b && b>c){
            System.out.println(b + " > " + a + " > " + c );
        }else if (c>a && a>b && c>b){
            System.out.println(c + " > " + a + " > " + b );
        }else if (c<b && b>a && a<c){
            System.out.println(b + " > " + c + " > " + a );
        }else if (a>b && a>c && c>b){
            System.out.println(a + " > " + c + " > " + b );
        }else{
            System.out.println(c + " > " + b + " > " + a);
        }
    }
}
