package com.gmail.arhamjsiddiqui.tictactoe;

import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Column;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Row;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeTest {
    private Session session;

    @Before
    public void initializeSession() {
        SessionInitializerTest sessionInitializerTest = new SessionInitializerTest();
        sessionInitializerTest.makeSession();
        sessionInitializerTest.makeSessionVerifyFields();
        
        session = new SessionInitializer().makeSession();
    }

    @Test
    public void testExampleGame() {
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
