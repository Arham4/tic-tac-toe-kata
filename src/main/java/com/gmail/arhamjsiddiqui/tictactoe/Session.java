package com.gmail.arhamjsiddiqui.tictactoe;

public class Session {
    private final Board board;
    private final Player playerOne;
    private final Player playerTwo;
    private Player winner;

    public Session() {
        board = new Board(3, 3);
        playerOne = new Player();
        playerTwo = new Player();
    }


    public Board getBoard() {
        return board;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void determineWinner() {
        winner = playerOne;
    }

    public Player getWinner() {
        return winner;
    }
}
