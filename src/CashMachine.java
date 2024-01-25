import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) {

        String userName, password;
        int right = 3;
        int balance = 3000;
        int select;
        int price;

        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Enter Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("Burak") && password.equals("1234")) {
                System.out.println("Hello, Welcome Garanti Bank");
                do {
                    System.out.println("1-Investment\n" +
                            "2-Withdraw\n" +
                            "3-Balance Inquiry\n" +
                            "4-Quit");
                    System.out.print("Please Choose Process : ");
                    select = input.nextInt();
                    switch (select) {
                    case 1:
                        System.out.print("Amount of Money: ");
                        price = input.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Amount of Money: ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Insufficient Balance!");
                        } else {
                            balance -= price;
                        }
                        break;
                    case 3:
                        System.out.println("Balance : " + balance);
                        break;
                    }
                } while (select != 4);
                System.out.println("See you later.");
                break;
            } else {
                right--;
                System.out.println("Wrong username or password.Please try again.");
                if (right == 0) {
                    System.out.println("Your account banned!Please call bank");
                } else {
                    System.out.println("Try right: " + right);
                }
            }
        }
    }
}
