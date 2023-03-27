package com.kodilla;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    char [][] gameField3X3 = new char [3][3];
    char [][] gameField10X10 = new char [10][10];
    int row;
    int col;
    public String playerOneName;
    public String playerTwoName;

    public void playerOneMove3X3() {
        boolean end = false;
        while (!end) {
            System.out.println(playerOneName + " chose row");
            row = scanner.nextInt() - 1;
            System.out.println(playerOneName + " chose column");
            col = scanner.nextInt() - 1;
            if (row > 2 || col > 2 || row < 0 || col < 0) {
                System.out.println("Write correct coordinate");
            } else if (gameField3X3[row][col] == 'X' || gameField3X3[row][col] == 'O') {
                System.out.println("This field is already in use. Chose other field");
            } else if (row < 3 && col < 3){
                gameField3X3[row][col] = 'X';
                end = true;
            }
        }
    }
    public void playerOneMove10X10() {
        boolean end = false;
        while (!end) {
            System.out.println(playerOneName + " chose row");
            row = scanner.nextInt() - 1;
            System.out.println(playerOneName + " chose column");
            col = scanner.nextInt() - 1;
            if (row > 9 || col > 9 || row < 0 || col < 0) {
                System.out.println("Write correct coordinate");
            } else if (gameField3X3[row][col] == 'X' || gameField3X3[row][col] == 'O') {
                System.out.println("This field is already in use. Chose other field");
            } else if (row < 10 && col < 10){
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
    public void playerTwoMove3X3() {
        boolean end = false;
        while (!end) {
            System.out.println(playerTwoName + " chose row");
            row = scanner.nextInt() - 1;
            System.out.println(playerTwoName + " chose column");
            col = scanner.nextInt() - 1;
            if (row > 2 || col > 2 || row < 0 || col < 0) {
                System.out.println("Write correct coordinate");
            } else if (gameField3X3[row][col] == 'X' || gameField3X3[row][col] == 'O') {
                System.out.println("This field is already in use. Chose other field");
            } else if (row < 3 && col < 3){
                gameField3X3[row][col] = 'O';
                end = true;
            }
        }
    }
    public void playerTwoMove10X10() {
        boolean end = false;
        while (!end) {
            System.out.println(playerTwoName + " chose row");
            row = scanner.nextInt() - 1;
            System.out.println(playerTwoName + " chose column");
            col = scanner.nextInt() - 1;
            if (row > 9 || row < 0 || col > 9 || col < 0) {
                System.out.println("Write correct coordinate");
            } else if (gameField3X3[row][col] == 'X' || gameField3X3[row][col] == 'O') {
                System.out.println("This field is already in use. Chose other field");
            } else if (row < 10 && col < 10){
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
        String winner1 = "";
        String winner2 = "";
        String winner3 = "";
        String winner4 = "";
        String winner5 = "";
        String winner6 = "";
        String winner7 = "";
        String winner8 = "";

        for (int i = 0; i < 3; i++) {
            winner1 = winner1 + gameField3X3[i][i];
        }
        for (int i = 0; i < 3; i++) {
            winner2 = winner2 + gameField3X3[i][2-i];
        }
        for (int i = 0; i < 3; i++) {
            winner3 = winner3 + gameField3X3[0][i];
        }
        for (int i = 0; i < 3; i++) {
            winner4 = winner4 + gameField3X3[1][i];
        }
        for (int i = 0; i < 3; i++) {
            winner5 = winner5 + gameField3X3[2][i];
        }
        for (int i = 0; i < 3; i++) {
            winner6 = winner6 + gameField3X3[i][0];
        }
        for (int i = 0; i < 3; i++) {
            winner7 = winner7 + gameField3X3[i][1];
        }
        for (int i = 0; i < 3; i++) {
            winner8 = winner8 + gameField3X3[i][2];
        }
        String win = "XXX";
        if (winner1.contains(win) || winner2.contains(win) || winner3.contains(win) ||
                winner4.contains(win) || winner5.contains(win) || winner6.contains(win) ||
                winner7.contains(win) || winner8.contains(win)) {
            System.out.println(playerOneName + " wins");
            return true;
        } else {
            return false;
        }
    }
    public boolean checkForWinnerO3X3() {
        String winner1 = "";
        String winner2 = "";
        String winner3 = "";
        String winner4 = "";
        String winner5 = "";
        String winner6 = "";
        String winner7 = "";
        String winner8 = "";

        for (int i = 0; i < 3; i++) {
            winner1 = winner1 + gameField3X3[i][i];
        }
        for (int i = 2; i > 3; i++) {
            winner2 = winner2 + gameField3X3[i][2-i];
        }
        for (int i = 0; i < 3; i++) {
            winner3 = winner3 + gameField3X3[0][i];
        }
        for (int i = 0; i < 3; i++) {
            winner4 = winner4 + gameField3X3[1][i];
        }
        for (int i = 0; i < 3; i++) {
            winner5 = winner5 + gameField3X3[2][i];
        }
        for (int i = 0; i < 3; i++) {
            winner6 = winner6 + gameField3X3[i][0];
        }
        for (int i = 0; i < 3; i++) {
            winner7 = winner7 + gameField3X3[i][1];
        }
        for (int i = 0; i < 3; i++) {
            winner8 = winner8 + gameField3X3[i][2];
        }
        String win = "OOO";
        if (winner1.contains(win) || winner2.contains(win) || winner3.contains(win) ||
                winner4.contains(win) || winner5.contains(win) || winner6.contains(win) ||
                winner7.contains(win) || winner8.contains(win)) {
            System.out.println(playerTwoName + " wins");
            return true;
        } else {
            return false;
        }
    }
    public boolean checkForWinnerX10X10() {
        String winner1 = "";
        String winner2 = "";
        String winner3 = "";
        String winner4 = "";
        String winner5 = "";
        String winner6 = "";
        String winner7 = "";
        String winner8 = "";
        String winner9 = "";
        String winner10 = "";
        String winner11 = "";
        String winner12 = "";
        String winner13 = "";
        String winner14 = "";
        String winner15 = "";
        String winner16 = "";
        String winner17 = "";
        String winner18 = "";
        String winner19 = "";
        String winner20 = "";
        String winner21 = "";
        String winner22 = "";
        String winner23 = "";
        String winner24 = "";
        String winner25 = "";

        for (int i = 0; i < 10; i++) {
            winner1 = winner1 + gameField10X10[i][i];
        }
        for (int i = 1; i < 10; i++) {
            winner2 = winner2 + gameField10X10[i][i-1];
        }
        for (int i = 2; i < 10; i++) {
            winner3 = winner3 + gameField10X10[i][i-2];
        }
        for (int i = 3; i < 10; i++) {
            winner4 = winner4 + gameField10X10[i][i-3];
        }
        for (int i = 4; i < 10; i++) {
            winner5 = winner5 + gameField10X10[i][i-4];
        }
        for (int i = 5; i < 10; i++) {
            winner6 = winner6 + gameField10X10[i][i-5];
        }
        for (int i = 1; i < 10; i++) {
            winner7 = winner7 + gameField10X10[i-1][i];
        }
        for (int i = 2; i < 10; i++) {
            winner8 = winner8 + gameField10X10[i-2][i];
        }
        for (int i = 3; i < 10; i++) {
            winner9 = winner9 + gameField10X10[i-3][i];
        }
        for (int i = 4; i < 10; i++) {
            winner10 = winner10 + gameField10X10[i-4][i];
        }
        for (int i = 5; i < 10; i++) {
            winner11 = winner11 + gameField10X10[i-5][i];
        }
        for (int i = 9; i >= 0; i--) {
            winner12 = winner12 + gameField10X10[i][i];
        }
        for (int i = 0; i < 10; i++) {
            winner13 = winner13 + gameField10X10[i][9-i];
        }
        for (int i = 0; i < 9; i++) {
            winner14 = winner14 + gameField10X10[i][8-i];
        }
        for (int i = 0; i < 8; i++) {
            winner15 = winner15 + gameField10X10[i][7-i];
        }
        for (int i = 0; i < 7; i++) {
            winner16 = winner16 + gameField10X10[i][6-i];
        }
        for (int i = 0; i < 6; i++) {
            winner17 = winner17 + gameField10X10[i][5-i];
        }
        for (int i = 0; i < 5; i++) {
            winner18 = winner18 + gameField10X10[i][4-i];
        }
        for (int i = 1; i < 10; i++) {
            winner19 = winner19 + gameField10X10[i][10-i];
        }
        for (int i = 2; i < 10; i++) {
            winner20 = winner20 + gameField10X10[i][11-i];
        }
        for (int i = 3; i < 10; i++) {
            winner21 = winner21 + gameField10X10[i][12-i];
        }
        for (int i = 4; i < 10; i++) {
            winner22 = winner22 + gameField10X10[i][13-i];
        }
        for (int i = 5; i < 10; i++) {
            winner23 = winner23 + gameField10X10[i][14-i];
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                winner24 = winner24 + gameField10X10[i][j];
            }
        }
        winner24 = winner24.replaceAll("..........", "$0 ");

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                winner25 = winner25 + gameField10X10[i][j];
            }
        }
        winner25 = winner25.replaceAll("..........", "$0 ");
        System.out.println(winner25);
        String win = "XXXXX";
        if (winner1.contains(win) || winner2.contains(win) || winner3.contains(win) ||
                winner4.contains(win) || winner5.contains(win) || winner6.contains(win) ||
                winner7.contains(win) || winner8.contains(win) || winner9.contains(win) ||
                winner10.contains(win) || winner11.contains(win) || winner12.contains(win) ||
                winner13.contains(win) || winner14.contains(win) || winner15.contains(win) ||
                winner16.contains(win) || winner17.contains(win) || winner18.contains(win) ||
                winner19.contains(win) || winner20.contains(win) || winner21.contains(win) ||
                winner22.contains(win) || winner23.contains(win) || winner24.contains(win) ||
                winner25.contains(win)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkForWinnerO10X10() {
        String winner1 = "";
        String winner2 = "";
        String winner3 = "";
        String winner4 = "";
        String winner5 = "";
        String winner6 = "";
        String winner7 = "";
        String winner8 = "";
        String winner9 = "";
        String winner10 = "";
        String winner11 = "";
        String winner12 = "";
        String winner13 = "";
        String winner14 = "";
        String winner15 = "";
        String winner16 = "";
        String winner17 = "";
        String winner18 = "";
        String winner19 = "";
        String winner20 = "";
        String winner21 = "";
        String winner22 = "";
        String winner23 = "";
        String winner24 = "";
        String winner25 = "";

        for (int i = 0; i < 10; i++) {
            winner1 = winner1 + gameField10X10[i][i];
        }
        for (int i = 1; i < 10; i++) {
            winner2 = winner2 + gameField10X10[i][i-1];
        }
        for (int i = 2; i < 10; i++) {
            winner3 = winner3 + gameField10X10[i][i-2];
        }
        for (int i = 3; i < 10; i++) {
            winner4 = winner4 + gameField10X10[i][i-3];
        }
        for (int i = 4; i < 10; i++) {
            winner5 = winner5 + gameField10X10[i][i-4];
        }
        for (int i = 5; i < 10; i++) {
            winner6 = winner6 + gameField10X10[i][i-5];
        }
        for (int i = 1; i < 10; i++) {
            winner7 = winner7 + gameField10X10[i-1][i];
        }
        for (int i = 2; i < 10; i++) {
            winner8 = winner8 + gameField10X10[i-2][i];
        }
        for (int i = 3; i < 10; i++) {
            winner9 = winner9 + gameField10X10[i-3][i];
        }
        for (int i = 4; i < 10; i++) {
            winner10 = winner10 + gameField10X10[i-4][i];
        }
        for (int i = 5; i < 10; i++) {
            winner11 = winner11 + gameField10X10[i-5][i];
        }
        for (int i = 9; i >= 0; i--) {
            winner12 = winner12 + gameField10X10[i][i];
        }
        for (int i = 0; i < 10; i++) {
            winner13 = winner13 + gameField10X10[i][9-i];
        }
        for (int i = 0; i < 9; i++) {
            winner14 = winner14 + gameField10X10[i][8-i];
        }
        for (int i = 0; i < 8; i++) {
            winner15 = winner15 + gameField10X10[i][7-i];
        }
        for (int i = 0; i < 7; i++) {
            winner16 = winner16 + gameField10X10[i][6-i];
        }
        for (int i = 0; i < 6; i++) {
            winner17 = winner17 + gameField10X10[i][5-i];
        }
        for (int i = 0; i < 5; i++) {
            winner18 = winner18 + gameField10X10[i][4-i];
        }
        for (int i = 1; i < 10; i++) {
            winner19 = winner19 + gameField10X10[i][10-i];
        }
        for (int i = 2; i < 10; i++) {
            winner20 = winner20 + gameField10X10[i][11-i];
        }
        for (int i = 3; i < 10; i++) {
            winner21 = winner21 + gameField10X10[i][12-i];
        }
        for (int i = 4; i < 10; i++) {
            winner22 = winner22 + gameField10X10[i][13-i];
        }
        for (int i = 5; i < 10; i++) {
            winner23 = winner23 + gameField10X10[i][14-i];
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                winner24 = winner24 + gameField10X10[i][j];
            }
        }
        winner24 = winner24.replaceAll("..........", "$0 ");
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                winner25 = winner25 + gameField10X10[i][j];
            }
        }
        winner25 = winner25.replaceAll("..........", "$0 ");
        System.out.println(winner25);
        String win = "OOOOO";
        if (winner1.contains(win) || winner2.contains(win) || winner3.contains(win) ||
                winner4.contains(win) || winner5.contains(win) || winner6.contains(win) ||
                winner7.contains(win) || winner8.contains(win) || winner9.contains(win) ||
                winner10.contains(win) || winner11.contains(win) || winner12.contains(win) ||
                winner13.contains(win) || winner14.contains(win) || winner15.contains(win) ||
                winner16.contains(win) || winner17.contains(win) || winner18.contains(win) ||
                winner19.contains(win) || winner20.contains(win) || winner21.contains(win) ||
                winner22.contains(win) || winner23.contains(win) || winner24.contains(win) ||
                winner25.contains(win)) {
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
