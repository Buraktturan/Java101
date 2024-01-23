import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        double km,age,totalPrice;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Flight Km!");
        km=scan.nextDouble();
        System.out.println("Please Enter Your Age!");
        age= scan.nextInt();
        System.out.println("Please Select Your Flight Type");
        System.out.println("1-One Way Ticket");
        System.out.println("2-Round Trip Ticket");
        String choose = scan.next();
        scan.close();

        totalPrice=(km * 0.10);
        if (km<0) {
            System.out.println("Km can not be negative!");
        }
        if (age<0) {
            System.out.println("Age can not be negative!");
        }
        if (choose.equals("1")){
            if(age<12){
                System.out.println("Total Price : " + ((totalPrice)-(totalPrice*50/100)));
            }
            else if ((age>=12) && (age<=24)) {
                System.out.println("Total Price : " + ((totalPrice)-(totalPrice*10/100)));
            }
            else if (age>=65) {
                System.out.println("Total Price : " + ((totalPrice)-(totalPrice*30/100)));
            }
            else
                System.out.println("Total Price : " + totalPrice);
        }
        else if (choose.equals("2")) {
            if(age<12){
               double reducedprice1= ((totalPrice)-(totalPrice*50/100));
                System.out.println("Total Price : " + 2 * ((reducedprice1) - (reducedprice1*20/100)));
            }
            else if ((age>=12) && (age<=24)) {
                double reducedprice2= ((totalPrice)-(totalPrice*10/100));
                System.out.println("Total Price : " + 2 * ((reducedprice2) - (reducedprice2*20/100)));
            }
            else if (age>=65) {
                double reducedprice3= ((totalPrice)-(totalPrice*30/100));
                System.out.println("Total Price : " + 2 * ((reducedprice3) - (reducedprice3*20/100)));
            }
            else
                System.out.println("Total Price : " + 2 * ((totalPrice) - (totalPrice*20/100)));
        }
        else {
            System.out.println("Wrong Flight Type!");
        }
    }
}
