package com.gmail.arhamjsiddiqui.tictactoe.coordinates;

public enum Column {
    LEFT(0),
    MIDDLE(1),
    RIGHT(2);

    /**
     * Represents the index value of the row in a 2D array such as:
     * let x = this.index
     * grid[0][x]
     */
    private final int index;

    Column(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static Column getColumnForIndex(int index) {
        for (Column column : values()) {
            if (column.getIndex() == index) {
                return column;
            }
        }
        return null;
    }
}
