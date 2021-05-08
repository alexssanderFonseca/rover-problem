package br.com.alexsd.direction;


import br.com.alexsd.CardinalPoints;
import br.com.alexsd.Position;

public class East extends Direction {

    public East() {
        super(CardinalPoints.EAST);
    }

    @Override
    public Direction changeDirectionToLeft() {
        changeCurrentHeading(CardinalPoints.NORTH);
        return new North();
    }

    @Override
    public Direction changeDirectionToRight() {
        changeCurrentHeading(CardinalPoints.SOUTH);
        return new South();
    }


    @Override
    public Position moveForward(Position currentSpot) {
        var newCoordinateX = currentSpot.getCoordinateX() + 1;
        return new Position(newCoordinateX, currentSpot.getCoordinateY());
    }



}
