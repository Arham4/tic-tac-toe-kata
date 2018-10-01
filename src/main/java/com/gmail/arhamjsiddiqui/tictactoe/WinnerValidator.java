package com.gmail.arhamjsiddiqui.tictactoe;

import com.gmail.arhamjsiddiqui.tictactoe.board.IBoard;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Column;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Row;
import com.gmail.arhamjsiddiqui.tictactoe.player.Mark;

public class WinnerValidator implements IWinnerValidator {

    @Override
    public Mark whoHasWon(IBoard board) {
        Mark[] possibleWinners = {
                getHorizontalWinner(board),
                getVerticalWinner(board)
        };
        for (Mark possibleWinner : possibleWinners) {
            if (possibleWinner != null) {
                return possibleWinner;
            }
        }
        return null;
    }

    private Mark getVerticalWinner(IBoard board) {
        for (Column column : Column.values()) {
            Mark mark = getVerticalWinnerForColumn(board, column);
            if (mark != null) {
                return mark;
            }
        }
        return null;
    }

    private Mark getVerticalWinnerForColumn(IBoard board, Column column) {
        for (Mark mark : Mark.values()) {
            if (isVerticalWinForRowForMark(board, mark, column)) {
                return mark;
            }
        }
        return null;
    }

    private boolean isVerticalWinForRowForMark(IBoard board, Mark mark, Column column) {
        boolean won = true;
        for (Row row : Row.values()) {
            if (!isMark(board, mark, row, column)) {
                won = false;
            }
        }
        return won;
    }

    private Mark getHorizontalWinner(IBoard board) {
        for (Row row : Row.values()) {
            Mark mark = getHorizontalWinnerForRow(board, row);
            if (mark != null) {
                return mark;
            }
        }
        return null;
    }

    private Mark getHorizontalWinnerForRow(IBoard board, Row row) {
        for (Mark mark : Mark.values()) {
            if (isHorizontalWinForRowForMark(board, mark, row)) {
                return mark;
            }
        }
        return null;
    }

    private boolean isHorizontalWinForRowForMark(IBoard board, Mark mark, Row row) {
        boolean won = true;
        for (Column column : Column.values()) {
            if (!isMark(board, mark, row, column)) {
                won = false;
            }
        }
        return won;
    }

    private boolean isMark(IBoard board, Mark mark, Row row, Column column) {
        return board.getMark(row, column) == mark;
    }
}
