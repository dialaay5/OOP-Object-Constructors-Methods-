package org.example;

public class Rectangle {
    protected double width = 5.0;
    protected double height= 4.0;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String getArea() {
        return ("The area of the rectangle= " + (width * height) + " " + "width= " + this.width + " " + "height= " + this.height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
