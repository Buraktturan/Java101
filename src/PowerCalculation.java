import java.util.Scanner;

public class PowerCalculation {

    static int power(int a, int b) {
        if (b == 0) {
            System.out.println("1");
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Result = " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter power number: ");
        int power = scanner.nextInt();
        scanner.close();
        power(number, power);
    }
}