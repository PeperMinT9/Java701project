package day0306;

import java.util.Scanner;

public class Ex2ArrayPuzzle {
    public static void main(String[] args) {
        int[][] puzzle = new int[3][3];
        int bingo;
        Scanner sc = new Scanner(System.in);

        int puzzle_length = puzzle.length;
        int inner_puzzle_length = puzzle[0].length;
        while(true) {
            // 3행 3열에 1-3의 난수를 구해서 넣는다
            for(int i = 0; i < puzzle_length; i++) {
                for(int j = 0; j < inner_puzzle_length; j++) {
                    puzzle[i][j] = (int)(Math.random() * 3) + 1;
                }
            }

            // 출력
            for(int i = 0; i < puzzle_length; i++) {
                for(int j = 0; j < inner_puzzle_length; j++) {
                    System.out.printf("%4d", puzzle[i][j]);
                }
                System.out.println();
            }

            // 행, 열은 for문으로 해보자
            bingo = 0;
            for(int row = 0; row < puzzle_length; row++) {
                if(puzzle[row][0] == puzzle[row][1] && puzzle[row][1] == puzzle[row][2]) bingo++;
            }
            for(int col = 0; col < inner_puzzle_length; col++) {
                if(puzzle[0][col] == puzzle[1][col] && puzzle[1][col] == puzzle[2][col]) bingo++;
            }

            // 대각선
            if(puzzle[0][0] == puzzle[1][1] && puzzle[1][1] == puzzle[2][2]) bingo++;
            if(puzzle[0][2] == puzzle[1][1] && puzzle[1][1] == puzzle[2][0]) bingo++;

            if(bingo == 0) System.out.println("맞는 빙고가 없습니다");
            else System.out.printf("%2d개의 빙고가 있습니다\n", bingo);

            System.out.println("=".repeat(20));
            String ch = sc.nextLine();
            if(ch.equals("q")) {
                System.out.println("게임종료");
                break;
            }
        }
    }
}
