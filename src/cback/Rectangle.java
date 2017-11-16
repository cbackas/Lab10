// Zachary Gibson
// 60975
// Lab 10

package cback;

public class Rectangle extends GeometricObject {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (height * 2) + (width * 2);
    }

    @Override
    public String toString() {
        return String.format("Rectangle (%.2fx%.2f): Area=%.2f, Perimeter=%.2f", height, width, getArea(), getPerimeter());
    }
}
