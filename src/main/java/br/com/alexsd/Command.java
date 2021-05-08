package br.com.alexsd;

import br.com.alexsd.direction.Direction;

public class Command {

    private final Rover rover;
    private final String message;

    public Command(String message) {
        this.message = message;
        var initialPosition = getInitialRoverPosition();
        var position = new Position(initialPosition);
        var direction = getDirection(initialPosition);
        this.rover = new Rover(position, direction);


    }


    public String[] getInitialRoverPosition() {
        return getLineMessage()[1].split(" ");
    }

    private String[] getLineMessage() {
        return message.split("\\r?\\n");
    }

    private String[] getCommands() {
        return getLineMessage()[2].split(" ");
    }

    private Direction getDirection(String[] initialPosition) {
        var heading = initialPosition[2];
        return CardinalPoints.findDirectionByValue(heading)
                .getDirection();
    }

    public void execute() {
        for (String command : getCommands()) {
            move(command);
        }
    }

    private void move(String command) {
        if (command.equals("L")) {
            this.rover.rotateToLeft();
        }
        if (command.equals("R")) {
            this.rover.rotateToRight();
        }
        if (command.equals("M")) {
            this.rover.moveForward();
        }
    }

    public String getMessage() {
        return message;
    }

    public Rover getRover() {
        return rover;
    }


}
