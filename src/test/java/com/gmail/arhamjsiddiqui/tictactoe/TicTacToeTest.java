package com.gmail.arhamjsiddiqui.tictactoe;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

public class TicTacToeTest {
    @Test
    public void testExampleGame() {
        Session session = new Session();
        session.getBoard()
                .mark(session.getPlayerOne(), Row.TOP_ROW, Column.LEFT)
                .mark(session.getPlayerTwo(), Row.MIDDLE_ROW, Column.LEFT)
                .mark(session.getPlayerOne(), Row.MIDDLE_ROW, Column.MIDDLE)
                .mark(session.getPlayerTwo(), Row.BOTTOM_ROW, Column.MIDDLE)
                .mark(session.getPlayerOne(), Row.BOTTOM_ROW, Column.RIGHT);
        session.determineWinner();
        assertEquals(session.getWinner(), session.getPlayerOne());
    }
}
