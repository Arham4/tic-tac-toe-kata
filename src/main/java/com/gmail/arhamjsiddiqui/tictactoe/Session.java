package com.gmail.arhamjsiddiqui.tictactoe;

import com.gmail.arhamjsiddiqui.tictactoe.board.Board;
import com.gmail.arhamjsiddiqui.tictactoe.board.IBoard;
import com.gmail.arhamjsiddiqui.tictactoe.player.IPlayer;
import com.gmail.arhamjsiddiqui.tictactoe.player.Player;

public class Session {
    private final IBoard board;
    private final IPlayer playerOne;
    private final IPlayer playerTwo;
    private IPlayer winner;

    public Session() {
        board = new Board(3, 3);
        playerOne = new Player();
        playerTwo = new Player();
    }


    public IBoard getBoard() {
        return board;
    }

    public IPlayer getPlayerOne() {
        return playerOne;
    }

    public IPlayer getPlayerTwo() {
        return playerTwo;
    }

    public void determineWinner() {
        winner = playerOne;
    }

    public IPlayer getWinner() {
        return winner;
    }
}
