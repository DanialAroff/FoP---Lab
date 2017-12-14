/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test20;

import java.util.Scanner;

public class moveUpdated {
 
    Scanner in = new Scanner(System.in);

    moveUpdated() {

    }

    public void Keys(int row, int column, char[][] tiles, char p /*not sure*/) {
        //panggil class or method show tiles
        //printAlphabet(row,column,tiles); //method tukar number jadi alphabet
        //while (fullgrid = false) {
        System.out.println("Enter keys for direction or to quit: ");
        System.out.println("w: up | a: left | s: down | d: right | 1: quit");
        String keys = in.nextLine();
        System.out.println("");

        switch (keys) {
            case "d":
            //right method tak buat lagi
            //condition

            case "a":
            //left method tak buat lagi
            //condition
            case "w":
                Up(row, column, tiles, p);
            //after dah naik 
            //condition
            case "s":
                Down(row, column, tiles, p);
            //after dah turun?
            //condition
            case "1":
                System.out.println("Thanks for trying this game");
                System.exit(0);
            default:
                System.out.println("PLEASE ENTER A VALID NUMBER");
                Keys(row, column, tiles, p);
        }
    }

    //checking if it can go upper column, if theres nothing on upper row, then ok.
    public char ifUp(int j, int row, int column, char[][] tiles) {
        char counter = 0;
        for (int i = 0; i < row - 1; i++) {
            if (tiles[i][j] == 0) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    //checking if it can go downwards, if theres nothing on lower row, then ok.
    public int ifDown(int j, int row, int column, char[][] tiles) {
        int counter = 0;
        for (int i = 0; i < row - 1; i++) {
            if (tiles[i][j] == 0) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    //checking if it can go right, if theres nothing on upper column, then ok.
    public int ifRight(int i, int row, int column, char[][] tiles) {
        int counter = 0;
        for (int j = 0; j < column - 1; j++) {
            if (tiles[i][j] == 0) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    //checking if it can go left, if theres nothing then ok.
    public int ifLeft(int i, int row, int column, char[][] tiles) {
        int counter = 0;
        for (int j = 0; i < column - 1; j++) {
            if (tiles[i][j] == 0) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    //sliding
    private void slideUp(int i, int j, int row, int column, char[][] tiles) {
        char temp;
        for (; i < row - 1; i++) {
            temp = tiles[i][j];
            tiles[i][j] = tiles[i + 1][j];
            tiles[i + 1][j] = temp;
        }
    }

    private void slideDown(int i, int j, int row, int column, char[][] tiles) {
        char temp;
        for (; i < row - 1; i++) {
            temp = tiles[row - 1 - i][j];
            tiles[row - i - 1][j] = tiles[row - 2 - i][j];
            tiles[row - 2 - i][j] = temp;
        }
    }

    private void slideRight(int i, int j, int row, int column, char[][] tiles) {
        char temp;
        for (; j < column - 1; j++) {
            temp = tiles[i][column - j - 1];
            tiles[i][column - j - 1] = tiles[i][column - j - 2];
            tiles[i][column - j - 2] = temp;
        }
    }

    private void slideLeft(int i, int j, int row, int column, char[][] tiles) {
        char temp;
        for (; j < column - 1; j++) {
            temp = tiles[i][j];
            tiles[i][j] = tiles[i][j + 1];
            tiles[i][j + 1] = temp;
        }
    }

    //removes kekosongan, kalau boleh merge then merge la
    private void Up(int row, int column, char[][] tiles, char p) {
        //in method "ifUp" if there is 0 (or empty tiles) counter increase by 1, 
        //now if we remove the counter decreases.
        int counter = 0;

        for (int j = 0; j < column; j++) {
            counter = ifUp(j, row, column, tiles);
            while (counter > 0) {
                for (int i = 0; i < counter; i++) {
                    slideUp(i, j, row, column, tiles);
                    counter--;
                }
            }
        }

        char temp = 0;
        counter = row - 2;
        while (counter > 0) {
            for (int j = 0; j < column; j++) {
                for (int i = 0; i < row - 1; i++) {
                    if (tiles[i][j] == 0) {
                        temp = tiles[i][j];
                        tiles[i][j] = tiles[i + 1][j];
                        tiles[i + 1][j] = temp;
                    }
                }
            }
            counter--;
        }

        //merging
        counter = row - 2;
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row - 1; i++) {
                if (tiles[i][j] == tiles[i + 1][j]) {
                    nextLetter(p);
                    tiles[i + 1][j] = 0;

                    while (counter > 0) {
                        if (tiles[i][j] == 0) {
                            temp = tiles[i][j];
                            tiles[i][j] = tiles[i + 1][j];
                            tiles[1 + i][j] = temp;
                        }
                        counter--;
                    }
                }
            }
        }

        counter = row - 2;
        while (counter > 0) {
            for (int j = 0; j < column - 1; j++) {
                for (int i = 1; i < row - 1; i++) {
                    if (tiles[i][j] == '\u00B7') {
                        temp = tiles[i][j];
                        tiles[i][j] = tiles[i + 1][j];
                        tiles[i + 1][j] = temp;
                    }
                }
            }
            counter--;
        }
    }

    public void Down(int row, int column, char[][] tiles, char p) {
        int count;

        for (int j = 0; j < column; j++) {
            count = ifDown(j, row, column, tiles);
            while (count > 0) {
                for (int i = 0; i < count; i++) {
                    slideDown(i, j, row, column, tiles);
                    count--;
                }
            }
        }

        char temp;
        count = row - 2;
        while (count > 0) {
            for (int j = 0; j < column; j++) {
                for (int i = 1; i < row - 1; i++) {
                    if (tiles[row - 1 - i][j] == '\u00B7') {
                        temp = tiles[row - 1 - i][j];
                        tiles[row - 1 - i][j] = tiles[row - 2 - i][j];
                        tiles[row - 2 - i][j] = temp;
                    }
                }
            }
            count--;
        }
        //merge if equal
        count = row - 2;
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row - 1; i++) {
                if (tiles[row - 1 - i][j] == tiles[row - 2 - i][j]) {
                    tiles[row - 1 - i][j] = (tiles[row - 2 - i][j]);
                    nextLetter(p);
                    /*tak sure, same goes to method lain yang kena letak method nextLetter()*/
                    tiles[row - 2 - i][j] = '\u00B7';

                    while (count > 0) {
                        if (tiles[row - 1 - i][j] == 0) {
                            temp = tiles[row - 1 - i][j];
                            tiles[row - 1 - i][j] = tiles[row - 2 - i][j];
                            tiles[row - 2 - i][j] = temp;
                        }
                        count--;
                    }
                }
            }
        }
        count = row - 2;
        while (count > 0) {
            for (int j = 0; j < column; j++) {
                for (int i = 1; i < row - 1; i++) {
                    if (tiles[row - 1 - i][j] == '\u00B7') {
                        temp = tiles[row - 1 - i][j];
                        tiles[row - 1 - i][j] = tiles[row - 2 - i][j];
                        tiles[row - 2 - i][j] = temp;
                    }
                }
            }
            count--;
        }
    }

    public void Right(int row, int column, char[][] tiles, char p) {
        int count;

        for (int i = 0; i < row; i++) {
            count = ifRight(i, row, column, tiles);
            while (count > 0) {
                for (int j = 0; j < count; j++) {
                    slideRight(i, j, row, column, tiles);
                    count--;
                }
            }
        }
        char temp;
        count = column - 2;
        while (count > 0) {
            for (int i = 0; i < row; i++) {
                for (int j = 1; j < column - 1; j++) {
                    if (tiles[i][column - 1 - j] == '\u00B7') {
                        temp = tiles[i][column - 1 - j];
                        tiles[i][column - 1 - j] = tiles[i][column - 2 - j];
                        tiles[i][column - 2 - j] = temp;
                    }
                }
            }
            count--;
        }
        count = column - 2;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column - 1; j++) {
                if (tiles[i][column - 1 - j] == tiles[i][column - 2 - j]) {
                    tiles[i][column - 1 - j] = (tiles[i][column - 2 - j]);
                    nextLetter(p);
                    tiles[i][column - 2 - j] = '\u00B7';

                    while (count > 0) {
                        if (tiles[i][column - 1 - j] == '\u00B7') {
                            temp = tiles[i][column - 1 - j];
                            tiles[i][column - 1 - j] = tiles[i][column - 2 - j];
                            tiles[i][column - 2 - j] = temp;
                        }
                        count--;
                    }
                }
            }
        }
        count = column - 2;
        while (count > 0) {
            for (int i = 0; i < row; i++) {
                for (int j = 1; j < column - 1; j++) {
                    if (tiles[i][column - 1 - j] == '\u00B7'){
                        temp = tiles[i][column - 1 - j];
                        tiles[i][column - 1 - j] = tiles[i][column - 2 - j];
                        tiles[i][column - 2 - j] = temp;
                    }
                }
            }
            count--;
        }
    }

    private void Left(int row, int column, char[][] tiles, char p) {

        int counter;

        for (int i = 0; i < row; i++) {
            counter = ifLeft(i, row, column, tiles);
            while (counter > 0) {
                for (int j = 0; j < counter; j++) {
                    slideLeft(i, j, row, column, tiles);
                    counter--;
                }
            }
        }

        char temp;
        counter = column - 2;
        while (counter > 0) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column - 1; j++) {
                    if (tiles[i][j] == '\u00B7') {
                        temp = tiles[i][j];
                        tiles[i][j] = tiles[i][j + 1];
                        tiles[i][j + 1] = temp;
                    }
                }
            }
            counter--;
        }

        //merging
        counter = column - 2;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column - 1; j++) {
                if (tiles[i][j] == tiles[i][j + 1]) {
                    tiles[i][j] = tiles[i][j + 1];
                    nextLetter(p);

                    tiles[i][j + 1] = '\u00B7';

                    while (counter > 0) {
                        if (tiles[i][j] == '\u00B7') {
                            temp = tiles[i][j];
                            tiles[i][j] = tiles[i][j + 1];
                            tiles[i][j + 1] = temp;
                        }
                        counter--;
                    }
                }
            }
        }

        temp = 0;
        counter = column - 2;
        while (counter > 0) {
            for (int i = 0; i < row; i++) {
                for (int j = 1; j < column - 1; j++) {
                    if (tiles[i][j] == '\u00B7') {
                        temp = tiles[i][j];
                        tiles[i][j] = tiles[i][j + 1];
                        tiles[i][j + 1] = temp;
                    }
                }
            }
            counter--;
        }
    }

    public char nextLetter(char p) {
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};
        char next = 0;
        for (int i = 0; i < letters.length; i++) {
            if (p == letters[i]) {
                next = letters[i + 1];
            }
            break;
        }
        return next;
    }


}
