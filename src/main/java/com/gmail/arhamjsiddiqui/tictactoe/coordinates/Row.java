package com.gmail.arhamjsiddiqui.tictactoe.coordinates;

public enum Row {
    TOP_ROW(0),
    MIDDLE_ROW(1),
    BOTTOM_ROW(2);

    /**
     * Represents the index value of the row in a 2D array such as:
     * let x = this.index
     * grid[x][0]
     */
    private final int index;

    Row(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static Row getRowForIndex(int index) {
        for (Row row : values()) {
            if (row.getIndex() == index) {
                return row;
            }
        }
        return null;
    }
}
