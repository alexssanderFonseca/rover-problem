package br.com.alexsd.direction;

import br.com.alexsd.CardinalPoints;
import br.com.alexsd.Position;

public class South extends Direction {

    public South() {
        super(CardinalPoints.SOUTH);
    }

    @Override
    public Direction changeDirectionToLeft() {
        changeCurrentHeading(CardinalPoints.WEST);
        return new East();
    }

    @Override
    public Direction changeDirectionToRight() {
        changeCurrentHeading(CardinalPoints.EAST);
        return new West();
    }

    @Override
    public Position moveForward(Position currentSpot) {
        var newCoordinateY = currentSpot.getCoordinateY() - 1;
        return new Position(currentSpot.getCoordinateX(), newCoordinateY);
    }


}
