package com.company;

public class Area {
    /*
        :arg: chessArea:
     */
    private final String[][] chessArea = new String[9][9];
    private final String[] lets = new String[] {"A", " B", " C", " D", " E", " F", " G", " H"};
    private final String[] ints = new String[] {"8", "7", "6", "5", "4", "3", "2", "1"};

    Area () {
        this.chessArea[this.chessArea.length-1][0] = "[]";
        for (int i = 0; i < this.lets.length; i++) {
            this.chessArea[this.chessArea.length-1][i+1] = lets[i];
        }

        for (int i = 0; i < this.ints.length; i++) {
            this.chessArea[i][0] = this.ints[i];
        }

        for (int i = 0; i < this.chessArea.length-1; i++) {
            for (int j = 1; j < this.chessArea.length; j++) {
                this.chessArea[i][j] = "[]";
            }
        }
    }

    void displayArea() {
        for (int i = 0; i < this.chessArea.length; i++) {
            System.out.println();
            for (int j = 0; j < this.chessArea.length; j++) {
                System.out.print(this.chessArea[i][j] + " ");
            }
        }
    }

}
