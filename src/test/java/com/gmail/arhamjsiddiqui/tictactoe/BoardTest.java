package com.gmail.arhamjsiddiqui.tictactoe;

import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Column;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Row;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoardTest {

    private Session session;

    @Before
    public void initializeSession() {
        SessionInitializerTest sessionInitializerTest = new SessionInitializerTest();
        sessionInitializerTest.makeSession();
        sessionInitializerTest.makeSessionVerifyFields();

        session = new SessionInitializer().makeSession();
    }

    @Test
    public void placeMarkOnBoardShouldReturnMarkWhenFetched() {
        session.getBoard().mark(session.getPlayerOne(), Row.TOP_ROW, Column.LEFT);

        Assert.assertEquals(session.getBoard().getMark(Row.TOP_ROW, Column.LEFT), session.getPlayerOne().getMark());
    }

    @Test(expected = IllegalArgumentException.class)
    public void oMovesFirstInsteadOfXShouldThrowIllegalArgumentException() {
        session.getBoard().mark(session.getPlayerTwo(), Row.BOTTOM_ROW, Column.RIGHT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void placeOnSameCoordShouldThrowIllegalArgumentException() {
        session.getBoard().mark(session.getPlayerOne(), Row.TOP_ROW, Column.RIGHT)
                .mark(session.getPlayerTwo(), Row.TOP_ROW, Column.RIGHT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void playerMovingTwiceShouldThrowIllegalArgumentException() {
        session.getBoard().mark(session.getPlayerOne(), Row.TOP_ROW, Column.RIGHT)
                .mark(session.getPlayerOne(), Row.BOTTOM_ROW, Column.RIGHT);
    }

    @Test(expected = NullPointerException.class)
    public void placeMarkOnNullRowShouldThrowNullPointerException() {
        session.getBoard().mark(session.getPlayerOne(), null, Column.RIGHT);
    }

    @Test(expected = NullPointerException.class)
    public void placeMarkOnNullColumnShouldThrowNullPointerException() {
        session.getBoard().mark(session.getPlayerOne(), Row.TOP_ROW, null);
    }

    @Test(expected = NullPointerException.class)
    public void placeMarkUsingNullPlayerShouldThrowNullPointerException() {
        session.getBoard().mark(null, Row.TOP_ROW, Column.LEFT);
    }
}
