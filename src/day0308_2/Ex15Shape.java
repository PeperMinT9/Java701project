package day0308_2;

interface Shape {
    abstract void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle Draw");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle Draw");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle Draw");
    }
}

public class Ex15Shape {
    public static void main(String[] args) {
        Shape[] b = new Shape[3];
        b[0] = new Rectangle();
        b[1] = new Triangle();
        b[2] = new Circle();

        for(int i = 0; i < 3; i++) {
            b[i].draw();
        }
    }
}
