package day0310;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex6ListVector {
    public static void main(String[] args) {
//        Vector<String> listStrings = new Vector<>(); // 일단 10개로 할당
//        Vector<String> listStrings = new Vector<>(5); // 5개로 할당, 초과될경우 2배로 늘어난다
        Vector<String> listStrings = new Vector<>(5, 3); // 초기 5개, 초과될경우 3개씩 늘어남
        System.out.println("size는 실제 데이터가 들어가 있는 갯수: " + listStrings.size());
        System.out.println("capacity는 할당 갯수: " + listStrings.capacity()); // 10 - Vector만이 갖고 있는 메서드

        listStrings.add("장미꽃");
        listStrings.add("안개꽃");
        listStrings.add("장미꽃");
        listStrings.add("국화꽃");

        System.out.println(listStrings.size());

        List<String> list2 = new Vector<>();
        // 나열된 문자열이 List 타입으로 변환되서 리턴
        list2 = Arrays.asList("빨강색", "분홍색", "검정색", "노랑색", "오렌지색");
        System.out.println(list2.size());

        System.out.println("** list1 출력 1 **");
        int n = 1;
        for(String s: listStrings) {
            System.out.println(n++ + ": " + s);
        }

        System.out.println("** list2 출력 2 **");
        int al = list2.size();
        for(int i = 0; i < al; i++) {
            String s = list2.get(i); // i번지 데이터를 꺼낸다
            System.out.println((i+1) + ": " + s);
        }

        System.out.println("** list2 출력 3 **");
        n = 1;
        Iterator<String> iter = list2.iterator();
        while(iter.hasNext()) {
            String s = iter.next();
            System.out.println(n++ + ": " + s);
        }
    }
}
