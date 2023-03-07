package day0307;

class Stu {
    private String name;
    private int score;
    private int age;
    
    Stu() { // 3번째 생산자 혼출
        this("미자", 10, 10); 
    }
    Stu(String name) { // 3번째 생산자 혼출
        this(name, 10, 10);
    }
    Stu(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }
    public void writeStu() {
        System.out.println(name + "\t" + score + "점\t" + age + "세");
    }
}
public class Ex10ArrayConst {
    public static void main(String[] args) {
        Stu[] stu = new Stu[3];
        stu[0] = new Stu();
        stu[1] = new Stu("이지아");
        stu[2] = new Stu("박미자", 90, 23);

        for(Stu s: stu) {
            s.writeStu();
        }

        System.out.println("=".repeat(40));
        Stu[] stu2 = {
                new Stu(),
                new Stu("철수"),
                new Stu("남수", 89, 35)
        };

        for(Stu s: stu2) {
            s.writeStu();
        }
    }
}
