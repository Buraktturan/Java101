import java.util.Scanner;

public class Greengrocer {
    public static void main(String[] args){

        double pear,apple,tomato,banana,aubergine,total;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Kg of Pear :");
        pear= scan.nextDouble();
        System.out.print("Enter the Kg of Apple :");
        apple= scan.nextDouble();
        System.out.print("Enter the Kg of Tomato :");
        tomato= scan.nextDouble();
        System.out.print("Enter the Kg of Banana :");
        banana= scan.nextDouble();
        System.out.print("Enter the Kg of Aubergine :");
        aubergine= scan.nextDouble();
        scan.close();

        total= ((pear * 2.14) + (apple * 3.67) + (tomato * 1.11) + (banana * 0.95) + (aubergine * 5.00));
        System.out.print("Total Price :" + total);
    }
}
