package com.kodilla;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    char [][] gameField3X3 = new char [3][3];
    char [][] gameField10X10 = new char [10][10];
    int row;
    int col;
    public void playerOneMove3X3() {
        boolean end = false;
        while (!end) {
            System.out.println("Player 1 chose row");
            row = scanner.nextInt() - 1;
            System.out.println("Player 1 chose column");
            col = scanner.nextInt() - 1;
            if (row > 2 || col > 2 || row < 0 || col < 0) {
                System.out.println("Write correct coordinate");
            } else if (gameField3X3[row][col] == 'X' || gameField3X3[row][col] == 'O') {
                System.out.println("This field is already in use. Chose other field");
            } else {
                gameField3X3[row][col] = 'X';
                end = true;
            }
        }
    }
    public void playerOneMove10X10() {
        boolean end = false;
        while (!end) {
            System.out.println("Player 1 chose row");
            row = scanner.nextInt() - 1;
            System.out.println("Player 1 chose column");
            col = scanner.nextInt() - 1;
            if (row > 9 || col > 9 || row < 0 || col < 0) {
                System.out.println("Write correct coordinate");
            } else if (gameField3X3[row][col] == 'X' || gameField3X3[row][col] == 'O') {
                System.out.println("This field is already in use. Chose other field");
            } else {
                gameField3X3[row][col] = 'X';
                end = true;
            }
        }
    }
    public void playerComputerMove3X3() {
        boolean end = false;
        Random random = new Random();
        while (!end) {
            row = random.nextInt(3);
            col = random.nextInt(3);
            if (gameField3X3[row][col] == ' ') {
                gameField3X3[row][col] = 'O';
                end = true;
            } else {
                end = false;
            }
        }
    }
    public void playerComputerMove10X10() {
        boolean end = false;
        Random random = new Random();
        while (!end) {
            row = random.nextInt(10);
            col = random.nextInt(10);
            if (gameField10X10[row][col] == ' ') {
                gameField10X10[row][col] = 'O';
                end = true;
            } else {
                end = false;
            }
        }
    }
    public void playerTwoMove3X3() {
        boolean end = false;
        while (!end) {
            System.out.println("Player 2 chose row");
            row = scanner.nextInt() - 1;
            System.out.println("Player 2 chose column");
            col = scanner.nextInt() - 1;
            if (row > 2 || col > 2 || row < 0 || col < 0) {
                System.out.println("Write correct coordinate");
            } else if (gameField3X3[row][col] == 'X' || gameField3X3[row][col] == 'O') {
                System.out.println("This field is already in use. Chose other field");
            } else {
                gameField3X3[row][col] = 'O';
                end = true;
            }
        }
    }
    public void playerTwoMove10X10() {
        boolean end = false;
        while (!end) {
            System.out.println("Player 2 chose row");
            row = scanner.nextInt() - 1;
            System.out.println("Player 2 chose column");
            col = scanner.nextInt() - 1;
            if (row > 9 || row < 0 || col > 9 || col < 0) {
                System.out.println("Write correct coordinate");
            } else if (gameField3X3[row][col] == 'X' || gameField3X3[row][col] == 'O') {
                System.out.println("This field is already in use. Chose other field");
            } else {
                gameField3X3[row][col] = 'O';
                end = true;
            }
        }
    }
    public void showTable3X3() {
        System.out.println("| " + gameField3X3[0][0] + " | " + gameField3X3[0][1] + " | " + gameField3X3[0][2] + " |");
        System.out.println("| " + gameField3X3[1][0] + " | " + gameField3X3[1][1] + " | " + gameField3X3[1][2] + " |");
        System.out.println("| " + gameField3X3[2][0] + " | " + gameField3X3[2][1] + " | " + gameField3X3[2][2] + " |");
    }
    public void showTable10X10() {
        System.out.println("| " + gameField10X10[0][0] + " | " + gameField10X10[0][1] + " | " + gameField10X10[0][2] + " | " +  gameField10X10[0][3] + " | " + gameField10X10[0][4] + " | " + gameField10X10[0][5] + " | " + gameField10X10[0][6] + " | " + gameField10X10[0][7] + " | " + gameField10X10[0][8] + " | " + gameField10X10[0][9] + " |");
        System.out.println("| " + gameField10X10[1][0] + " | " + gameField10X10[1][1] + " | " + gameField10X10[1][2] + " | " +  gameField10X10[1][3] + " | " + gameField10X10[1][4] + " | " + gameField10X10[1][5] + " | " + gameField10X10[1][6] + " | " + gameField10X10[1][7] + " | " + gameField10X10[1][8] + " | " + gameField10X10[1][9] + " |");
        System.out.println("| " + gameField10X10[2][0] + " | " + gameField10X10[2][1] + " | " + gameField10X10[2][2] + " | " +  gameField10X10[2][3] + " | " + gameField10X10[2][4] + " | " + gameField10X10[2][5] + " | " + gameField10X10[2][6] + " | " + gameField10X10[2][7] + " | " + gameField10X10[2][8] + " | " + gameField10X10[2][9] + " |");
        System.out.println("| " + gameField10X10[3][0] + " | " + gameField10X10[3][1] + " | " + gameField10X10[3][2] + " | " +  gameField10X10[3][3] + " | " + gameField10X10[3][4] + " | " + gameField10X10[3][5] + " | " + gameField10X10[3][6] + " | " + gameField10X10[3][7] + " | " + gameField10X10[3][8] + " | " + gameField10X10[3][9] + " |");
        System.out.println("| " + gameField10X10[4][0] + " | " + gameField10X10[4][1] + " | " + gameField10X10[4][2] + " | " +  gameField10X10[4][3] + " | " + gameField10X10[4][4] + " | " + gameField10X10[4][5] + " | " + gameField10X10[4][6] + " | " + gameField10X10[4][7] + " | " + gameField10X10[4][8] + " | " + gameField10X10[4][9] + " |");
        System.out.println("| " + gameField10X10[5][0] + " | " + gameField10X10[5][1] + " | " + gameField10X10[5][2] + " | " +  gameField10X10[5][3] + " | " + gameField10X10[5][4] + " | " + gameField10X10[5][5] + " | " + gameField10X10[5][6] + " | " + gameField10X10[5][7] + " | " + gameField10X10[5][8] + " | " + gameField10X10[5][9] + " |");
        System.out.println("| " + gameField10X10[6][0] + " | " + gameField10X10[6][1] + " | " + gameField10X10[6][2] + " | " +  gameField10X10[6][3] + " | " + gameField10X10[6][4] + " | " + gameField10X10[6][5] + " | " + gameField10X10[6][6] + " | " + gameField10X10[6][7] + " | " + gameField10X10[6][8] + " | " + gameField10X10[6][9] + " |");
        System.out.println("| " + gameField10X10[7][0] + " | " + gameField10X10[7][1] + " | " + gameField10X10[7][2] + " | " +  gameField10X10[7][3] + " | " + gameField10X10[7][4] + " | " + gameField10X10[7][5] + " | " + gameField10X10[7][6] + " | " + gameField10X10[7][7] + " | " + gameField10X10[7][8] + " | " + gameField10X10[7][9] + " |");
        System.out.println("| " + gameField10X10[8][0] + " | " + gameField10X10[8][1] + " | " + gameField10X10[8][2] + " | " +  gameField10X10[8][3] + " | " + gameField10X10[8][4] + " | " + gameField10X10[8][5] + " | " + gameField10X10[8][6] + " | " + gameField10X10[8][7] + " | " + gameField10X10[8][8] + " | " + gameField10X10[8][9] + " |");
        System.out.println("| " + gameField10X10[9][0] + " | " + gameField10X10[9][1] + " | " + gameField10X10[9][2] + " | " +  gameField10X10[9][3] + " | " + gameField10X10[9][4] + " | " + gameField10X10[9][5] + " | " + gameField10X10[9][6] + " | " + gameField10X10[9][7] + " | " + gameField10X10[9][8] + " | " + gameField10X10[9][9] + " |");
    }
    public boolean checkForWinnerX3X3() {
        StringBuilder winner1 = new StringBuilder();
        StringBuilder winner2 = new StringBuilder();
        StringBuilder winner3 = new StringBuilder();
        StringBuilder winner4 = new StringBuilder();
        StringBuilder winner5 = new StringBuilder();
        StringBuilder winner6 = new StringBuilder();
        StringBuilder winner7 = new StringBuilder();
        StringBuilder winner8 = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            winner1.append(gameField3X3[i][i]);
        }
        for (int i = 0; i < 3; i++) {
            winner2.append(gameField3X3[i][2 - i]);
        }
        for (int i = 0; i < 3; i++) {
            winner3.append(gameField3X3[0][i]);
        }
        for (int i = 0; i < 3; i++) {
            winner4.append(gameField3X3[1][i]);
        }
        for (int i = 0; i < 3; i++) {
            winner5.append(gameField3X3[2][i]);
        }
        for (int i = 0; i < 3; i++) {
            winner6.append(gameField3X3[i][0]);
        }
        for (int i = 0; i < 3; i++) {
            winner7.append(gameField3X3[i][1]);
        }
        for (int i = 0; i < 3; i++) {
            winner8.append(gameField3X3[i][2]);
        }
        String win = "XXX";
        if (winner1.toString().contains(win) || winner2.toString().contains(win) || winner3.toString().contains(win) ||
                winner4.toString().contains(win) || winner5.toString().contains(win) || winner6.toString().contains(win) ||
                winner7.toString().contains(win) || winner8.toString().contains(win)) {
            System.out.println("Player 1 wins");
            return true;
        } else {
            return false;
        }
    }
    public boolean checkForWinnerO3X3() {
        StringBuilder winner1 = new StringBuilder();
        StringBuilder winner2 = new StringBuilder();
        StringBuilder winner3 = new StringBuilder();
        StringBuilder winner4 = new StringBuilder();
        StringBuilder winner5 = new StringBuilder();
        StringBuilder winner6 = new StringBuilder();
        StringBuilder winner7 = new StringBuilder();
        StringBuilder winner8 = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            winner1.append(gameField3X3[i][i]);
        }
        for (int i = 2; i < 3; i++) {
            winner2.append(gameField3X3[i][2 - i]);
        }
        for (int i = 0; i < 3; i++) {
            winner3.append(gameField3X3[0][i]);
        }
        for (int i = 0; i < 3; i++) {
            winner4.append(gameField3X3[1][i]);
        }
        for (int i = 0; i < 3; i++) {
            winner5.append(gameField3X3[2][i]);
        }
        for (int i = 0; i < 3; i++) {
            winner6.append(gameField3X3[i][0]);
        }
        for (int i = 0; i < 3; i++) {
            winner7.append(gameField3X3[i][1]);
        }
        for (int i = 0; i < 3; i++) {
            winner8.append(gameField3X3[i][2]);
        }
        String win = "OOO";
        if (winner1.toString().contains(win) || winner2.toString().contains(win) || winner3.toString().contains(win) ||
                winner4.toString().contains(win) || winner5.toString().contains(win) || winner6.toString().contains(win) ||
                winner7.toString().contains(win) || winner8.toString().contains(win)) {
            System.out.println("Player 2 wins");
            return true;
        } else {
            return false;
        }
    }
    public boolean checkForWinnerX10X10() {
        StringBuilder winner1 = new StringBuilder();
        StringBuilder winner2 = new StringBuilder();
        StringBuilder winner3 = new StringBuilder();
        StringBuilder winner4 = new StringBuilder();
        StringBuilder winner5 = new StringBuilder();
        StringBuilder winner6 = new StringBuilder();
        StringBuilder winner7 = new StringBuilder();
        StringBuilder winner8 = new StringBuilder();
        StringBuilder winner9 = new StringBuilder();
        StringBuilder winner10 = new StringBuilder();
        StringBuilder winner11 = new StringBuilder();
        StringBuilder winner12 = new StringBuilder();
        StringBuilder winner13 = new StringBuilder();
        StringBuilder winner14 = new StringBuilder();
        StringBuilder winner15 = new StringBuilder();
        StringBuilder winner16 = new StringBuilder();
        StringBuilder winner17 = new StringBuilder();
        StringBuilder winner18 = new StringBuilder();
        StringBuilder winner19 = new StringBuilder();
        StringBuilder winner20 = new StringBuilder();
        StringBuilder winner21 = new StringBuilder();
        StringBuilder winner22 = new StringBuilder();
        StringBuilder winner23 = new StringBuilder();
        StringBuilder winner24 = new StringBuilder();
        StringBuilder winner25 = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            winner1.append(gameField10X10[i][i]);
        }
        for (int i = 1; i < 10; i++) {
            winner2.append(gameField10X10[i][i - 1]);
        }
        for (int i = 2; i < 10; i++) {
            winner3.append(gameField10X10[i][i - 2]);
        }
        for (int i = 3; i < 10; i++) {
            winner4.append(gameField10X10[i][i - 3]);
        }
        for (int i = 4; i < 10; i++) {
            winner5.append(gameField10X10[i][i - 4]);
        }
        for (int i = 5; i < 10; i++) {
            winner6.append(gameField10X10[i][i - 5]);
        }
        for (int i = 1; i < 10; i++) {
            winner7.append(gameField10X10[i - 1][i]);
        }
        for (int i = 2; i < 10; i++) {
            winner8.append(gameField10X10[i - 2][i]);
        }
        for (int i = 3; i < 10; i++) {
            winner9.append(gameField10X10[i - 3][i]);
        }
        for (int i = 4; i < 10; i++) {
            winner10.append(gameField10X10[i - 4][i]);
        }
        for (int i = 5; i < 10; i++) {
            winner11.append(gameField10X10[i - 5][i]);
        }
        for (int i = 9; i >= 0; i--) {
            winner12.append(gameField10X10[i][i]);
        }
        for (int i = 0; i < 10; i++) {
            winner13.append(gameField10X10[i][9 - i]);
        }
        for (int i = 0; i < 9; i++) {
            winner14.append(gameField10X10[i][8 - i]);
        }
        for (int i = 0; i < 8; i++) {
            winner15.append(gameField10X10[i][7 - i]);
        }
        for (int i = 0; i < 7; i++) {
            winner16.append(gameField10X10[i][6 - i]);
        }
        for (int i = 0; i < 6; i++) {
            winner17.append(gameField10X10[i][5 - i]);
        }
        for (int i = 0; i < 5; i++) {
            winner18.append(gameField10X10[i][4 - i]);
        }
        for (int i = 1; i < 10; i++) {
            winner19.append(gameField10X10[i][10 - i]);
        }
        for (int i = 2; i < 10; i++) {
            winner20.append(gameField10X10[i][11 - i]);
        }
        for (int i = 3; i < 10; i++) {
            winner21.append(gameField10X10[i][12 - i]);
        }
        for (int i = 4; i < 10; i++) {
            winner22.append(gameField10X10[i][13 - i]);
        }
        for (int i = 5; i < 10; i++) {
            winner23.append(gameField10X10[i][14 - i]);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                winner24.append(gameField10X10[i][j]);
            }
        }
        winner24 = new StringBuilder(winner24.toString().replaceAll("..........", "$0 "));

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                winner25.append(gameField10X10[i][j]);
            }
        }
        winner25 = new StringBuilder(winner25.toString().replaceAll("..........", "$0 "));
        System.out.println(winner25);
        String win = "XXXXX";
        if (winner1.toString().contains(win) || winner2.toString().contains(win) || winner3.toString().contains(win) ||
                winner4.toString().contains(win) || winner5.toString().contains(win) || winner6.toString().contains(win) ||
                winner7.toString().contains(win) || winner8.toString().contains(win) || winner9.toString().contains(win) ||
                winner10.toString().contains(win) || winner11.toString().contains(win) || winner12.toString().contains(win) ||
                winner13.toString().contains(win) || winner14.toString().contains(win) || winner15.toString().contains(win) ||
                winner16.toString().contains(win) || winner17.toString().contains(win) || winner18.toString().contains(win) ||
                winner19.toString().contains(win) || winner20.toString().contains(win) || winner21.toString().contains(win) ||
                winner22.toString().contains(win) || winner23.toString().contains(win) || winner24.toString().contains(win) ||
                winner25.toString().contains(win)) {
            System.out.println("Player 1 wins");
            return true;
        } else {
            return false;
        }
    }
    public boolean checkForWinnerO10X10() {
        StringBuilder winner1 = new StringBuilder();
        StringBuilder winner2 = new StringBuilder();
        StringBuilder winner3 = new StringBuilder();
        StringBuilder winner4 = new StringBuilder();
        StringBuilder winner5 = new StringBuilder();
        StringBuilder winner6 = new StringBuilder();
        StringBuilder winner7 = new StringBuilder();
        StringBuilder winner8 = new StringBuilder();
        StringBuilder winner9 = new StringBuilder();
        StringBuilder winner10 = new StringBuilder();
        StringBuilder winner11 = new StringBuilder();
        StringBuilder winner12 = new StringBuilder();
        StringBuilder winner13 = new StringBuilder();
        StringBuilder winner14 = new StringBuilder();
        StringBuilder winner15 = new StringBuilder();
        StringBuilder winner16 = new StringBuilder();
        StringBuilder winner17 = new StringBuilder();
        StringBuilder winner18 = new StringBuilder();
        StringBuilder winner19 = new StringBuilder();
        StringBuilder winner20 = new StringBuilder();
        StringBuilder winner21 = new StringBuilder();
        StringBuilder winner22 = new StringBuilder();
        StringBuilder winner23 = new StringBuilder();
        StringBuilder winner24 = new StringBuilder();
        StringBuilder winner25 = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            winner1.append(gameField10X10[i][i]);
        }
        for (int i = 1; i < 10; i++) {
            winner2.append(gameField10X10[i][i - 1]);
        }
        for (int i = 2; i < 10; i++) {
            winner3.append(gameField10X10[i][i - 2]);
        }
        for (int i = 3; i < 10; i++) {
            winner4.append(gameField10X10[i][i - 3]);
        }
        for (int i = 4; i < 10; i++) {
            winner5.append(gameField10X10[i][i - 4]);
        }
        for (int i = 5; i < 10; i++) {
            winner6.append(gameField10X10[i][i - 5]);
        }
        for (int i = 1; i < 10; i++) {
            winner7.append(gameField10X10[i - 1][i]);
        }
        for (int i = 2; i < 10; i++) {
            winner8.append(gameField10X10[i - 2][i]);
        }
        for (int i = 3; i < 10; i++) {
            winner9.append(gameField10X10[i - 3][i]);
        }
        for (int i = 4; i < 10; i++) {
            winner10.append(gameField10X10[i - 4][i]);
        }
        for (int i = 5; i < 10; i++) {
            winner11.append(gameField10X10[i - 5][i]);
        }
        for (int i = 9; i >= 0; i--) {
            winner12.append(gameField10X10[i][i]);
        }
        for (int i = 0; i < 10; i++) {
            winner13.append(gameField10X10[i][9 - i]);
        }
        for (int i = 0; i < 9; i++) {
            winner14.append(gameField10X10[i][8 - i]);
        }
        for (int i = 0; i < 8; i++) {
            winner15.append(gameField10X10[i][7 - i]);
        }
        for (int i = 0; i < 7; i++) {
            winner16.append(gameField10X10[i][6 - i]);
        }
        for (int i = 0; i < 6; i++) {
            winner17.append(gameField10X10[i][5 - i]);
        }
        for (int i = 0; i < 5; i++) {
            winner18.append(gameField10X10[i][4 - i]);
        }
        for (int i = 1; i < 10; i++) {
            winner19.append(gameField10X10[i][10 - i]);
        }
        for (int i = 2; i < 10; i++) {
            winner20.append(gameField10X10[i][11 - i]);
        }
        for (int i = 3; i < 10; i++) {
            winner21.append(gameField10X10[i][12 - i]);
        }
        for (int i = 4; i < 10; i++) {
            winner22.append(gameField10X10[i][13 - i]);
        }
        for (int i = 5; i < 10; i++) {
            winner23.append(gameField10X10[i][14 - i]);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                winner24.append(gameField10X10[i][j]);
            }
        }
        winner24 = new StringBuilder(winner24.toString().replaceAll("..........", "$0 "));

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                winner25.append(gameField10X10[i][j]);
            }
        }
        winner25 = new StringBuilder(winner25.toString().replaceAll("..........", "$0 "));
        System.out.println(winner25);
        String win = "OOOOO";
        if (winner1.toString().contains(win) || winner2.toString().contains(win) || winner3.toString().contains(win) ||
                winner4.toString().contains(win) || winner5.toString().contains(win) || winner6.toString().contains(win) ||
                winner7.toString().contains(win) || winner8.toString().contains(win) || winner9.toString().contains(win) ||
                winner10.toString().contains(win) || winner11.toString().contains(win) || winner12.toString().contains(win) ||
                winner13.toString().contains(win) || winner14.toString().contains(win) || winner15.toString().contains(win) ||
                winner16.toString().contains(win) || winner17.toString().contains(win) || winner18.toString().contains(win) ||
                winner19.toString().contains(win) || winner20.toString().contains(win) || winner21.toString().contains(win) ||
                winner22.toString().contains(win) || winner23.toString().contains(win) || winner24.toString().contains(win) ||
                winner25.toString().contains(win)) {
            System.out.println("Player 2 wins");
            return true;
        } else {
            return false;
        }
    }
    public void resetTable3X3() {
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameField3X3[i][j] = ' ';
            }
        }
    }
    public void resetTable10X10() {
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                gameField10X10[i][j] = ' ';
            }
        }

    }
}
