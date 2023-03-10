package day0310;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Ex8ListShopFile {
    static final String FILENAME = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\shop.txt";
    List<ShopDTO> list = new Vector<>();
    Scanner sc = new Scanner(System.in);

    public Ex8ListShopFile() {
        shopFileRead();
    }

    // 처음 시작시 파일 읽어서 list에 담기
    public void shopFileRead() {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            while(true) {
                String line = br.readLine();
                if(line == null) break;

                String[] data = line.split(","); // 데이터 분리
                // dto에 각각 분리해서 넣은후 다시 list에 담기
                ShopDTO dto = new ShopDTO();
                dto.setSangpum(data[0]);
                dto.setSu(Integer.parseInt(data[1].trim()));
                dto.setDan(Integer.parseInt(data[2].trim()));

                list.add(dto);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다: " + e.getMessage());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(br != null) br.close();
                if(fr != null) fr.close();
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("총 " + list.size() + "개 데이터 가져옴");
    }

    // 종료시 list의 데이터를 파일에 저장
    public void shopFileSave() {
        FileWriter fw = null;
        try {
            fw = new FileWriter(FILENAME);

            for(ShopDTO dto: list) {
                String s = dto.getSangpum() + "," + dto.getSu() + "," + dto.getDan() + "\n";
                fw.write(s);
            }
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

    // 데이터 추가하는 메서드
    public void dataAdd() {
        System.out.println("추가할 상품은?");
        String sang = sc.nextLine();
        int su = 0, dan = 0;
        System.out.println("수량은?");
        try {
            su = Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException e) {
            // 문자가 잘못 입력되었을 경우 무조건 수량은 1개로 저장
            System.out.println("정수입력만 가능");
            su = 1;
        }
        System.out.println("단가는??");
        try {
            dan = Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException e) {
            // 문자가 잘못 입력되었을 경우 무조건 단가는 1000원으로 저장
            System.out.println("정수입력만 가능");
            dan = 1000;
        }
        ShopDTO temp_dto = new ShopDTO(sang, su, dan);
        list.add(temp_dto);
    }

    // 전체 출력하는 메서드
    public void shopList() {
        System.out.println("총: " + list.size() + "개의 상품이 있습니다");
        System.out.println("번호\t상품\t수량\t단가\t총금액");
        System.out.println("=".repeat(30));
        int n = 1;
        for(ShopDTO dto: list) {
            System.out.println(n++ + "\t" + dto.getSangpum() + "\t" + dto.getSu() + "\t" + dto.getDan() + "\t" + dto.getSu() * dto.getDan());
        }
    }

    // 상품 검색
    public void shopSearch() {
        System.out.println("검색할 상품명을 정확히 입력해주세요");
        String sang = sc.nextLine();

        int ls = list.size();
        boolean find = false;
        for(int i = 0; i < ls; i++) {
            ShopDTO dto = list.get(i);
            if(dto.getSangpum().startsWith(sang)) {
                System.out.println((i + 1) + "\t" + dto.getSangpum() + "\t" + dto.getSu() + "\t" + dto.getDan() + "\t" + dto.getSu() * dto.getDan());
                find = true;
            }
        }
        if(!false) {
            System.out.println(sang + " 상품이 없습니다");
        }
    }

    // 상품 삭제
    public void shopDelete() {
        System.out.println("삭제할 상품명을 정확히 입력해주세요");
        String sang = sc.nextLine();

        int ls = list.size();
        boolean find = false;
        for(int i = ls - 1; i >= 0; i--) {
            ShopDTO dto = list.get(i);
            if(sang.equals(dto.getSangpum())) {
                find = true;
                list.remove(i);
            }
        }
        if(!find) {
            System.out.println(sang + " 상품은 목록에 없습니다");
        }
        else {
            System.out.println(sang + " 상품을 삭제하였습니다");
        }
    }

    // 메뉴
    public int getMenu() {
        int menu;
        System.out.println(" ** 메뉴 선택 ** ");
        System.out.println("1. 상품 추가   2. 상품전체출력   3. 상품검색   4. 상품삭제   5. 종료");
        try {
            menu = Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException e) {
            menu = 2; // 문자로 잘못 입력시 무조건 전체 출력
        }

        return menu;
    }

    public static void main(String[] args) {
        Ex8ListShopFile ex = new Ex8ListShopFile();
        Exit:
        while(true) {
            switch (ex.getMenu()) {
                case 1:
                    ex.dataAdd();
                    break;
                case 2:
                    ex.shopList();
                    break;
                case 3:
                    ex.shopSearch();
                    break;
                case 4:
                    ex.shopDelete();
                    break;
                default:
                    ex.shopFileSave();
                    System.out.println("데이터 저장후 시스템 종료");
                    break Exit;
                    // System.exit(0);
            }
            System.out.println("-".repeat(50));
        }
    }
}
