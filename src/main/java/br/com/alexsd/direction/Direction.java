package br.com.alexsd.direction;

import br.com.alexsd.CardinalPoints;
import br.com.alexsd.Position;

public abstract class Direction {

    private CardinalPoints currentHeading;

    protected Direction(CardinalPoints currentHeading){
        this.currentHeading = currentHeading;
    }

    protected void changeCurrentHeading(CardinalPoints currentHeading){
        this.currentHeading = currentHeading;
    }

    public abstract Direction  changeDirectionToLeft();

    public abstract Direction changeDirectionToRight();

    public abstract  Position moveForward(Position currentSpot);

    public CardinalPoints getCurrentHeading() {
        return currentHeading;
    }
}
