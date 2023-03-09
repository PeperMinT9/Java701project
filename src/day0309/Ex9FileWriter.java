package day0309;

import java.io.FileWriter;
import java.io.IOException;

public class Ex9FileWriter {
    static final String FILENAME = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\memo.txt";

    public static void memoWriter() {
        FileWriter fw = null;

        try {
            fw = new FileWriter(FILENAME); // memo.txt가 없을 경우 새로만듬, 있을경우 덮어씀

            fw.write("이름: 아무개\n");
            fw.write("주소: 서울시 강남구\n");
            fw.write("핸드폰: 010-1234-5678\n");
            fw.write("=====================\n");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try { fw.close(); }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        memoWriter();
    }
}
