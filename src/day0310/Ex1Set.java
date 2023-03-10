package day0310;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex1Set {
    public static void main(String[] args) {
        // Set 인터페이스를 구현한 클래스 HashSet
        // HashSet: 비순차적, 중복허용 안됨
        // TreeSet: 정렬되어 나옴
        // 제네릭스: <String>: String 타임만 넣을수 있다
        Set<String> set1 = new HashSet<>();
        Set<Integer> set2 = new TreeSet<>();

        set1.add("apple");
        set1.add("orange");
        set1.add("apple");
        set1.add("banana");
        // set1.add(3) // 오류발생 타입오류

        System.out.println("set1 = " + set1.size() + "개");

        System.out.println("** 출력 1 **");
        for(String s:set1)
            System.out.println(s); // 비순차
        System.out.println("** 출력 2 - iterator");
        Iterator<String> iter = set1.iterator();
        while(iter.hasNext()) { // 다음 데이터가 있을경우 true
            String s = iter.next(); // 다음 데이터를 얻어서 출력
            System.out.println(s);
        }

        // set2: 배열에 int를 넣은후 set2에 넣기
        int[] arr = {4, 4, 3, 1, 8, 3, 5};
        for(int a: arr) {
            set2.add(a);
        }

        System.out.println("set2= " + set2.size() + "개");

    }
}
