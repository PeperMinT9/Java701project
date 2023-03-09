package day0309;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex5FileReaderException {
    static final String FILENAME = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\member1.txt";

    public static void memberRead() {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            while(true) {
                String name = br.readLine();
                if (name == null || name.length() == 0) break;
                String addr = br.readLine();
                String hp = br.readLine();
                System.out.printf("%s : %s : %s\n", name, addr, hp);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다 " + e.getMessage());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            // 방법 1
            //                try {
            //                    System.out.println("자원들 모두 닫힘");
            //                    br.close();
            //                    fr.close();
            //                }
            //                catch(IOException | NullPointerException e) {
            //                    e.printStackTrace();
            //                }

            // 방법 2
            System.out.println("자원들 모두 닫힘");
            try {
                if(br != null) br.close();
                if(fr != null) fr.close();
            }
            catch(IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        memberRead();
    }
}
