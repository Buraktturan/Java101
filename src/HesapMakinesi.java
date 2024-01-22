import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double number1, number2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number");
        number1 = scan.nextDouble();
        System.out.println("Enter Second Number");
        number2 = scan.nextDouble();
        System.out.println("Please Choose Operation(+ , - , * , /)");
        String op = scan.next();
        scan.close();

        switch (op) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                if (number2 != 0) {
                    System.out.println(number1 / number2);
                } else {
                    System.out.println("SYNTAX ERROR");
                    break;
                }
            default:
                System.out.println("Invalid Operation");
        }
    }
}