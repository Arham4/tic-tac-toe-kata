package com.gmail.arhamjsiddiqui.tictactoe.board;

import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Column;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Row;
import com.gmail.arhamjsiddiqui.tictactoe.player.IPlayer;

public interface IMarkable {
    IMarkable mark(IPlayer player, Row row, Column column);
}
