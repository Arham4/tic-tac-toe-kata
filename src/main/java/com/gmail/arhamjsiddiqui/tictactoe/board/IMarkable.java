package com.gmail.arhamjsiddiqui.tictactoe.board;

import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Column;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Row;
import com.gmail.arhamjsiddiqui.tictactoe.player.IPlayer;
import lombok.NonNull;

public interface IMarkable {
    IMarkable mark(@NonNull IPlayer player, @NonNull Row row, @NonNull Column column);
}
