import java.util.Scanner;

public class AreaofCircle {
    public static void main (String[] args){

        double r,a,pi =3.14;

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the Radius");
        r =Scan.nextDouble();
        System.out.println("Enter the Centre angle");
        a =Scan.nextDouble();
        Scan.close();

        double Area = (pi * r * r);
        double Perimeter = (2 * pi * r);
        double CircleSectorArea =  (pi * (r*r) * a ) / 360 ;

        System.out.println("AreaofCircle = " + Area );
        System.out.println("PerimeterofCircle = " + Perimeter );
        System.out.println("AreaofSectorCircle = " + CircleSectorArea );

    }
}
