import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {

        int day, month;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter just Birth Day");
        day = scan.nextInt();
        System.out.println("Please Enter just Birth Month");
        month = scan.nextInt();
        scan.close();

        if (day <= 31 && month <= 12) {
            if (month == 1) {
                if (day <= 21) {
                    System.out.println("Oğlak Burcu");
                } else {
                    System.out.println("Kova Burcu");
                }
            }
            if (month == 2) {
                if (day <= 19) {
                    System.out.println("Kova Burcu");
                } else {
                    System.out.println("Balık Burcu");
                }
            }
            if (month == 3) {
                if (day <= 20) {
                    System.out.println("Balık Burcu");
                } else {
                    System.out.println("Koç Burcu");
                }
            }
            if (month == 4) {
                if (day <= 20) {
                    System.out.println("Koç Burcu");
                } else {
                    System.out.println("Boğa Burcu");
                }
            }
            if (month == 5) {
                if (day <= 21) {
                    System.out.println("Boğa Burcu");
                } else {
                    System.out.println("İkizler Burcu");
                    }
            }
            if (month == 6) {
                if (day <= 22) {
                    System.out.println("İkizler Burcu");
                } else {
                    System.out.println("Yengeç Burcu");
                }
            }
            if (month == 7) {
                if (day <= 22) {
                    System.out.println("Yengeç Burcu");
                } else {
                    System.out.println("Aslan Burcu");
                }
            }
            if (month == 8) {
                if (day <= 22) {
                    System.out.println("Aslan Burcu");
                } else {
                    System.out.println("Başak Burcu");
                }
            }
            if (month == 9) {
                if (day <= 22) {
                    System.out.println("Başak Burcu");
                } else {
                    System.out.println("Terazi Burcu");
                }
            }
            if (month == 10) {
                if (day <= 22) {
                    System.out.println("Terazi Burcu");
                } else {
                    System.out.println("Akrep Burcu");
                }
            }
            if (month == 11) {
                if (day <= 21) {
                    System.out.println("Akrep Burcu");
                } else {
                    System.out.println("Yay Burcu");
                }
            }
            if (month == 12) {
                if (day <= 21) {
                    System.out.println("Yay Burcu");
                } else {
                    System.out.println("Oğlak Burcu");
                }
            }
                } else
                    System.out.println("Please Select Valid Day and Month!");
        }
}
