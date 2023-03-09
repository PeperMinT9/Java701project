package day0309;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex7ScoreRead {
    public static final String FILENAME = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\100.txt";
    public static void scoreRead() {
        int count = 0;
        int sum = 0;
        FileReader fr = null;
        BufferedReader br = null;
        String data;

        try {
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            while(true) {
                data = br.readLine();
                if(data == null || data.length() == 0) break;

                try {
                    sum += Integer.parseInt(data);
                    System.out.printf("%s\t", data);
                    count++;
                    if (count % 5 == 0) System.out.println();
                }
                catch (NumberFormatException e) {
                    // System.out.print(e.getMessage());
                }
            }
            System.out.println();
            System.out.printf("총점: %d\n", sum);
            System.out.printf("평균: %3.2f", (double)sum / count);
        }
        catch(FileNotFoundException e) {
            System.out.println("파일 찾을수 없음: " + e.getMessage());
        }
        catch(IOException e) {
            System.out.println("입출력 오류 발생: " + e.getMessage());
        }
        finally {
            try {
                if(fr != null) fr.close();
                if(br != null) br.close();
            }
            catch (IOException e) {
                System.out.println("닫기 오류: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        scoreRead();
    }
}
