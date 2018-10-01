package com.gmail.arhamjsiddiqui.tictactoe.board;

import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Column;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Row;
import com.gmail.arhamjsiddiqui.tictactoe.player.IPlayer;
import com.gmail.arhamjsiddiqui.tictactoe.player.Mark;
import com.google.common.base.Preconditions;

public class Board implements IBoard {
    private final Mark[][] markedBoard;

    public Board(int length, int width) {
        markedBoard = new Mark[length][width];
    }

    @Override
    public Mark getMark(Row row, Column column) {
        Preconditions.checkNotNull(row);
        Preconditions.checkNotNull(column);

        return markedBoard[row.getIndex()][column.getIndex()];
    }

    @Override
    public IBoard mark(IPlayer player, Row row, Column column) {
        Preconditions.checkNotNull(player);
        Preconditions.checkNotNull(row);
        Preconditions.checkNotNull(column);

        Mark mark = player.getMark();
        markedBoard[row.getIndex()][column.getIndex()] = mark;
        return this;
    }
}
