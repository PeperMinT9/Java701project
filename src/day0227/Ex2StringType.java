package day0227;

public class Ex2StringType {

    public static void main(String[] args) {
        // 2글자 이상 저장시 문자열 처리
        String s1 = new String("Hello"); // 방법1
        String s2 = "Apple Mango"; // 방법 2
        String s4 = "  Happy  ";
        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1 + 100; // String + int = String 문자열에서 +는 나열
        System.out.println(s3); // 3489
        System.out.println("34 + 89 = " + (34 + 89)); //123

        // String 클래스가 가진 메서드들
        System.out.println("s1의 length = " + s1.length()); // 길이를 구하는 length()메서드
        System.out.println("s2의 length = " + s2.length());
        System.out.println("s4의 length = " + s4.length());
        System.out.println("s4의 length = " + s4.trim().length()); // 5, s4의 값에서 앞뒤 공백 제거 글자만 취급

        // charAt(인덱스): 문자열에서 인덱스번지에 해당하는 문자(1글자) 반환
        // indexOf(문자): 해당 문자가 어디에 있는지 인덱스값 반환
        String msg = "Have a Good Day";
        System.out.println(msg.charAt(7)); // G
        System.out.println(msg.charAt(12)); // D
        System.out.println(msg.indexOf('G')); // 7
        System.out.println(msg.indexOf('D')); // 12
        System.out.println(msg.indexOf('a')); // 가장 처음 찾은 a의 인덱스 반환
        System.out.println(msg.lastIndexOf('a')); // 가장 마지막

        // 변수.startsWith("문자열"): 변수가 "문자열"로 시작하면 true반환
        // 변수.endsWith("문자열"): 변수가 "문자열"로 끝나면 true반환
        System.out.println(msg.startsWith("Have")); // true
        System.out.println(msg.endsWith("have")); // false
        System.out.println(msg.endsWith("Hello")); // false
        System.out.println(msg.endsWith("Day")); // true

        // substring(5): 5번 인덱스부터 끝까지 반환
        // substring(0, 10): 0에서 9까지 해당하는 문자열 반환
        System.out.println(msg.substring(7)); // G부터 끝까지 출력
        System.out.println(msg.substring(7, 11)); // Good

        System.out.println(msg.toLowerCase()); // 전부 소문자로 변환
        System.out.println(msg.toUpperCase()); // 전부 대문자로 변환

        // replace: 일부 문자 또는 단어 변경 후 반환
        System.out.println(msg.replace('a', '.'));
        System.out.println(msg.replace("Good", "Happy"));

        // 문자열 비교: equals, comparTo
        String m1 = "Apple";
        String m2 = "apple";
        String m3 = "Orange";

        // == 기본형에서는 값으로 비교, 클래스타입에서는 주소비교를 의미
        System.out.println(m1 == m2); // 주소 비교
        // 문자열같은 경우는 정확하게 값으로 비교하려면 위의 두 메서드 사용
        System.out.println(m1.equals(m2)); // false: m1이 m2와 같은지 비교(대소문자 구별)
        System.out.println(m1.equals("Apple"));
        System.out.println(m1.equalsIgnoreCase(m2)); // 대소문자 무시

        // compareTo는 두 문자열의 아스키코드값의 차이를 반환
        System.out.println(m1.compareTo(m3)); // m1이 작을 경우 음수반환
        System.out.println(m1.compareTo("Apple")); // 완전히 같으면 0
        System.out.println("computer".compareTo("command")); // 'p' 'm'을 비교 p(112), m(109) => 앞의 값이 더 큼 양수

        // split(','): ,로 분리하여 배열타입으로 반환
        String colors = "red, blue, green, orange, pink, black";
        String[] mycolor = colors.split(",");
        System.out.println("총" + mycolor.length + "개 분리함");
        // for문으로 출력(배열갯수만큼 자동 반복)
        for(String ch: mycolor) {
            System.out.println(ch.trim());
        }
    }
}
