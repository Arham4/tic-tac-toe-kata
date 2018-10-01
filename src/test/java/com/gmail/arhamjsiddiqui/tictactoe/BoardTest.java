package com.gmail.arhamjsiddiqui.tictactoe;

import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Column;
import com.gmail.arhamjsiddiqui.tictactoe.coordinates.Row;
import org.junit.Test;

public class BoardTest {
    @Test
    public void placeMarkOnBoardShouldReturnMarkWhenFetched() {
        Session session = new Session();
        session.getBoard().mark(session.getPlayerOne(), Row.TOP_ROW, Column.LEFT);

    }

    @Test(expected = NullPointerException.class)
    public void placeMarkOnNullRowShouldReturnNullPointerException() {
        Session session = new Session();
        session.getBoard().mark(session.getPlayerOne(), null, Column.RIGHT);
    }
}
