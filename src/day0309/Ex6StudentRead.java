package day0309;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex6StudentRead {
    static final String FILENAME = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\student.txt";

    public static void studentRead() {
        FileReader fr = null;
        BufferedReader br = null;
        String data;

        try {
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
            System.out.println("=".repeat(30));

            while(true) {
                data = br.readLine();
                if(data == null || data.length() == 0) break;
                String[] arr = data.trim().split(",");
                // 총점
                int tot = Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]) + Integer.parseInt(arr[3]);
                // 평균
                double avg = tot / 3.0;
                System.out.printf("%s\t%s\t%s\t%s\t%d\t%3.1f\n", arr[0], arr[1], arr[2], arr[3], tot, avg);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("파일없음: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("입출력오류: " + e.getMessage());
        }
        finally {
            try {
                if(fr != null) fr.close();
                if(br != null) br.close();
            } catch (IOException e) {}
        }
    }

    public static void main(String[] args) {
        studentRead();
    }

}
