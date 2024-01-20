import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        double Km,price,u=2.20,startprice=10;

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the Km!");
        Km = Scan.nextDouble();
        Scan.close();

        price = startprice + (Km * u);
        price = (price<=20) ? 20 : price ;
        System.out.println("Price=" + price);
    }
}
