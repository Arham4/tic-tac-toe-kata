package com.gmail.arhamjsiddiqui.tictactoe.board;

import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Column;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Row;
import com.gmail.arhamjsiddiqui.tictactoe.player.Mark;

public interface IBoard extends IMarkable {
    Mark getMark(Row row, Column column);
}
