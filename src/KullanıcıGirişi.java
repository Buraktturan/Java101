import java.util.Scanner;

public class KullanıcıGirişi {
    public static void main(String[] args) {
        String userName, password;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Username!");
        userName = scan.next();
        if (userName.equals("BurakTuran")) {
            System.out.println("Please Enter Password!");
            password = scan.next();

            if ((userName.equals("BurakTuran")) && (password.equals("1234"))) {
                System.out.println("Success Login!");

            } else if ((userName.equals("BurakTuran")) && (!password.equals("1234"))) {
                System.out.println("Wrong Password!Would you like to reset your password?(y/n)");
                String choise = scan.next();
                if (choise.equals("y")) {
                    System.out.println("Please Enter New Password!");
                    String newPassword = scan.next();
                    if (newPassword.equals("1234")) {
                        System.out.println("Password can not be the same previous password!Try another password.");
                        newPassword=scan.next();
                        System.out.println("Password Changed!");
                    } else
                        System.out.println("Password Changed!");
                } else if (choise.equals("n")) {
                    System.out.println("Please Try Again Password!");
                }
            }
        } else
            System.out.println("Username Wrong!");
        scan.close();
    }
}