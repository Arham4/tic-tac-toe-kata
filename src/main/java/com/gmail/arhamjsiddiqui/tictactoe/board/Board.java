package com.gmail.arhamjsiddiqui.tictactoe.board;

import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Column;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Row;
import com.gmail.arhamjsiddiqui.tictactoe.player.IPlayer;
import com.gmail.arhamjsiddiqui.tictactoe.player.Mark;

public class Board implements IBoard {
    private final Mark[][] markedBoard;

    public Board(int length, int width) {
        markedBoard = new Mark[length][width];
    }

    @Override
    public Mark[][] getMarkedBoard() {
        return markedBoard;
    }

    @Override
    public IBoard mark(IPlayer player, Row row, Column column) {
        return this;
    }
}
