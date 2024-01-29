import java.util.Scanner;
public class PrimeNumber2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 2) {
            System.out.println(number + " is not prime number.");
        } else {
            if (asalKontrol(number, number / 2)) {
                System.out.println(number + " is prime number.");
            } else {
                System.out.println(number + " is not prime number.");
            }
        }
    }

    public static boolean asalKontrol(int sayi, int i) {
        if (i == 1) {
            return true;
        } else {
            if (sayi % i == 0) {
                return false;
            } else {
                return asalKontrol(sayi, i - 1);
            }
        }
    }

}