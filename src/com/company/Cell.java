package com.company;

public class Cell {
    /*
        :arg: cell: Переменная хранящаая одну ячейку, в которой или фигура или пустота.
        :arg: haveFigure: Переменная хранящая true если есть фигура / false если нету фигуры.
        :arg: cords: Переменная хранящаа координаты ячейки.
     */
    String cords;
    String[] cell = new String[1];
    boolean haveFigure;

    Cell (String cords, Figure figure) {
        this.cords = cords;
        this.cell[0] = figure.getName();
        this.haveFigure = true;
    }

    Cell (String cords) {
        this.cords = cords;
        this.cell[0] = "[]";
        this.haveFigure = true;
    }

}
