package com.gmail.arhamjsiddiqui.tictactoe;

import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Column;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Row;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WinnerTest {
    private Session session;

    @Before
    public void initializeSession() {
        SessionInitializerTest sessionInitializerTest = new SessionInitializerTest();
        sessionInitializerTest.makeSession();
        sessionInitializerTest.makeSessionVerifyFields();

        session = new SessionInitializer().makeSession();
    }

    @Test
    public void horizontalWin() {
        session.getBoard().mark(session.getPlayerOne(), Row.TOP_ROW, Column.LEFT)
                .mark(session.getPlayerTwo(), Row.MIDDLE_ROW, Column.LEFT)
                .mark(session.getPlayerOne(), Row.TOP_ROW, Column.MIDDLE)
                .mark(session.getPlayerTwo(), Row.MIDDLE_ROW, Column.MIDDLE)
                .mark(session.getPlayerOne(), Row.TOP_ROW, Column.RIGHT);
        session.determineWinner();
        assertEquals(session.getWinner(), session.getPlayerOne());
    }

    @Test
    public void verticalWin() {
        session.getBoard().mark(session.getPlayerOne(), Row.TOP_ROW, Column.LEFT)
                .mark(session.getPlayerTwo(), Row.MIDDLE_ROW, Column.MIDDLE)
                .mark(session.getPlayerOne(), Row.MIDDLE_ROW, Column.LEFT)
                .mark(session.getPlayerTwo(), Row.TOP_ROW, Column.MIDDLE)
                .mark(session.getPlayerOne(), Row.BOTTOM_ROW, Column.LEFT);
        session.determineWinner();
        assertEquals(session.getWinner(), session.getPlayerOne());
    }

    @Test
    public void diagonalWin() {
        session.getBoard().mark(session.getPlayerOne(), Row.TOP_ROW, Column.LEFT)
                .mark(session.getPlayerTwo(), Row.TOP_ROW, Column.MIDDLE)
                .mark(session.getPlayerOne(), Row.MIDDLE_ROW, Column.MIDDLE)
                .mark(session.getPlayerTwo(), Row.MIDDLE_ROW, Column.LEFT)
                .mark(session.getPlayerOne(), Row.BOTTOM_ROW, Column.RIGHT);
        session.determineWinner();
        assertEquals(session.getWinner(), session.getPlayerOne());
    }
}
