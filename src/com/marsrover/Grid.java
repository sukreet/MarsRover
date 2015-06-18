package com.marsrover;

public class Grid {
    private int xCoordinateLimit;
    private int yCoordinteLimit;
    private Rover rover;
    private String actionList;

    public Grid(int xCoordinateLimit, int yCoordinteLimit, Rover rover, String actionList) {
        this.xCoordinateLimit = xCoordinateLimit;
        this.yCoordinteLimit = yCoordinteLimit;
        this.rover = rover;
        this.actionList = actionList;
    }

    public String moveRover() {
        for (int i = 0; i < actionList.length(); i++) {
            if(actionList.charAt(i) == 'M')
                rover.roverMove();
            if(actionList.charAt(i) == 'L')
                rover.roverTurn('L');

        }
        return rover.roverState();

    }

}
