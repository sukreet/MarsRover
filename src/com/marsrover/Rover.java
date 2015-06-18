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
        if (input == 'L') {
            if (this.directionFacing == 'N')
                this.directionFacing = 'W';
            else if (this.directionFacing == 'W')
                this.directionFacing = 'S';
            else if (this.directionFacing == 'S')
                this.directionFacing = 'E';
            else if (this.directionFacing == 'E')
                this.directionFacing = 'N';
        } else if (input == 'R') {
            if (this.directionFacing == 'N')
                this.directionFacing = 'E';
            else if (this.directionFacing == 'E')
                this.directionFacing = 'S';
            else if (this.directionFacing == 'S')
                this.directionFacing = 'W';
            else if (this.directionFacing == 'W')
                this.directionFacing = 'N';
        }
    }
}
