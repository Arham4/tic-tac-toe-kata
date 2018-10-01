package com.gmail.arhamjsiddiqui.tictactoe;

import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Column;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Row;
import org.junit.Assert;
import org.junit.Test;

public class BoardTest {
    @Test
    public void placeMarkOnBoardShouldReturnMarkWhenFetched() {
        Session session = new Session();
        session.getBoard().mark(session.getPlayerOne(), Row.TOP_ROW, Column.LEFT);

        Assert.assertEquals(session.getBoard().getMark(Row.TOP_ROW, Column.LEFT), session.getPlayerOne().getMark());
    }

    @Test(expected = IllegalArgumentException.class)
    public void placeOnSameCoordShouldThrowIllegalArgumentException() {
        Session session = new Session();
        session.getBoard().mark(session.getPlayerOne(), Row.TOP_ROW, Column.RIGHT)
                .mark(session.getPlayerTwo(), Row.TOP_ROW, Column.RIGHT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void playerMovingTwiceShouldThrowIllegalArgumentException() {
        Session session = new Session();
        session.getBoard().mark(session.getPlayerOne(), Row.TOP_ROW, Column.RIGHT)
                .mark(session.getPlayerOne(), Row.BOTTOM_ROW, Column.RIGHT);
    }

    @Test(expected = NullPointerException.class)
    public void placeMarkOnNullRowShouldThrowNullPointerException() {
        Session session = new Session();
        session.getBoard().mark(session.getPlayerOne(), null, Column.RIGHT);
    }

    @Test(expected = NullPointerException.class)
    public void placeMarkOnNullColumnShouldThrowNullPointerException() {
        Session session = new Session();
        session.getBoard().mark(session.getPlayerOne(), Row.TOP_ROW, null);
    }

    @Test(expected = NullPointerException.class)
    public void placeMarkUsingNullPlayerShouldThrowNullPointerException() {
        Session session = new Session();
        session.getBoard().mark(null, Row.TOP_ROW, Column.LEFT);
    }
}
