package com.marsrover;

public class Main {

        public static void main(String args[]) {
            Rover rover = new Rover(1,2,'N');
            Grid grid = new Grid(5,5,rover,"LMLMLMLMM");
            System.out.print(grid.moveRover());
        }
}
