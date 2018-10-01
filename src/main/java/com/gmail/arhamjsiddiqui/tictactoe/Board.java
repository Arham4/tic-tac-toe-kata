package com.gmail.arhamjsiddiqui.tictactoe;

public class Board {
    private final int length;
    private final int width;

    public Board(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Board mark(Player player, Row row, Column column) {
        return this;
    }
}
