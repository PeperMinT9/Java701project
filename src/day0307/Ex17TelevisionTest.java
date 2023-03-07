package day0307;

class Television {
    private int channel;
    private int volume;
    private boolean onOff;

    Television(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널: " + channel + "\t볼륨: " + volume);
    }
}
public class Ex17TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television(7, 10, true);
        myTv.print();

        Television yourTv = new Television(11, 20, true);
        yourTv.print();
    }
}
