package br.com.alexsd;

import static org.junit.Assert.*;



import org.junit.Test;

public class RoverTest {

    private static final int COORDINATE_X = 1;
    private static final int COORDINATE_Y = 2;


    @Test
    public void roverHeadingNorthShouldRotateToLeft(){
        var rover = getRoverHeadingTo(CardinalPoints.NORTH);
        rover.rotateToLeft();
        assertEquals(CardinalPoints.WEST, getCurrentHeading(rover));
    }

    @Test
    public void roverHeadingNorthShouldRotateToRight(){
        var rover = getRoverHeadingTo(CardinalPoints.NORTH);
        rover.rotateToRight();
        assertEquals(CardinalPoints.EAST,  getCurrentHeading(rover));
    }

    @Test
    public void roverHeadingNorthShouldMoveForward(){
        var rover = getRoverHeadingTo(CardinalPoints.NORTH);
        rover.moveForward();
        var currentYPosition = rover.getPosition().getCoordinateY();
        var expectedPositionAfterMove = 3;
        assertEquals(expectedPositionAfterMove, currentYPosition);
    }

    @Test
    public void roverHeadingSouthShouldRotateToLeft(){
        var rover = getRoverHeadingTo(CardinalPoints.SOUTH);
        rover.rotateToLeft();
        assertEquals(CardinalPoints.EAST, getCurrentHeading(rover));
    }


    @Test
    public void roverHeadingSouthShouldRotateToRight(){
        var rover = getRoverHeadingTo(CardinalPoints.SOUTH);
        rover.rotateToRight();
        assertEquals(CardinalPoints.WEST, getCurrentHeading(rover));
    }

    @Test
    public void roverHeadingSouthShouldMoveForward(){
        var rover = getRoverHeadingTo(CardinalPoints.SOUTH);
        rover.moveForward();
        var currentYPosition = rover.getPosition().getCoordinateY();
        var expectedPositionAfterMove = 1;
        assertEquals(expectedPositionAfterMove, currentYPosition);
    }

    @Test
    public void roverHeadingWestShouldRotateToLeft(){
        var rover = getRoverHeadingTo(CardinalPoints.WEST);
        rover.rotateToLeft();
        assertEquals(CardinalPoints.SOUTH, getCurrentHeading(rover));
    }

    @Test
    public void roverHeadingWestShouldRotateToRight(){
        var rover = getRoverHeadingTo(CardinalPoints.WEST);
        rover.rotateToRight();
        assertEquals(CardinalPoints.NORTH, getCurrentHeading(rover));
    }

    @Test
    public void roverHeadingWestShouldMoveForward(){
        var rover = getRoverHeadingTo(CardinalPoints.WEST);
        rover.moveForward();
        var currentXPosition = rover.getPosition().getCoordinateX();
        var expectedPositionAfterMove = 0;
        assertEquals(expectedPositionAfterMove, currentXPosition);
    }

    @Test
    public void roverHeadingEastShouldRotateToLeft(){
        var rover = getRoverHeadingTo(CardinalPoints.EAST);
        rover.rotateToLeft();
        assertEquals(CardinalPoints.NORTH, getCurrentHeading(rover));
    }

    @Test
    public void roverHeadingEastShouldRotateToRight(){
        var rover = getRoverHeadingTo(CardinalPoints.EAST);
        rover.rotateToRight();
        assertEquals(CardinalPoints.SOUTH, getCurrentHeading(rover));
    }

    @Test
    public void roverHeadingEastShouldMoveForward(){
        var rover = getRoverHeadingTo(CardinalPoints.EAST);
        rover.moveForward();
        var currentXPosition = rover.getPosition().getCoordinateX();
        var expectedPositionAfterMove = 2;
        assertEquals(expectedPositionAfterMove, currentXPosition);
    }




    private CardinalPoints getCurrentHeading(Rover rover) {
        return rover.getHeading().getCurrentHeading();
    }

    private Rover getRoverHeadingTo(CardinalPoints cardinalPoint){
        var position = new Position(COORDINATE_X,COORDINATE_Y);
        var direction = cardinalPoint.getDirection();
        return new Rover(position,direction);
    }

}