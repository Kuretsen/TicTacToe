package com.kodilla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    char field;
    Scanner scanner = new Scanner(System.in);
    List<Character> table = new ArrayList<>();
    public void createField() {
        table.add('a');
        table.add('b');
        table.add('c');
        table.add('d');
        table.add('e');
        table.add('f');
        table.add('g');
        table.add('h');
        table.add('i');
    }

    public void playerOneMove() {
        System.out.println("Chose field");
        field = scanner.next().charAt(0);
        int indexOfChosenField = table.indexOf(field);

        if(table.get(indexOfChosenField) != 'X' && table.get(indexOfChosenField) != 'O') {
            table.set(indexOfChosenField, 'X');
        } else {
            System.out.println("This field is occupied!");
        }
    }
    public void playerTwoMove() {
        System.out.println("Chose field");
        field = scanner.next().charAt(0);
        int indexOfChosenField = table.indexOf(field);

        if(table.get(indexOfChosenField) != 'X' && table.get(indexOfChosenField) != 'O') {
            table.set(indexOfChosenField, 'O');
        } else {
            System.out.println("This field is occupied!");
        }
    }
    public void showTable() {
        System.out.println("| " + table.get(6) + " | " + table.get(7) + " | " + table.get(8) + " |");
        System.out.println("| " + table.get(3) + " | " + table.get(4) + " | " + table.get(5) + " |");
        System.out.println("| " + table.get(0) + " | " + table.get(1) + " | " + table.get(2) + " |");
    }
    public boolean checkForWinner() {
        if (table.get(6) == 'X' && table.get(4) == 'X' && table.get(2) == 'X' ||
            table.get(0) == 'X' && table.get(4) == 'X' && table.get(8) == 'X' ||
            table.get(6) == 'X' && table.get(7) == 'X' && table.get(8) == 'X' ||
            table.get(3) == 'X' && table.get(4) == 'X' && table.get(5) == 'X' ||
            table.get(0) == 'X' && table.get(1) == 'X' && table.get(2) == 'X' ||
            table.get(6) == 'X' && table.get(3) == 'X' && table.get(0) == 'X' ||
            table.get(7) == 'X' && table.get(4) == 'X' && table.get(1) == 'X' ||
            table.get(8) == 'X' && table.get(5) == 'X' && table.get(2) == 'X') {
            System.out.println("Player one win");
            return true;
        } else if (table.get(6) == 'O' && table.get(4) == 'O' && table.get(2) == 'O' ||
                   table.get(0) == 'O' && table.get(4) == 'O' && table.get(8) == 'O' ||
                   table.get(6) == 'O' && table.get(7) == 'O' && table.get(8) == 'O' ||
                   table.get(3) == 'O' && table.get(4) == 'O' && table.get(5) == 'O' ||
                   table.get(0) == 'O' && table.get(1) == 'O' && table.get(2) == 'O' ||
                   table.get(6) == 'O' && table.get(3) == 'O' && table.get(0) == 'O' ||
                   table.get(7) == 'O' && table.get(4) == 'O' && table.get(1) == 'O' ||
                   table.get(8) == 'O' && table.get(5) == 'O' && table.get(2) == 'O') {
            System.out.println("Player two win");
            return true;
        }
        return false;
    }
    public void resetTable() {
        table.clear();
    }
}
