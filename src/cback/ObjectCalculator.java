// Zachary Gibson
// 60975
// Lab 10

package cback;


import java.util.ArrayList;
import java.util.Scanner;

public class ObjectCalculator {
    public static void main(String args[]) {
        ArrayList<GeometricObject> objects = new ArrayList<>();

        // Create a Scanner to read input from the keyboard
        Scanner scan = new Scanner(System.in);

        // Prompt the user for a radius, get the radius from
        // the keyboard, and add the circle to the list of objects.
        System.out.println("Provide a radius value: ");
        try {
            double r = Double.parseDouble(scan.nextLine());
            objects.add(new Circle(r));
        } catch (Exception e) {
            System.out.println("Couldn't make circle using your input.");
        }

        // Prompt the user for a side length for an equilateral triangle.
        // Create an equilateral triangle with that side length and
        // add it to the list of objects.
        System.out.println("Provide a side length value: ");
        try {
            double sl = Double.parseDouble(scan.nextLine());
            objects.add(new EquilateralTriangle(sl));
        } catch (Exception e) {
            System.out.println("Couldn't make an equilateral triangle using your input.");
        }

        // Prompt the user for the width and height of a rectangle.
        // Create a rectangle with that width and height and add it
        // to the list of objects.
        System.out.println("Provide a height value: ");
        double h = 0;
        try {
            h = Double.parseDouble(scan.nextLine());
        } catch (Exception e) {
            System.out.println("Height value incorrect.");
        }
        System.out.println("Provide a width value: ");
        double w = 0;
        try {
            w = Double.parseDouble(scan.nextLine());
        } catch (Exception e) {
            System.out.println("Width value incorrect.");
        }
        objects.add(new Rectangle(h, w));

        // Write a for loop that will print out all of the objects
        // in the list, along with their attributes (radius for circle,
        // width and height for rectangle, and side length for
        // equilateral triangle).
        // Write code that will calculate and print the total perimeter
        // and total area of all the objects in the list.
        double area = 0;
        double perimeter = 0;
        for (GeometricObject object : objects) {
            System.out.println(object.toString());
            area += object.getArea();
            perimeter += object.getPerimeter();
        }

        System.out.println("Total area: " + String.format("%.2f", area));
        System.out.println("Total perimeter: " + String.format("%.2f", perimeter));
    }
}