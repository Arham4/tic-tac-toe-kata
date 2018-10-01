package com.gmail.arhamjsiddiqui.tictactoe;

import com.gmail.arhamjsiddiqui.tictactoe.board.IBoard;
import com.gmail.arhamjsiddiqui.tictactoe.player.IPlayer;
import com.gmail.arhamjsiddiqui.tictactoe.player.Mark;

public class Session {
    private IBoard board;
    private IPlayer playerOne;
    private IPlayer playerTwo;
    private IPlayer winner;

    private WinnerValidator winnerValidator = new WinnerValidator();

    Session() { }

    public IBoard getBoard() {
        return board;
    }

    public void setBoard(IBoard board) {
        this.board = board;
    }

    public IPlayer getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(IPlayer playerOne) {
        this.playerOne = playerOne;
    }

    public IPlayer getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(IPlayer playerTwo) {
        this.playerTwo = playerTwo;
    }

    public void determineWinner() {
        Mark mark = winnerValidator.whoHasWon(board);
        winner = mark == playerOne.getMark() ? playerOne : mark == playerTwo.getMark() ? playerTwo : null;
    }

    public IPlayer getWinner() {
        return winner;
    }
}
