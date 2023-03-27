package com.kodilla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTestSuite {
    @Test
    public void winnerX10x10() {
        Game game = new Game();
        game.resetTable3X3();
        game.gameField3X3[1][1] = 'X';
        game.playerComputerMove3X3();
        game.showTable3X3();
        System.out.println();
        game.playerComputerMove3X3();
        game.showTable3X3();
        System.out.println();
        game.playerComputerMove3X3();
        game.showTable3X3();
        System.out.println();
        game.playerComputerMove3X3();
        game.showTable3X3();
        System.out.println();
        game.playerComputerMove3X3();
        game.showTable3X3();
        System.out.println();
        game.playerComputerMove3X3();
        game.showTable3X3();
        System.out.println();
        game.playerComputerMove3X3();
        game.showTable3X3();
        System.out.println();
        game.playerComputerMove3X3();
        game.showTable3X3();
        System.out.println();
    }
}
