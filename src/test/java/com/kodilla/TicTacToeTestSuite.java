package com.kodilla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTestSuite {
    @Test
    public void winnerO3X3RowOne() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        //When
        for (int i = 0; i < 3; i++){
            game.gameField3X3[0][i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO3X3());
    }
    @Test
    public void winnerO3X3RowTwo() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        //When
        for (int i = 0; i < 3; i++){
            game.gameField3X3[1][i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO3X3());
    }
    @Test
    public void winnerO3X3RowThree() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        //When
        for (int i = 0; i < 3; i++) {
            game.gameField3X3[2][i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO3X3());
    }
    @Test
    public void winnerO10X10RowOne() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[0][2+i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10RowTwo() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[1][2+i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10RowThree() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[2][2+i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10RowFour() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[3][2+i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10RowFive() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[4][2+i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10RowSix() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[5][2+i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10RowSeven() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[6][2+i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10RowEight() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[7][2+i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10RowNine() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[8][2+i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10RowTen() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[9][2+i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO3X3ColOne() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        //When
        for (int i = 0; i < 3; i++) {
            game.gameField3X3[i][0] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO3X3());
    }
    @Test
    public void winnerO3X3ColTwo() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        //When
        for (int i = 0; i < 3; i++) {
            game.gameField3X3[i][1] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO3X3());
    }
    @Test
    public void winnerO3X3ColThree() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        //When
        for (int i = 0; i < 3; i++) {
            game.gameField3X3[i][2] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO3X3());
    }
    @Test
    public void winnerO10X10ColOne() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][0] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10ColTwo() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][1] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10ColThree() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][2] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10ColFour() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][3] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10ColFive() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][4] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10ColSix() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][5] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10ColSeven() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][6] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10ColEight() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][7] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10ColNine() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][8] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10ColTen() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][9] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO3X3DiagOne() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        //When
        for (int i = 0; i < 3; i++) {
            game.gameField3X3[i][i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO3X3());
    }
    @Test
    public void winnerO3X3DiagTwo() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        //When
        for (int i = 0; i < 3; i++) {
            game.gameField3X3[i][2-i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO3X3());
    }
    @Test
    public void winnerO10X10DiagOne() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10DiagTwo() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 1; i < 6; i++) {
            game.gameField10X10[i][i-1] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10DiagThree() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 2; i < 7; i++) {
            game.gameField10X10[i][i-2] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10DiagFour() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 3; i < 8; i++) {
            game.gameField10X10[i][i-3] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10DiagFive() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 4; i < 9; i++) {
            game.gameField10X10[i][i-4] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10DiagSix() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 5; i < 10; i++) {
            game.gameField10X10[i][i-5] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10DiagSeven() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 1; i < 6; i++) {
            game.gameField10X10[i-1][i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10DiagEight() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 2; i < 7; i++) {
            game.gameField10X10[i-2][i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10DiagNine() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 3; i < 8; i++) {
            game.gameField10X10[i-3][i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10DiagTen() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 4; i < 9; i++) {
            game.gameField10X10[i-4][i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerO10X10DiagEleven() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 5; i < 10; i++) {
            game.gameField10X10[i-5][i] = 'O';
        }
        //Then
        assertEquals(true, game.checkForWinnerO10X10());
    }
    @Test
    public void winnerX3X3RowOne() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        //When
        for (int i = 0; i < 3; i++){
            game.gameField3X3[0][i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX3X3());
    }
    @Test
    public void winnerX3X3RowTwo() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        //When
        for (int i = 0; i < 3; i++){
            game.gameField3X3[1][i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX3X3());
    }
    @Test
    public void winnerX3X3RowThree() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        //When
        for (int i = 0; i < 3; i++) {
            game.gameField3X3[2][i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX3X3());
    }
    @Test
    public void winnerX10X10RowOne() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[0][2+i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10RowTwo() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[1][2+i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10RowThree() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[2][2+i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10RowFour() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[3][2+i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10RowFive() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[4][2+i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10RowSix() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[5][2+i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10RowSeven() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[6][2+i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10RowEight() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[7][2+i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10RowNine() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[8][2+i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10RowTen() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[9][2+i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX3X3ColOne() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        //When
        for (int i = 0; i < 3; i++) {
            game.gameField3X3[i][0] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX3X3());
    }
    @Test
    public void winnerX3X3ColTwo() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        //When
        for (int i = 0; i < 3; i++) {
            game.gameField3X3[i][1] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX3X3());
    }
    @Test
    public void winnerX3X3ColThree() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        //When
        for (int i = 0; i < 3; i++) {
            game.gameField3X3[i][2] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX3X3());
    }
    @Test
    public void winnerX10X10ColOne() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][0] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10ColTwo() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][1] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10ColThree() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][2] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10ColFour() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][3] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10ColFive() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][4] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10ColSix() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][5] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10ColSeven() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][6] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10ColEight() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][7] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10ColNine() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][8] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10ColTen() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][9] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX3X3DiagOne() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 3; i++) {
            game.gameField3X3[i][i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX3X3());
    }
    @Test
    public void winnerX3X3DiagTwo() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 3; i++) {
            game.gameField3X3[i][2-i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX3X3());
    }
    @Test
    public void winnerX10X10DiagOne() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 0; i < 5; i++) {
            game.gameField10X10[i][i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10DiagTwo() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 1; i < 6; i++) {
            game.gameField10X10[i][i-1] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10DiagThree() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 2; i < 7; i++) {
            game.gameField10X10[i][i-2] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10DiagFour() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 3; i < 8; i++) {
            game.gameField10X10[i][i-3] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10DiagFive() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 4; i < 9; i++) {
            game.gameField10X10[i][i-4] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10DiagSix() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 5; i < 10; i++) {
            game.gameField10X10[i][i-5] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10DiagSeven() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 1; i < 6; i++) {
            game.gameField10X10[i-1][i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10DiagEight() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 2; i < 7; i++) {
            game.gameField10X10[i-2][i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10DiagNine() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 3; i < 8; i++) {
            game.gameField10X10[i-3][i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10DiagTen() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 4; i < 9; i++) {
            game.gameField10X10[i-4][i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void winnerX10X10DiagEleven() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        //When
        for (int i = 5; i < 10; i++) {
            game.gameField10X10[i-5][i] = 'X';
        }
        //Then
        assertEquals(true, game.checkForWinnerX10X10());
    }
    @Test
    public void draw3X3() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        int movesCounter = 0;
        String result = "";
        //When
        game.gameField3X3[0][0] = 'O';
        movesCounter++;
        game.gameField3X3[1][0] = 'O';
        movesCounter++;
        game.gameField3X3[2][1] = 'O';
        movesCounter++;
        game.gameField3X3[0][2] = 'O';
        movesCounter++;
        game.gameField3X3[2][0] = 'X';
        movesCounter++;
        game.gameField3X3[0][1] = 'X';
        movesCounter++;
        game.gameField3X3[1][1] = 'X';
        movesCounter++;
        game.gameField3X3[1][2] = 'X';
        movesCounter++;
        game.gameField3X3[2][2] = 'X';
        movesCounter++;
        game.showTable3X3();
        //Then
        if (movesCounter == 9) {
            result = "Draw";
        }
        assertEquals(false, game.checkForWinnerX3X3());
        assertEquals(false, game.checkForWinnerO3X3());
        assertEquals("Draw", result);
    }
    @Test
    public void draw10X10() {
        //Given
        Game game = new Game();
        game.resetTable10X10();
        int movesCounter = 0;
        String result = "";
        //When
        for (int i = 0; i < 4; i++) {
            game.gameField10X10[i][0] = 'X';
            movesCounter++;
        }
        for (int i = 0; i < 4; i++) {
            game.gameField10X10[i][1] = 'O';
            movesCounter++;
        }
        for (int i = 0; i < 4; i++) {
            game.gameField10X10[i][2] = 'X';
            movesCounter++;
        }
        for (int i = 0; i < 4; i++) {
            game.gameField10X10[i][3] = 'O';
            movesCounter++;
        }
        for (int i = 0; i < 4; i++) {
            game.gameField10X10[i][4] = 'X';
            movesCounter++;
        }
        for (int i = 0; i < 4; i++) {
            game.gameField10X10[i][5] = 'O';
            movesCounter++;
        }
        for (int i = 0; i < 4; i++) {
            game.gameField10X10[i][6] = 'X';
            movesCounter++;
        }
        for (int i = 0; i < 4; i++) {
            game.gameField10X10[i][7] = 'O';
            movesCounter++;
        }
        for (int i = 0; i < 4; i++) {
            game.gameField10X10[i][8] = 'X';
            movesCounter++;
        }
        for (int i = 0; i < 4; i++) {
            game.gameField10X10[i][9] = 'O';
            movesCounter++;
        }
        for (int i = 4; i < 8; i++) {
            game.gameField10X10[i][0] = 'O';
            movesCounter++;
        }
        for (int i = 4; i < 8; i++) {
            game.gameField10X10[i][1] = 'X';
            movesCounter++;
        }
        for (int i = 4; i < 8; i++) {
            game.gameField10X10[i][2] = 'O';
            movesCounter++;
        }
        for (int i = 4; i < 8; i++) {
            game.gameField10X10[i][3] = 'X';
            movesCounter++;
        }
        for (int i = 4; i < 8; i++) {
            game.gameField10X10[i][4] = 'O';
            movesCounter++;
        }
        for (int i = 4; i < 8; i++) {
            game.gameField10X10[i][5] = 'X';
            movesCounter++;
        }
        for (int i = 4; i < 8; i++) {
            game.gameField10X10[i][6] = 'O';
            movesCounter++;
        }
        for (int i = 4; i < 8; i++) {
            game.gameField10X10[i][7] = 'X';
            movesCounter++;
        }
        for (int i = 4; i < 8; i++) {
            game.gameField10X10[i][8] = 'O';
            movesCounter++;
        }
        for (int i = 4; i < 8; i++) {
            game.gameField10X10[i][9] = 'X';
            movesCounter++;
        }
        for (int i = 8; i < 10; i++) {
            game.gameField10X10[i][0] = 'X';
            movesCounter++;
        }
        for (int i = 8; i < 10; i++) {
            game.gameField10X10[i][1] = 'O';
            movesCounter++;
        }
        for (int i = 8; i < 10; i++) {
            game.gameField10X10[i][2] = 'X';
            movesCounter++;
        }
        for (int i = 8; i < 10; i++) {
            game.gameField10X10[i][3] = 'O';
            movesCounter++;
        }
        for (int i = 8; i < 10; i++) {
            game.gameField10X10[i][4] = 'X';
            movesCounter++;
        }
        for (int i = 8; i < 10; i++) {
            game.gameField10X10[i][5] = 'O';
            movesCounter++;
        }
        for (int i = 8; i < 10; i++) {
            game.gameField10X10[i][6] = 'X';
            movesCounter++;
        }
        for (int i = 8; i < 10; i++) {
            game.gameField10X10[i][7] = 'O';
            movesCounter++;
        }
        for (int i = 8; i < 10; i++) {
            game.gameField10X10[i][8] = 'X';
            movesCounter++;
        }
        for (int i = 8; i < 10; i++) {
            game.gameField10X10[i][9] = 'O';
            movesCounter++;
        }
        //Then
        if (movesCounter == 100) {
            result = "Draw";
        }
        assertEquals(false, game.checkForWinnerX10X10());
        assertEquals(false, game.checkForWinnerO10X10());
        assertEquals("Draw", result);
    }
    @Test
    public void incorrectCoordinatesForX3X3() {
        //Given
        Game game = new Game();
        game.resetTable3X3();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                game.gameField3X3[i][j] = 'X';
            }
        }
        //When
        //Then
        assertEquals(true, game.playerOneMove3X3());
    }
}
