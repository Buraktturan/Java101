import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int right=5;
        int number = (int) (Math.random() * 100);
        Scanner scan = new Scanner(System.in);

            while (right>0){
                System.out.println("Please Enter Your Guess!");
                int guessNumber =scan.nextInt();
                if (guessNumber<0 || guessNumber>100) {
                    System.out.println("Entered Wrong Number! Please Enter between 0-100.");
                }else if (guessNumber!=number){
                    System.out.println("Wrong Guess :( ");
                    System.out.println("Left Right: " + (right-1));
                    right--;

                    if (guessNumber>number) {
                        System.out.println("Number bigger than secret number.");
                    }else{
                        System.out.println("Number smaller than secret number.");
                    }
                    if (right==0){
                        System.out.println("Sorry You Lost :(");
                        System.out.println("Number is:" + number);
                    }
                }else {
                    System.out.println("Congratulations.You Win :)");
                    break;
                }
            }

    }
}
