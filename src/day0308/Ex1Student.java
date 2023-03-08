package day0308;

public class Ex1Student extends Ex1School{
    private String stuName;
    private String stuAddr;
    private int score;

    public Ex1Student() {}

    public Ex1Student(String schoolName, String schoolLoc, String stuName, String stuAddr,int score) {
        super(schoolName, schoolLoc);
        this.stuName = stuName;
        this.stuAddr = stuAddr;
        this.score = score;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuAddr() {
        return stuAddr;
    }

    public void setStuAddr(String stuAddr) {
        this.stuAddr = stuAddr;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Ex1Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAddr='" + stuAddr + '\'' +
                ", score=" + score +
                "} " + super.toString();
    }
}
