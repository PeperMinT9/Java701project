package day0309;

import java.io.*;
import java.util.Scanner;

public class Ex11File {
    static final String FILENAME1 = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\info.txt";

    public static void infoRead() {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(FILENAME1);
            br = new BufferedReader(fr);

            int n = 1;
            while(true) {
                String name = br.readLine();
                if(name == null) break;

                String addr = br.readLine();
                System.out.println(n++ + "\t" + name + "\t" + addr);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다. 먼저 데이터를 저장해주세요.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(br != null) br.close();
                if(fr != null) fr.close();
            }
            catch (IOException e) {}
        }
    }

    public static void fileSave() {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        try {
            fw = new FileWriter(FILENAME1); // append 추가모드로 생성
            // 이름과 주소를 입력받아 파일에 저장
            System.out.println("이름입력");
            String name = sc.nextLine();
            System.out.println("주소입력");
            String addr = sc.nextLine();

            fw.write(name + "\n");
            fw.write(addr + "\n");
            System.out.println("파일에 추가하였습니다");
        }
        catch (IOException e) {
           e.printStackTrace();
        }
        finally {
            try {
                fw.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void fileDelete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제를 하려면 y를 눌러주세요");
        String ans =sc.nextLine();
        if(ans.equalsIgnoreCase("y")) {
            File file = new File(FILENAME1);
            file.delete();
            System.out.println("파일삭제 완료");
        }
        else {
            System.out.println("파일 삭제 취소!!!");
        }
    }

    public static int getMenu() {
        System.out.println(" ** 메뉴 ** ");
        System.out.println();
        System.out.println("1. 데이터입력  2. 전체출력  3. 파일삭제  4. 종료");
        Scanner sc = new Scanner(System.in);
        int menu = Integer.parseInt(sc.nextLine());

        return menu;
    }

    public static void main(String[] args) {
        while (true) {
            int menu = getMenu();
            switch (menu) {
                case 1:
                    fileSave();
                    break;
                case 2:
                    infoRead();
                    break;
                case 3:
                    fileDelete();
                    break;
                default:
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);
            }
        }
    }
}
