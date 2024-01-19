import java.util.Scanner;

public class KdvPrice {
    public static void main(String[] args) {

        double price,pricewithkdv;

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the price!");
        price= Scan.nextDouble();
        Scan.close();

        double kdvratio = price <= 1000 ? 0.18 : 0.08;

        pricewithkdv = price + (price * kdvratio);
        System.out.println("Price without KDV=" + price);
        System.out.println("Price with KDV=" + pricewithkdv);
        System.out.println("KDVratio=" + kdvratio);
    }
}