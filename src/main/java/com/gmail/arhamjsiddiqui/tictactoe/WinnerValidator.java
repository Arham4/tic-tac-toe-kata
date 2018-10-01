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
                getVerticalWinner(board),
                getDiagonalWinner(board)
        };
        for (Mark possibleWinner : possibleWinners) {
            if (possibleWinner != null) {
                return possibleWinner;
            }
        }
        return null;
    }

    private Mark getDiagonalWinner(IBoard board) {
        Mark[] possibleWinners = {
                getLeftToRightWinner(board),
                getRightToLeftWinner(board)
        };
        for (Mark possibleWinner : possibleWinners) {
            if (possibleWinner != null) {
                return possibleWinner;
            }
        }
        return null;
    }

    private Mark getLeftToRightWinner(IBoard board) {
        for (Mark mark : Mark.values()) {
            if (isLeftToRightWinnerForMark(board, mark)) {
                return mark;
            }
        }
        return null;
    }

    private boolean isLeftToRightWinnerForMark(IBoard board, Mark mark) {
        for (int y = 0, x = 0; y < 3 && x < 3; y++, x++) {
            if (!isMark(board, mark, Row.getRowForIndex(y), Column.getColumnForIndex(x))) {
               return false;
            }
        }
        return true;
    }


    private Mark getRightToLeftWinner(IBoard board) {
        for (Mark mark : Mark.values()) {
            if (isRightToLeftWinnerForMark(board, mark)) {
                return mark;
            }
        }
        return null;
    }

    private boolean isRightToLeftWinnerForMark(IBoard board, Mark mark) {
        for (int y = 0, x = 2; y < 3 && x >= 0; y++, x--) {
            if (!isMark(board, mark, Row.getRowForIndex(y), Column.getColumnForIndex(x))) {
                return false;
            }
        }
        return true;
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
        for (Row row : Row.values()) {
            if (!isMark(board, mark, row, column)) {
                return false;
            }
        }
        return true;
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
        for (Column column : Column.values()) {
            if (!isMark(board, mark, row, column)) {
                return false;
            }
        }
        return true;
    }

    private boolean isMark(IBoard board, Mark mark, Row row, Column column) {
        return board.getMark(row, column) == mark;
    }
}
