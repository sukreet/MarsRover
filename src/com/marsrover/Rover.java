package com.marsrover;

public class Rover {
    private int xCoordinate;
    private int yCoordinate;
    private char directionFacing;

    public Rover(int xCoordinate, int yCoordinate, char directionFacing) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.directionFacing = directionFacing;
    }


    public String roverState() {
        String state = "";
        state += this.xCoordinate + " " + this.yCoordinate + " " + this.directionFacing + System.lineSeparator();
        return state;
    }

    public void roverAction(char input) {
        if(this.directionFacing == 'N');
           if(input=='L')
               this.directionFacing = 'W';
    }
}
