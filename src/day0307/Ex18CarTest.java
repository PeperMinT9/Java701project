package day0307;

class Car {
    String color;
    int speed;
    int gear;

    Car() {
        this.speed = 10;
        this.gear = 1;
    }

    @Override
    public String toString() {
        return "Car [color= " + color + ", speed= " + speed + ", gear= " + gear + "]";
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void speedUp() {
        this.speed += 10;
    }

    public void speedDown() {
        this.speed -= 10;
    }
}
public class Ex18CarTest {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c);
        c.speedUp();
        c.changeGear(2);
        System.out.println(c);
    }
}
