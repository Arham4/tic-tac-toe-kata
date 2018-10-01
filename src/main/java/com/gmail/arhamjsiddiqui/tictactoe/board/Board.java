package com.gmail.arhamjsiddiqui.tictactoe.board;

import com.gmail.arhamjsiddiqui.tictactoe.board.validator.BoardMoveValidator;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Column;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Row;
import com.gmail.arhamjsiddiqui.tictactoe.player.IPlayer;
import com.gmail.arhamjsiddiqui.tictactoe.player.Mark;
import com.google.common.base.Preconditions;

public class Board implements IBoard {
    private final Mark[][] markedBoard;
    private final BoardMoveValidator boardMoveValidator;

    public Board(int length, int width) {
        markedBoard = new Mark[length][width];
        boardMoveValidator = new BoardMoveValidator();
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
        Preconditions.checkArgument(isFirstMoveAndXMoved(player), "First player to move must be X.");
        Preconditions.checkArgument(isEmptyCoordinate(row, column), "Marked on a coordinate more than once.");
        Preconditions.checkArgument(notSamePlayerMovedTwice(player), "Same player moved twice.");

        Mark mark = player.getMark();
        markedBoard[row.getIndex()][column.getIndex()] = mark;

        invokeValidator(player);
        return this;
    }

    /**
     * Allows for verification flow.
     */
    private void invokeValidator(IPlayer player) {
        boardMoveValidator.setLastPlayerToMove(player);
        boardMoveValidator.moved();
    }

    private boolean isFirstMoveAndXMoved(IPlayer player) {
        return boardMoveValidator.isFirstMoveAndXMoved(player);
    }

    private boolean isEmptyCoordinate(Row row, Column column) {
        return boardMoveValidator.isEmptyCoordinate(markedBoard, row, column);
    }

    private boolean notSamePlayerMovedTwice(IPlayer playerInQuestion) {
        return boardMoveValidator.notSamePlayerMovedTwice(playerInQuestion);
    }
}
