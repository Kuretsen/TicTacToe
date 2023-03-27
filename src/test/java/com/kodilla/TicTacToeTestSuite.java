package com.kodilla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTestSuite {
    @Test
    public void winnerX10x10() {
        Game game = new Game();
        game.resetTable10X10();
        game.gameField10X10[1][1] = 'X';
        int a = 0;
        while (a<98) {
            game.playerComputerMove10X10();
            a++;
        }
        game.showTable10X10();
    }
}
