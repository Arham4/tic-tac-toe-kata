package com.gmail.arhamjsiddiqui.tictactoe;

import com.gmail.arhamjsiddiqui.tictactoe.player.Mark;
import com.gmail.arhamjsiddiqui.tictactoe.player.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SessionInitializerTest {
    private SessionInitializer sessionInitializer;
    private Session session;

    @Before
    public void makeSession() {
        sessionInitializer = new SessionInitializer();
        session = sessionInitializer.makeSession();
    }

    @Test
    public void makeSessionVerifyFields() {
        assertEquals(session.getPlayerOne(), new Player(Mark.X));
        assertEquals(session.getPlayerTwo(), new Player(Mark.O));
        assertNull(session.getWinner());
    }
}
