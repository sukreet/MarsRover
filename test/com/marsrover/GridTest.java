package com.marsrover;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class GridTest {

    @Test
    public void shouldBeAbleToMoveRoverForward() {
        Rover rover = new Rover(5, 5, 'E');
        Grid grid = new Grid(10, 10, rover, "MM");

        String actualState = grid.moveRover();
        String expectedPosition = "7 5 E\n";

        assertEquals(actualState, expectedPosition);

    }

    @Test
    public void shouldBeAbleToMoveRoverForwardAndTurnLeft() {
        Rover rover = new Rover(5, 5, 'E');
        Grid grid = new Grid(10, 10, rover, "MML");

        String actualState = grid.moveRover();
        String expectedPosition = "7 5 N\n";

        assertEquals(actualState, expectedPosition);

    }

    @Test
    public void shouldBeAbleToMoveRoverForwardAndTurnRight() {
        Rover rover = new Rover(5, 5, 'E');
        Grid grid = new Grid(10, 10, rover, "MMR");

        String actualState = grid.moveRover();
        String expectedPosition = "7 5 S\n";

        assertEquals(actualState, expectedPosition);

    }
}
