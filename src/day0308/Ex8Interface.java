package day0308;

// class가 class를 상속받을때 extends
// interface가 interface를 상속받을때 extends
// class가 interface를 구현할때 implements

interface Kiwi {
    public void play();
}

interface Manggo extends Kiwi {
    public void study();
}

class Banana {
    public void eat() {
        System.out.println("바나나를 먹어요");
    }
}

class Berry extends Banana implements Manggo {
    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void study() {
        System.out.println("study");
    }
}



public class Ex8Interface {
    public static void main(String[] args) {
        Manggo m = new Berry();
        m.play();
        m.study();

        Banana b = new Berry();
        b.eat();

        Berry c = new Berry();
        c.eat();
        c.play();
        c.study();
    }
}
