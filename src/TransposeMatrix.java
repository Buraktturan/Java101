import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int row = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını girin: ");
        int col = scanner.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }



        int[][] transpose = transposeMatrix(matrix);


        System.out.println("Transpozu:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }


    public static int[][] transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }
}
