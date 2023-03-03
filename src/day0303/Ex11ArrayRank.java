package day0303;

public class Ex11ArrayRank {
    public static void main(String[] args) {
        int[] score = {90, 89, 67, 89, 100};
        int[] rank = new int[5];

        // 등수 구하기 동점인 경우 동순위
        System.out.println("점수 \t등수");
        System.out.println("=".repeat(20));
        int arr_length = score.length;

        for(int i = 0; i < arr_length; i++) {
            rank[i] = 1;
            // i번지 점수보다 j번지 점수가 더 높다면 i번지의 등수를 1 증가한다
            for(int j = 0; j < arr_length; j++) {
                if(score[i] < score[j]) rank[i]++;
            }
        }
        for(int i = 0; i < arr_length; i++) {
            System.out.println(score[i] + "점 \t" + rank[i] + "등");
        }
    }
}
