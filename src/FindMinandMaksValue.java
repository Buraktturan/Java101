import java.util.Scanner;

public class FindMinandMaksValue {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.print("How many number enter you want?: ");
        int n= scan.nextInt();
        int biggestn=0,smallestn=0;

            for(int i =1;i<=n;i++ ) {
            System.out.print("Enter "+ i +" . "+"Number: ");
            int n1= scan.nextInt();

            if(i==1){
                biggestn=n1;
                smallestn=n1;
            }
            if(n1>biggestn){
                biggestn=n1;
            }
            if(n1<smallestn){
                smallestn=n1;
            }
        }
        System.out.println("Maksimum number: " + biggestn);
        System.out.println("Minumum number: " + smallestn);
    }
}
