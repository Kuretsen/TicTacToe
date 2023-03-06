package com.kodilla;

import java.util.Scanner;

public class TicTacToeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game game = new Game();
        boolean end = false;
        int playerOneMoves = 0;
        boolean result;

        while (!end) {
            game.createField();
            game.showTable();
            game.playerOneMove();
            result = game.checkForWinner();
            playerOneMoves ++;

            if (result == true) {
                playerOneMoves = 0;
                System.out.println("Do you want to play next round? y/n");
                if (scanner.next().equals("y") || scanner.next().equals("Y")) {
                    game.resetTable();
                    result = false;
                } else if (scanner.next().equals("n") || scanner.next().equals("N")) {
                    end = true;
                }
            } else if (playerOneMoves == 4) {
                playerOneMoves = 0;
                System.out.println("Draw");
                game.resetTable();
            }

            game.createField();
            game.showTable();
            game.playerTwoMove();
            result = game.checkForWinner();

            if (result == true) {
                playerOneMoves = 0;
                System.out.println("Do you want to play next round? y/n");
                if (scanner.next().equals("y") || scanner.next().equals("Y")) {
                    game.resetTable();
                    result = false;
                } else if (scanner.next().equals("n") || scanner.next().equals("N")) {
                    end = true;
                }
            } else if (playerOneMoves == 5) {
                playerOneMoves = 0;
                System.out.println("Draw");
                game.resetTable();
            }
        }
    }
}
