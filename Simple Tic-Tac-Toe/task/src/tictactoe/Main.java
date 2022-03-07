package tictactoe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = false;
        int numberOfXSquares;
        int numberOfOSquares;
        int numberOfEmptySquares;
        ArrayList<Integer> coordinates = new ArrayList<>();
        ArrayList<String> winner = new ArrayList<>();
        boolean playerX = true;
        String currentPlayer;

        Scanner scanner = new Scanner(System.in);

        //------------------------
        int counter = 0;
        String[][] initialGrid = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                initialGrid[i][j] = "_";
                counter++;
            }
        }

        //------------------------
        System.out.println("---------");
        System.out.println("| " + initialGrid[0][0] + " " + initialGrid[0][1] + " " + initialGrid[0][2] + " |");
        System.out.println("| " + initialGrid[1][0] + " " + initialGrid[1][1] + " " + initialGrid[1][2] + " |");
        System.out.println("| " + initialGrid[2][0] + " " + initialGrid[2][1] + " " + initialGrid[2][2] + " |");
        System.out.println("---------");

        while (!gameOver) {

            //------------------------
            boolean validInput = false;
            currentPlayer = playerX ? "X" : "O";
            do {

                System.out.print("Enter the coordinates: ");
                int i = 0;
                while (i < 2) {
                    coordinates.add(scanner.nextInt());
                    i++;
                }
                if (
                        coordinates.get(0) < 4
                                && coordinates.get(1) < 4
                                && initialGrid[coordinates.get(0) - 1][coordinates.get(1) - 1].equals("_")
                ) {
                    initialGrid[coordinates.get(0) - 1][coordinates.get(1) - 1] = currentPlayer;
                    coordinates.clear();
                    validInput = true;
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                    coordinates.clear();
                }

                //------------------------
                System.out.println("---------");
                System.out.println("| " + initialGrid[0][0] + " " + initialGrid[0][1] + " " + initialGrid[0][2] + " |");
                System.out.println("| " + initialGrid[1][0] + " " + initialGrid[1][1] + " " + initialGrid[1][2] + " |");
                System.out.println("| " + initialGrid[2][0] + " " + initialGrid[2][1] + " " + initialGrid[2][2] + " |");
                System.out.println("---------");

            } while (!validInput);

            playerX = !playerX;

            //------------------------
            numberOfXSquares = 0;
            numberOfOSquares = 0;
            numberOfEmptySquares = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (initialGrid[i][j].equals("_")) {
                        numberOfEmptySquares++;
                    } else if (initialGrid[i][j].equals("X")) {
                        numberOfXSquares++;
                    } else {
                        numberOfOSquares++;
                    }
                }
            }

            //------------------------
            if (!initialGrid[0][0].equals("_") && initialGrid[0][0].equals(initialGrid[0][1]) && initialGrid[0][0].equals(initialGrid[0][2])) {
                winner.add(initialGrid[0][0]);
            }
            if (!initialGrid[1][0].equals("_") && initialGrid[1][0].equals(initialGrid[1][1]) && initialGrid[1][0].equals(initialGrid[1][2])) {
                winner.add(initialGrid[1][0]);
            }
            if (!initialGrid[2][0].equals("_") && initialGrid[2][0].equals(initialGrid[2][1]) && initialGrid[2][0].equals(initialGrid[2][2])) {
                winner.add(initialGrid[2][0]);
            }
            if (!initialGrid[0][0].equals("_") && initialGrid[0][0].equals(initialGrid[1][0]) && initialGrid[0][0].equals(initialGrid[2][0])) {
                winner.add(initialGrid[0][0]);
            }
            if (!initialGrid[0][1].equals("_") && initialGrid[0][1].equals(initialGrid[1][1]) && initialGrid[0][1].equals(initialGrid[2][1])) {
                winner.add(initialGrid[0][1]);
            }
            if (!initialGrid[0][2].equals("_") && initialGrid[0][2].equals(initialGrid[1][2]) && initialGrid[0][2].equals(initialGrid[2][2])) {
                winner.add(initialGrid[0][2]);
            }
            if (!initialGrid[0][0].equals("_") && initialGrid[0][0].equals(initialGrid[1][1]) && initialGrid[0][0].equals(initialGrid[2][2])) {
                winner.add(initialGrid[0][0]);
            }
            if (!initialGrid[0][2].equals("_") && initialGrid[0][2].equals(initialGrid[1][1]) && initialGrid[0][2].equals(initialGrid[2][0])) {
                winner.add(initialGrid[0][2]);
            }

            //------------------------

            Main tictactoe =  new Main();
            gameOver = tictactoe.checkGameResult(winner, numberOfXSquares, numberOfOSquares, numberOfEmptySquares);

        }
    }

    private boolean checkGameResult(ArrayList<String> winner, int numberOfXSquares, int numberOfOSquares, int numberOfEmptySquares) {
        boolean gameOver = false;

        if (winner.contains("X") && winner.contains("O")) {
            System.out.println("Impossible");
            gameOver = true;
        } else if (numberOfXSquares - numberOfOSquares > 1 || numberOfOSquares - numberOfXSquares > 1) {
            System.out.println("Impossible");
            gameOver = true;
        } else if (winner.isEmpty() && numberOfEmptySquares == 0) {
            gameOver = true;
            System.out.println("Draw");
        } else if (winner.isEmpty() && numberOfEmptySquares > 0) {
            System.out.println("Game not finished");
        } else {
            System.out.println(winner.get(0) + " wins");
            gameOver = true;
        }

        return gameOver;

    }

}
