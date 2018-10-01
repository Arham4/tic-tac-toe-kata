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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Player) {
            Player oPlayer = (Player) obj;
            return oPlayer.mark == mark;
        }
        return super.equals(obj);
    }
}
