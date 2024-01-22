import java.util.Scanner;

public class SınıfGeçme {
    public static void main(String[] args) {

        double math, physics, turkish, chemistry, music, average;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Math grade");
        math = scan.nextDouble();
        System.out.println("Enter the Physics grade");
        physics = scan.nextDouble();
        System.out.println("Enter the Turkish grade");
        turkish = scan.nextDouble();
        System.out.println("Enter the Chemistry grade");
        chemistry = scan.nextDouble();
        System.out.println("Enter the Music grade");
        music = scan.nextDouble();
        scan.close();

        if (0 <= math && math <= 100 &&
                0 <= physics && physics <= 100 &&
                0 <= turkish && turkish <= 100 &&
                0 <= chemistry && chemistry <= 100 &&
                0 <= music && music <= 100) {
            average = (math + physics + turkish + chemistry + music) / 5;
            System.out.println("Your Average Grade :" + average);
            if (average >= 55) {
                System.out.println("Congratulations! You passed.");
            } else
                System.out.println("You could not pass.");
        } else
            System.out.println("Invalid grades. Please enter grades between 0 and 100.");
    }
}