// Zachary Gibson
// 60975
// Lab 10

package cback;

public class EquilateralTriangle extends GeometricObject {
    private double sideLength;

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3)/4) * (Math.pow(sideLength, 2));
    }

    @Override
    public double getPerimeter() {
        return sideLength * 3;
    }

    @Override
    public String toString() {
        return String.format("EquilateralTriangle (%.2f): Area=%.2f, Perimeter=%.2f", sideLength, getArea(), getPerimeter());
    }
}
