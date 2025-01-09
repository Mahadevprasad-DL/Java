package shape;

import java.util.Scanner;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}

