package com.gmail.arhamjsiddiqui.tictactoe.board;

import com.gmail.arhamjsiddiqui.tictactoe.player.Mark;

public interface IBoard extends IMarkable {
    Mark[][] getMarkedBoard();
}
