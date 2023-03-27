package com.kodilla;
import java.util.Scanner;

public class TicTacToeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game game = new Game();
        boolean endApp = false;
        boolean turn = true; // true for player one, false for player two
        int movesCounter;

        System.out.println("Welcome in tic tac toe");
        System.out.println();

        while(!endApp) {
            System.out.println("Please select type of game which you want to play");
            System.out.println("Type 1 for 3X3 or 2 for 10X10?");
            System.out.println("If you want to exit the game press X");
            String typeOfGame = scanner.next().toUpperCase();
            switch (typeOfGame) {
                case "1" -> {
                    game.resetTable3X3();
                    movesCounter = 0;
                    System.out.println("Do you want to play against other player or computer?");
                    System.out.println("Type 1 for player or 2 for computer");
                    String player = scanner.next();
                    boolean xWin = false;
                    boolean oWin = false;
                    if (player.equals("1")) {
                        while (xWin || oWin || movesCounter < 10) {
                            if (!xWin && !oWin && turn && movesCounter < 9) {
                                game.showTable3X3();
                                game.playerOneMove3X3();
                                xWin = game.checkForWinnerX3X3();
                                movesCounter++;
                                turn = false;
                            } else if (!xWin && !oWin && !turn && movesCounter < 9) {
                                game.showTable3X3();
                                game.playerTwoMove3X3();
                                oWin = game.checkForWinnerO3X3();
                                movesCounter++;
                                turn = true;
                            } else if (movesCounter == 9) {
                                System.out.println("Draw");
                                movesCounter++;
                            }
                        }
                    } else if (player.equals("2")) {
                        game.showTable3X3();
                        while (xWin || oWin || movesCounter < 10) {
                            if (!xWin && !oWin && turn && movesCounter < 9) {
                                game.playerOneMove3X3();
                                xWin = game.checkForWinnerX3X3();
                                movesCounter++;
                                turn = false;
                            } else if (!xWin && !oWin && !turn && movesCounter < 9) {
                                game.playerComputerMove3X3();
                                game.showTable3X3();
                                oWin = game.checkForWinnerO3X3();
                                movesCounter++;
                                turn = true;
                            } else if (movesCounter == 9) {
                                System.out.println("Draw");
                                movesCounter++;
                            } else {
                                break;
                            }
                        }
                    }
                }
                case "2" -> {
                    game.resetTable10X10();
                    movesCounter = 0;
                    System.out.println("Do you want to play against other player or computer?");
                    System.out.println("Type 1 for player or 2 for computer");
                    String player = scanner.next();
                    boolean xWin = false;
                    boolean oWin = false;
                    if (player.equals("1")) {
                        while (xWin || oWin || movesCounter < 100) {
                            if (!xWin && !oWin && turn && movesCounter < 99) {
                                game.showTable10X10();
                                game.playerOneMove10X10();
                                xWin = game.checkForWinnerX10X10();
                                movesCounter++;
                                turn = false;
                            } else if (!xWin && !oWin && !turn && movesCounter < 99) {
                                game.showTable10X10();
                                game.playerTwoMove10X10();
                                oWin = game.checkForWinnerO10X10();
                                movesCounter++;
                                turn = true;
                            } else if (movesCounter == 100) {
                                System.out.println("Draw");
                                movesCounter++;
                            }
                        }
                    } else if (player.equals("2")) {
                        game.showTable10X10();
                        while (xWin || oWin || movesCounter < 100) {
                            if (!xWin && !oWin && turn && movesCounter < 99) {
                                game.playerOneMove10X10();
                                xWin = game.checkForWinnerX10X10();
                                movesCounter++;
                                turn = false;
                            } else if (!xWin && !oWin && !turn) {
                                game.playerComputerMove10X10();
                                game.showTable10X10();
                                oWin = game.checkForWinnerO10X10();
                                movesCounter++;
                                turn = true;
                            } else if (movesCounter == 100) {
                                System.out.println("Draw");
                            }
                        }
                    }
                }
                case "X" -> endApp = true;
                default -> System.out.println("Choose correct type: 3x3 or 10x10");
            }
        }
    }
}
