package day0308_2;

abstract class Shape1 {
    public abstract double getArea();
    public Shape1() {
        super();
    }
}

class Rectangle0 extends Shape1 {
    private double length;
    private double width;

    public Rectangle0(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Circle0 extends Shape1 {
    private double radius;

    public Circle0(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }
}

public class Ex16ShapeArea {
    public static void main(String[] args) {
        Shape1 obj0 = new Rectangle0(3, 4);
        Shape1 obj1 = new Circle0(3);

        System.out.println("Rec Area: " + obj0.getArea());
        System.out.println("Cir Area: " + obj1.getArea());
    }
}
