package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class RoverTest {

    @Test
    public void shouldBeAbleToreturnPositionAndDirectionOFRoverAsString() {
        Rover rover = new Rover(1, 2, 'S');

        String expectedState = "1 2 S\n";
        String actualState = rover.roverState();

        assertEquals(expectedState, actualState);
    }

    @Test
    public void shouldBeAbleToTurnLeftWhileFacingNorth() {
        Rover rover = new Rover(1, 1, 'N');
        rover.roverTurn('L');

        String expectedState = "1 1 W\n";
        String actualState = rover.roverState();

        assertEquals(expectedState, actualState);
    }

    @Test
    public void shouldBeAbleToTurnLeftWhileFacingWest() {
        Rover rover = new Rover(1, 1, 'W');
        rover.roverTurn('L');

        String expectedState = "1 1 S\n";
        String actualState = rover.roverState();

        assertEquals(expectedState, actualState);
    }

    @Test
    public void shouldBeAbleToTurnLeftWhileFacingSouth() {
        Rover rover = new Rover(1, 1, 'S');
        rover.roverTurn('L');

        String expectedState = "1 1 E\n";
        String actualState = rover.roverState();

        assertEquals(expectedState, actualState);
    }

    @Test
    public void shouldBeAbleToTurnLeftWhileFacingEast() {
        Rover rover = new Rover(1, 1, 'E');
        rover.roverTurn('L');

        String expectedState = "1 1 N\n";
        String actualState = rover.roverState();

        assertEquals(expectedState, actualState);
    }

    @Test
    public void shouldBeAbleToTurnRightWhileFacingNorth() {
        Rover rover = new Rover(1, 1, 'N');
        rover.roverTurn('R');

        String expectedState = "1 1 E\n";
        String actualState = rover.roverState();

        assertEquals(expectedState, actualState);
    }


    @Test
    public void shouldBeAbleToTurnRightWhileFacingEast() {
        Rover rover = new Rover(1, 1, 'E');
        rover.roverTurn('R');

        String expectedState = "1 1 S\n";
        String actualState = rover.roverState();

        assertEquals(expectedState, actualState);
    }

    @Test
    public void shouldBeAbleToTurnRightWhileFacingSouth() {
        Rover rover = new Rover(1, 1, 'S');
        rover.roverTurn('R');

        String expectedState = "1 1 W\n";
        String actualState = rover.roverState();

        assertEquals(expectedState, actualState);
    }


    @Test
    public void shouldBeAbleToTurnRightWhileFacingWest() {
        Rover rover = new Rover(1, 1, 'W');
        rover.roverTurn('R');

        String expectedState = "1 1 N\n";
        String actualState = rover.roverState();

        assertEquals(expectedState, actualState);
    }

    @Test
    public void shouldBeAbleToMoveForwardWhileFacingNorth() {
        Rover rover = new Rover(5, 5, 'N');
        rover.roverMove();

        String expectedState = "5 6 N\n";
        String actualState = rover.roverState();

        assertEquals(expectedState, actualState);
    }


    @Test
    public void shouldBeAbleToMoveForwardWhileFacingEast() {
        Rover rover = new Rover(5, 5, 'E');
        rover.roverMove();

        String expectedState = "6 5 E\n";
        String actualState = rover.roverState();

        assertEquals(expectedState, actualState);
    }

    @Test
    public void shouldBeAbleToMoveForwardWhileFacingSouth() {
        Rover rover = new Rover(5, 5, 'S');
        rover.roverMove();

        String expectedState = "5 4 S\n";
        String actualState = rover.roverState();

        assertEquals(expectedState, actualState);
    }

    @Test
    public void shouldBeAbleToMoveForwardWhileFacingWest() {
        Rover rover = new Rover(5, 5, 'W');
        rover.roverMove();

        String expectedState = "4 5 W\n";
        String actualState = rover.roverState();

        assertEquals(expectedState, actualState);
    }

    @Test
    public void shouldBeAbleToCheckIfAroverCanMove() {
        Rover rover = new Rover(5, 5, 'W');

        assertTrue(rover.canMove(10,10));
    }

}