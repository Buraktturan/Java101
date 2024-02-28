package MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber, colNumber, size;
    char[][] map;
    char[][] board;
    Random mine = new Random();
    Scanner scan=new Scanner(System.in);
    boolean game =true;

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new char[rowNumber][colNumber];
        this.board = new char[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void run() {
        int row,col,success=0;
        prepareGame();
        //print(map);
        System.out.println("Game Start!");
        while(game){
            print(board);
            System.out.print("Row : ");
            row=scan.nextInt();
            System.out.print("Col : ");
            col= scan.nextInt();

            if ((row<0) || row >=rowNumber){
                System.out.println("Wrong Coordinate!");
                continue;
            }
            if ((col<0) || col >=colNumber){
                System.out.println("Wrong Coordinate!");
                continue;
            }

            if (board[row][col] != '-') {
                System.out.println("You already selected this coordinate!");
                continue;
            }
            if (map[row][col] != '*'){
                check(row,col);
                success++;
                if (success==((size)-(size/4))){
                    System.out.println("Congratulations You Win! :)");
                    break;
                }
            }else {
                game= false;

                System.out.println("Game Over! :(");
            }
        }
    }
    public void check(int r, int c) {
        if (map[r][c] == '-') {
            int count = 0;

            if (c < colNumber - 1 && map[r][c + 1] == '*') {
                count++;
            }
            if (c > 0 && map[r][c - 1] == '*') {
                count++;
            }
            if (r < rowNumber - 1 && map[r + 1][c] == '*') {
                count++;
            }
            if (r > 0 && map[r - 1][c] == '*') {
                count++;
            }
            if (r < rowNumber - 1 && c < colNumber - 1 && map[r + 1][c + 1] == '*') {
                count++;
            }
            if (r > 0 && c > 0 && map[r - 1][c - 1] == '*') {
                count++;
            }
            if (r > 0 && c < colNumber - 1 && map[r - 1][c + 1] == '*') {
                count++;
            }
            if (r < rowNumber - 1 && c > 0 && map[r + 1][c - 1] == '*') {
                count++;
            }
            if (count == 0) {
                board[r][c] = '0';
            } else {
                board[r][c] = (char) (count + '0');
            }
        }
    }


    public void prepareGame() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                map[i][j] = '-';
            }
        }
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                board[i][j] = '-';
            }
        }

        int randRow, randCol, count = 0;
        while (count != (size / 4)) {
            randRow = mine.nextInt(rowNumber);
            randCol = mine.nextInt(colNumber);
            if (map[randRow][randCol] != '*') {
                map[randRow][randCol] = '*';
                count++;
            }
        }
    }

    public void print(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]>=0){
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
