package MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row,column;

        while(true) {
            System.out.println("Welcome to the MineSweeper :)");
            System.out.print("Please Enter Row Number: ");
            row = scan.nextInt();
            System.out.print("Please Enter Column Number: ");
            column = scan.nextInt();

            if (row <= 1 && column <= 1) {
                System.out.println("You can not choose this size!");
            }else {
                break;
            }
        }
        MineSweeper mine = new MineSweeper(row,column);
        mine.run();
        mine.print(mine.map);
    }
}
