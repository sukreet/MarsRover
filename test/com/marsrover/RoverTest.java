package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void shouldBeAbleToreturnPositionAndDirectionOFRoverAsString() {
        Rover rover = new Rover(1, 1, 'S');

        String expectedState = "1 1 S\n";
        String actualState = rover.roverState();

        assertEquals(expectedState, actualState);
    }

}
