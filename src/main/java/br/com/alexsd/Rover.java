package br.com.alexsd;

import br.com.alexsd.direction.Direction;

public class Rover {

    private Position position;
    private Direction heading;


    public Rover(Position position, Direction heading) {
        this.position = position;
        this.heading = heading;
    }

    public void rotateToLeft() {
        this.heading = this.heading.changeDirectionToLeft();
    }

    public void rotateToRight() {
        this.heading = this.heading.changeDirectionToRight();
    }

    public void moveForward() {
        this.position = this.heading.moveForward(this.position);
    }

    public Position getPosition() {
        return position;
    }

    public Direction getHeading() {
        return heading;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "position =" + " X: "+ position.getCoordinateX()
                            + " Y: "+ position.getCoordinateY()
                + ", heading=" + heading.getCurrentHeading().getPoint()
               +
                '}';
    }
}
