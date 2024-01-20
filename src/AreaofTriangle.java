import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args){

        Scanner Scan = new Scanner(System.in);
        double firstedge,secondedge,thirdedge,u,area;
        System.out.println("Enter the First Edge!");
        firstedge = Scan.nextDouble();
        System.out.println("Enter the Second Edge!");
        secondedge = Scan.nextDouble();
        System.out.println("Enter the Third Edge!");
        thirdedge = Scan.nextDouble();
        Scan.close();

        u = (firstedge + secondedge + thirdedge ) / 2 ;
        area = Math.sqrt(u * (u-firstedge) * (u-secondedge) * (u-thirdedge));
        System.out.println("Area of Triangle =" + area );
    }
}
