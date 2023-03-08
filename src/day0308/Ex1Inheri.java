package day0308;

public class Ex1Inheri {
    public static void main(String[] args) {
        Ex1Student s0 = new Ex1Student();
        System.out.println(s0); // s0.toString()과 같다

        s0.setSchoolName("강남고");
        s0.setSchoolLoc("청담동");
        s0.setStuName("아무개");
        s0.setStuAddr("강남구");
        s0.setScore(99);
        System.out.println(s0);
        System.out.println("=".repeat(30));

        Ex1Student s1 = new Ex1Student("역삼고", "역삼동", "이무개", "강남구", 89);
        System.out.println(s1);
    }
}
