package com.gmail.arhamjsiddiqui.tictactoe;

import com.gmail.arhamjsiddiqui.tictactoe.board.Board;
import com.gmail.arhamjsiddiqui.tictactoe.board.IBoard;
import com.gmail.arhamjsiddiqui.tictactoe.player.IPlayer;
import com.gmail.arhamjsiddiqui.tictactoe.player.Mark;
import com.gmail.arhamjsiddiqui.tictactoe.player.Player;

public class SessionInitializer {
    private final IBoard board;
    private final IPlayer playerOne;
    private final IPlayer playerTwo;

    public SessionInitializer() {
        board = new Board(3, 3);
        playerOne = new Player(Mark.X);
        playerTwo = new Player(Mark.O);
    }

    public Session makeSession() {
        Session session = new Session();
        session.setBoard(board);
        session.setPlayerOne(playerOne);
        session.setPlayerTwo(playerTwo);
        return session;
    }
}
