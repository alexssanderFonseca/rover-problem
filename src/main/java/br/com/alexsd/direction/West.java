package br.com.alexsd.direction;

import br.com.alexsd.CardinalPoints;
import br.com.alexsd.Position;

public class West extends Direction {

    public West() {
        super(CardinalPoints.WEST);
    }

    @Override
    public Direction changeDirectionToLeft() {
        changeCurrentHeading(CardinalPoints.NORTH);
        return new South();
    }

    @Override
    public Direction changeDirectionToRight() {
        changeCurrentHeading(CardinalPoints.SOUTH);
        return new North();
    }


    @Override
    public Position moveForward(Position currentSpot) {
        var newCoordinateX = currentSpot.getCoordinateX() - 1;
        return new Position(newCoordinateX, currentSpot.getCoordinateY());
    }
}
