package com.gmail.arhamjsiddiqui.tictactoe.player;

public class Player implements IPlayer {
    private final Mark mark;

    public Player(Mark mark) {
        this.mark = mark;
    }

    @Override
    public Mark getMark() {
        return mark;
    }
}
