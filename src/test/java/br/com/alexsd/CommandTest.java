package br.com.alexsd;

import static org.junit.Assert.*;


import org.junit.Test;

public class CommandTest {
    @Test
    public void shouldGetRoverInitialPosition() {
        var command = getCommand();

        var position = command.getInitialRoverPosition();
        assertArrayEquals(new String[] {"3", "3", "E"}, position);
    }

    private Command getCommand() {
        return new Command("5 5\n" +
                "3 3 E\n" +
                "M M R M M R M R R M");
    }

    @Test
    public void shouldGoTo() {
        var command = getCommand();
        command.execute();
        var rover = command.getRover();
        var position = rover.getPosition();
        var heading = rover.getHeading();

        assertEquals(5, position.getCoordinateX());
        assertEquals(1, position.getCoordinateY());
        assertEquals(CardinalPoints.EAST, heading.getCurrentHeading());
    }

}