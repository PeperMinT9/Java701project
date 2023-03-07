package day0306;

class Orange {
    private String stuName;
    private String stuNum;
    private int javaScore;
    private int springScore;

    // setter method
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }
    public void setJavaScore(int javaScore) {
        this.javaScore = javaScore;
    }
    public void setSpringScore(int springScore) {
        this.springScore = springScore;
    }
    public void setScore(int javaScore, int springScore) {
        this.javaScore = javaScore;
        this.springScore = springScore;
    }

    // getter method
    public String getStuName() {
        return this.stuName;
    }
    public String getStuNum() {
        return stuNum;
    }
    public int getJavaScore() {
        return javaScore;
    }
    public int getSpringScore() {
        return springScore;
    }

    public int getTotal() {
        return javaScore + springScore;
    }
    public String getGrade(int total) {
        String grade = total >= 90? "Very Good" : total >= 80? "Good" : "try";
        return grade;
    }
}
public class Ex5Object {
    public static void orangeWrite(Orange o) {
        System.out.println(o.getStuName() + " 님의 정보");
        System.out.println("학번: " + o.getStuNum());
        System.out.println("자바점수: " + o.getJavaScore());
        System.out.println("스프링점수: " + o.getSpringScore());
        System.out.println("총점: " + o.getTotal());
        System.out.println("해당학생 등급: " + o.getGrade(o.getTotal()));
        System.out.println("=".repeat(20));
        System.out.println();
    }

    public static void main(String[] args) {
        Orange or0 = new Orange();
        or0.setStuName("asdf");
        or0.setStuNum("s12345");
        or0.setScore(50, 60);

        Orange or1 = new Orange();
        or1.setStuName("xcvb");
        or1.setStuNum("s7890");
        or1.setJavaScore(10);
        or1.setSpringScore(20);

        orangeWrite(or0);
        orangeWrite(or1);
    }
}
