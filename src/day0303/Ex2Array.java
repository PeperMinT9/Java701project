package day0303;

public class Ex2Array {
    public static void main(String[] args) {
        String[] names = new String[5];
        int[] scores = new int[5];

        names[0] = "이름0";
        scores[0] = 10;

        names[1] = "이름1";
        scores[1] = 20;

        names[2] = "이름2";
        scores[2] = 30;

        names[3] = "이름3";
        scores[3] = 40;

//        names[4] = "이름4";
//        scores[4] = 50;

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i] + '\t' + scores[i]);
        }
    }
}
