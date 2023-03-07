package day0306;

class Person {
    static final String CITY = "Seoul";

    private String name;
    private String hp;

    public void setName(String name) {
        this.name = name;
    }
    public void setHp(String hp) {
        this.hp = hp;
    }
    public void setInfo(String name, String hp) {
        setName(name);
        setHp(hp);
    }
    public String getName() {
        return this.name;
    }
    public String getHp() {
        return this.hp;
    }

}
public class Ex6Object {
    public static void main(String[] args) {
        Person[] per = new Person[3]; // 메모리할당, 생성이 아님

        int per_length = per.length;
        for(int i = 0; i < per_length; i++) {
            per[i] = new Person();
        }

        per[0].setName("캐서린");
        per[0].setHp("010-2222-3333");

        per[1].setName("마이클");
        per[1].setHp("010-3434-1212");

        per[2].setName("수지");
        per[2].setHp("010-7878-7676");

        // 출력 방법 1
        System.out.println("City\tName\tHP");
        for(int i = 0; i < per_length; i++) {
            System.out.println(Person.CITY + "\t" + per[i].getName() + "\t" + per[i].getHp());
        }
        System.out.println("=".repeat(20));
        // 출력 방법 2
        for(Person p: per) {
            System.out.println(p.CITY + "\t" + p.getName() + "\t" + p.getHp());
        }
    }
}
