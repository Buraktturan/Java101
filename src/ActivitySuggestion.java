import java.util.Scanner;

public class ActivitySuggestion {
    public static void main(String[] args) {
        double heat;

        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter the Air Temperature");
        heat=scan.nextDouble();
        scan.close();

        if(heat<5){
            System.out.println("You should go skiing");
        }else if (5<=heat && heat<=15){
            System.out.println("You should go cinema");
        }else if (15<heat && heat<=25){
            System.out.println("You should go picnic");
        }else {
            System.out.println("You should go swimming");
        }
    }
}
