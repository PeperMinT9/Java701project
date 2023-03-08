package day0308;

interface InterB {
    public void paint();
    public void save();
}

abstract class AbstOne {
    public void show() {
        System.out.println("AnstOne-show");
    }

    abstract public void study();
}

class MyAnony {
    // InterB 구현
    InterB b = new InterB() {
        @Override
        public void paint() {
            System.out.println("paint");
        }

        @Override
        public void save() {
            System.out.println("save");
        }
    };

    // AbstOne 구현
    AbstOne a = new AbstOne() {
        @Override
        public void study() {
            System.out.println("study");
        }

        @Override
        public void show() {
            super.show();
            System.out.println("상속받은 show");
        }
    };
}

public class Ex13AnonyClass {
    public static void main(String[] args) {
        MyAnony ma = new MyAnony();
        ma.a.study();
        ma.b.paint();
        ma.b.save();
        ma.a.show();
    }
}
