package day0310;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex3Map {
    public static void main(String[] args) {
        // Map 인터페이스를 구현하는 HashMap, TreeMap
        // key와 value의 쌍으로 저장되는 구조
        // 이때 key의 타입이 Set이다 중복허용안됨
        Map<String, String> map = new HashMap<>();
        map.put("name", "아무개");
        map.put("addr", "강남구");
        map.put("blood", "AB형");

        System.out.println(map.size());
        System.out.println("이름: " + map.get("name"));
        System.out.println("주소: " + map.get("addr"));
        System.out.println("혈액형: " + map.get("blood"));

        map.put("name", "이무개");
        System.out.println(map.size());
        System.out.println("이름: " + map.get("name")); // 송혜교
        System.out.println("나이: " + map.get("age")); // 없는 key를 이용하여 값을 얻을경우 null

        // 일괄적으로 map에 들어있는 모든값을 얻고자 한다면
        Set<String> keySet = map.keySet(); // key 들만 얻는다(set타입)
        System.out.println("=".repeat(30));
        for(String key: keySet) {
            String v = map.get(key);
            System.out.println(key + "=>" + v);
        }
    }
}
