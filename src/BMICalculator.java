import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){

        double  h,w,bmi;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Your Height (Meter!) :");
        h=scan.nextDouble();
        System.out.print("Please Enter Your Weight :");
        w=scan.nextDouble();
        scan.close();

        bmi = (w / (h * h));

        System.out.print("Your BMI :" + bmi);
    }
}
