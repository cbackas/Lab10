// Zachary Gibson
// 60975
// Lab 10

package cback;

public abstract class GeometricObject {
    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "GeometricObject: Area=?, Perimeter=?";
    }
}
