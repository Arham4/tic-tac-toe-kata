package com.gmail.arhamjsiddiqui.tictactoe.board.validator;

import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Column;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Row;
import com.gmail.arhamjsiddiqui.tictactoe.player.IPlayer;
import com.gmail.arhamjsiddiqui.tictactoe.player.Mark;

public class BoardMoveValidator {
    private IPlayer lastPlayerToMove;

    public boolean notSamePlayerMovedTwice(IPlayer playerInQuestion) {
        return playerInQuestion != lastPlayerToMove;
    }

    public void setLastPlayerToMove(IPlayer lastPlayerToMove) {
        this.lastPlayerToMove = lastPlayerToMove;
    }

    public boolean isEmptyCoordinate(Mark[][] markedBoard, Row row, Column column) {
        return markedBoard[row.getIndex()][column.getIndex()] == null;
    }
}
