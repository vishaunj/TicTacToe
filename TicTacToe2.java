// Vishaun Jones
// 03=02-2022
// Silei Song
// CGS3416
// Assignment 3 = TicTacToe2

import java.util.Scanner;

public class TicTacToe2 {
    public static boolean move(int index1, int index2, int player, int[][] board) {
        //Is user inputs are valid and the board space is free then the method will return true
        if (index1 < 3 && index2 < 3 && board[index1][index2] == 0) {
            board[index1][index2] = player;
            return true;
        } else {
            return false;
        }
    }

    public static boolean isFull(int[][] board){
        int boardFull = 0;
        //Loop through array adding 1 to boardFull variable if the index is greater than 0
        for (int[] row : board) {
            for (int i : row) {
                if (row[i] > 0) {
                    boardFull += 1;
                }
            }
        }
        //If the boardFull variable equals 9 then the board is full and the method will return true
        if (boardFull == 9) {
            return true;
        } else {
            return false;
        }
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        //Define Variables
        int k = 0;
        int index1;
        int index2;
        int player;
        boolean checkMove;
        boolean checkFull;

        //Declaring and Initializing Array
        int[][] board = new int[3][3];

        //Game start statement
        System.out.println("Welcome to Tic Tac Toe");

        while (k == 0) {
            //Player 1 Loop
            System.out.println("Player 1, please enter your move:");
            while (k == 0) {
                index1 = in.nextInt() - 1;

                //Game Exit Check
                if (index1 == -1) {
                    k = 1;
                    break;
                }

                index2 = in.nextInt() - 1;
                player = 1;

                //Methods for checking if the move is valid and if the board is full
                checkMove = move(index1, index2, player, board);
                checkFull = isFull(board);

                //Exit of board is full
                if (checkFull) {
                    System.out.println("Board is full!");
                    k = 1;
                    break;
                }

                //Print Board or Input Correct Move
                if (checkMove) {
                    for (int i = 0; i < 3; i++) {
                        for(int j = 0; j < 3; j++) {
                            System.out.print(board[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                } else {
                    System.out.println("Invalid move. Please try again:");
                }

            }
            //Game Exit Check
            if (k == 1) {
                break;
            }
            //Player 2 Loop
            System.out.println("Player 2, please enter your move:");
            while (k == 0) {
                index1 = in.nextInt() - 1;

                //Game Exit Check
                if (index1 == -1) {
                    k = 1;
                    break;
                }

                index2 = in.nextInt() - 1;
                player = 2;

                //Methods for checking if the move is valid and if the board is full
                checkMove = move(index1, index2, player, board);
                checkFull = isFull(board);

                //Exit of board is full
                if (checkFull) {
                    System.out.println("Board is full!");
                    k = 1;
                    break;
                }

                //Print Board or Input Correct Move
                if (checkMove) {
                    for (int i = 0; i < 3; i++) {
                        for(int j = 0; j < 3; j++) {
                            System.out.print(board[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                } else {
                    System.out.println("Invalid move. Please try again:");
                }

            }
        }
        System.out.print("Thanks for playing.");
    }

}
