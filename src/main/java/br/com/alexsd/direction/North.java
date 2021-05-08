package br.com.alexsd.direction;

import br.com.alexsd.CardinalPoints;
import br.com.alexsd.Position;

public class North  extends Direction {

    public North() {
        super(CardinalPoints.NORTH);
    }

    @Override
    public Direction changeDirectionToLeft() {
        changeCurrentHeading(CardinalPoints.WEST);
        return new West();
    }

    @Override
    public Direction changeDirectionToRight() {
        changeCurrentHeading(CardinalPoints.EAST);
        return new East();
    }

    @Override
    public Position moveForward(Position currentSpot) {
        var newCoordinateY = currentSpot.getCoordinateY() + 1;
        return new Position(currentSpot.getCoordinateX(),newCoordinateY);
    }


}
