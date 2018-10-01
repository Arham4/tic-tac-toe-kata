package com.gmail.arhamjsiddiqui.tictactoe;

import com.gmail.arhamjsiddiqui.tictactoe.board.IBoard;
import com.gmail.arhamjsiddiqui.tictactoe.player.Mark;

public interface IWinnerValidator {
    Mark whoHasWon(IBoard board);
}
