package KauflandExampleContest.StarMines;

import java.util.Scanner;

public class Main {
    static int[][] battlefield;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] battlefieldSize = scanner.nextLine().split(",");
        int rows = Integer.parseInt(battlefieldSize[0]);
        int cols = Integer.parseInt(battlefieldSize[1]);

      battlefield = new int[cols][rows];

        for (int i = 0 ; i < cols; i ++){
            for (int k = 0; k < rows; k++){
                battlefield[i][k] = 100;
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("GAME OVER")){
            String[] inputTokens = input.split(",");
            if (inputTokens.length == 3) {

                int col = Integer.parseInt(inputTokens[0]);
                int row = Integer.parseInt(inputTokens[1]);
                int damage = Integer.parseInt(inputTokens[2]);

                if (col < cols && row < rows && col >= 0 && row >= 0) {
                    takeDamage(damage, col, row);

                    if (row == 0) {
                        if (col == 0) {
                            takeDamage(10, col + 1, row);
                            takeDamage(10, col + 1, row + 1);
                            takeDamage(10, col, row + 1);

                        } else if (col + 1 == cols) {
                            takeDamage(10, col, row + 1);
                            takeDamage(10, col - 1, row + 1);
                            takeDamage(10, col - 1, row);
                        } else {
                            takeDamage(10, col - 1, row);
                            takeDamage(10, col + 1, row);
                            takeDamage(10, col - 1, row + 1);
                            takeDamage(10, col, row + 1);
                            takeDamage(10, col + 1, row + 1);
                        }
                    } else if (row == rows - 1) {
                        if (col == 0) {
                            takeDamage(10, col + 1, row);
                            takeDamage(10, col + 1, row - 1);
                            takeDamage(10, col, row - 1);

                        } else if (col + 1 == cols) {
                            takeDamage(10, col, row - 1);
                            takeDamage(10, col - 1, row - 1);
                            takeDamage(10, col - 1, row);
                        } else {
                            takeDamage(10, col - 1, row);
                            takeDamage(10, col + 1, row);
                            takeDamage(10, col - 1, row - 1);
                            takeDamage(10, col, row - 1);
                            takeDamage(10, col + 1, row - 1);
                        }
                    } else if (col == 0) {
                        takeDamage(10, col + 1, row);
                        takeDamage(10, col + 1, row - 1);
                        takeDamage(10, col, row - 1);
                        takeDamage(10, col, row + 1);
                        takeDamage(10, col + 1, row + 1);

                    } else if (col == cols - 1) {
                        takeDamage(10, col - 1, row);
                        takeDamage(10, col - 1, row - 1);
                        takeDamage(10, col, row - 1);
                        takeDamage(10, col, row + 1);
                        takeDamage(10, col - 1, row + 1);
                    } else {
                        takeDamage(10, col - 1, row - 1);
                        takeDamage(10, col, row - 1);
                        takeDamage(10, col + 1, row - 1);
                        takeDamage(10, col + 1, row);
                        takeDamage(10, col + 1, row + 1);
                        takeDamage(10, col, row + 1);
                        takeDamage(10, col - 1, row + 1);
                        takeDamage(10, col - 1, row);
                    }

                }

            }
            input = scanner.nextLine();
        }
        printMatrix(battlefield);

    }

    private static void takeDamage(int damage, int col, int row){
        if(damage > battlefield[col][row]){
            battlefield[col][row] = 0;
        } else {
            battlefield[col][row] -= damage;
        }
    }

    private static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int k = 0; k < matrix[i].length; k++){
                if (matrix[i][k] < 0){
                    System.out.print(0 + " ");
                }else{
                    System.out.print(matrix[i][k] + " ");
                }
            }
            System.out.println();
        }
    }
}
