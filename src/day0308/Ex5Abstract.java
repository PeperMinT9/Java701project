package day0308;

abstract class AA {
    abstract public void play();
}

abstract class BB extends AA {
    abstract public void draw();
}

class CC extends BB {
    @Override
    public void draw() {
        System.out.println("draw");
    }

    @Override
    public void play() {
        System.out.println("play");
    }
}

public class Ex5Abstract {
    public static void main(String[] args) {
        BB b = new CC();
        b.play();
        b.draw();
    }
}
