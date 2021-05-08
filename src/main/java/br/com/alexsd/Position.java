package br.com.alexsd;


public class Position {

    private int coordinateX;
    private int coordinateY;

    public Position(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Position(String[] position) {
        getCoordinates(position);
    }

    private void getCoordinates(String[] position) {
        this.coordinateX = Integer.parseInt(position[0]);
        this.coordinateY = Integer.parseInt(position[1]);

    }


    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }


}
