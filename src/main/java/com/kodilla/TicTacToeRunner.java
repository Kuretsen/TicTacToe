package com.kodilla;

import java.util.Scanner;

public class TicTacToeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game game = new Game();
        boolean endApp = false;
        boolean end = false;
        boolean turn = true; // true for player one, false for player two
        int moves3x3 = 0;

        System.out.println("Welcome in tic tac toe");
        System.out.println();
//        game.playerOneName = scanner.next();
//        game.playerTwoName = scanner.next();

        while(!endApp) {
            System.out.println("Please select type of game which you want to play");
            System.out.println("3X3 or 10X10?");
            System.out.println("If you want to exit the game press X");
            String typeOfGame = scanner.next().toUpperCase();
            if (typeOfGame.equals("3X3")) {
                boolean end1 = false;
                boolean end2 = false;
                game.resetTable3X3();
                moves3x3 = 0;
                System.out.println("Do you want to play against other player or computer?");
                System.out.println("Type: Player or Computer");
                String player = scanner.next().toUpperCase();
                if(player.equals("PLAYER")) {
                    while (end1 == false || end2 == false || moves3x3 == 9 || end == false) {
                        if (!game.checkForWinnerX3X3() && turn == true && moves3x3 < 10) {
                            game.showTable3X3();
                            game.playerOneMove3X3();
                            end1 = game.checkForWinnerX3X3();
                            moves3x3++;
                            turn = false;
                        } else if (game.checkForWinnerO3X3() == false && turn == false) {
                            game.showTable3X3();
                            game.playerTwoMove3X3();
                            end2 = game.checkForWinnerO3X3();
                            moves3x3++;
                            turn = true;
                        } else if (moves3x3 == 9) {
                            System.out.println("Draw");
                            end = true;
                        }
                    }
                }
                if (player.equals("COMPUTER")) {
                    while (end1 == false || end2 == false || moves3x3 == 9 || end == false) {

                        if (!game.checkForWinnerX3X3() || turn || moves3x3 < 10) {
                            game.showTable3X3();
                            game.playerOneMove3X3();
                            end1 = game.checkForWinnerX3X3();
                            moves3x3++;
                            turn = false;
                        } else if (game.checkForWinnerO3X3() == false && turn == false) {
                            game.showTable3X3();
                            game.playerComputerMove3X3();
                            end2 = game.checkForWinnerO3X3();
                            moves3x3++;
                            turn = true;
                        } else if (moves3x3 == 9) {
                            System.out.println("Draw");
                            end = true;
                        }
                    }
                }
            } else if (typeOfGame.equals("10X10")) {
                while (!endApp) {
                    game.showTable10X10();
                    endApp = true;
                }
            } else if (typeOfGame.equals("X")){
                endApp = true;
            } else {
                System.out.println("Choose correct type: 3x3 or 10x10");
            }
        }
    }
}
