package br.com.alexsd;

import br.com.alexsd.direction.Direction;
import br.com.alexsd.direction.East;
import br.com.alexsd.direction.North;
import br.com.alexsd.direction.South;
import br.com.alexsd.direction.West;
import java.util.stream.Stream;

public enum CardinalPoints {
    NORTH("N"){
        @Override
        public Direction getDirection() {
            return new North();
        }
    },
    WEST("W"){
        @Override
        public Direction getDirection() {
            return new West();
        }
    },
    EAST("E"){
        @Override
        public Direction getDirection() {
            return new East();
        }
    },
    SOUTH("S"){
        @Override
        public Direction getDirection() {
            return new South();
        }
    };

    CardinalPoints(String point) {
        this.point = point;
    }
    private final String point;


    public static CardinalPoints findDirectionByValue(String value){
        return Stream.of(CardinalPoints.values())
                .filter(cardinal-> cardinal.getPoint().equals(value))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Invalid enum value"));
    }

    public abstract Direction getDirection();


    public String getPoint() {
        return point;
    }
}
