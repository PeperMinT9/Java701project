package day0307;

class Human {
    String name;
    public Human() {}
    public Human(String name) {
        this.name = name;
    }
}

class  Worker extends Human {
    String id;
    public Worker() {
        super();
    }
    public Worker(String name) {
        super(name);
    }
    public Worker(String name, String id) {
        super(name);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Worker: id= " + id + "\tname= " + name;
    }
}
public class Ex20WorkerTest {
    public static void main(String[] args) {
        Worker w = new Worker("Lee", "2012323412");
        System.out.println(w);
    }
}
