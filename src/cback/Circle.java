// Zachary Gibson
// 60975
// Lab 10

package cback;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle (r=%.2f): Area=%.2f, Perimeter=%.2f", radius, getArea(), getPerimeter());
    }
}
