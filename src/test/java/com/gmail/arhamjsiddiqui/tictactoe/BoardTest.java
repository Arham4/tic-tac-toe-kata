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

    @Test(expected = NullPointerException.class)
    public void placeMarkOnNullRowShouldReturnNullPointerException() {
        Session session = new Session();
        session.getBoard().mark(session.getPlayerOne(), null, Column.RIGHT);
    }

    @Test(expected = NullPointerException.class)
    public void placeMarkOnNullColumnShouldReturnNullPointerException() {
        Session session = new Session();
        session.getBoard().mark(session.getPlayerOne(), Row.TOP_ROW, null);
    }

    @Test(expected = NullPointerException.class)
    public void placeMarkUsingNullPlayerShouldReturnNullPointerException() {
        Session session = new Session();
        session.getBoard().mark(null, Row.TOP_ROW, Column.LEFT);
    }
}
