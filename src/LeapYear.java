import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        int year, leapyear;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Year!");
        year = scan.nextInt();

        leapyear = (year % 400);

        switch (leapyear) {
            case 0:
                System.out.println(year + " is leap year!");
                break;
            default:
                System.out.println(year + " not leap year!");
        }
    }
}