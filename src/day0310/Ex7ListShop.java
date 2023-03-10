package day0310;

import java.util.ArrayList;
import java.util.List;

public class Ex7ListShop {
    public static void main(String[] args) {
        List<ShopDTO> list = new ArrayList<>();
        list.add(new ShopDTO("사과", 3, 2300));
        list.add(new ShopDTO("수박", 6, 4000));
        list.add(new ShopDTO("포도", 1, 6600));
        list.add(new ShopDTO("딸기", 2, 8800));
        list.add(new ShopDTO("망고", 5, 12000));

        System.out.println("총: " + list.size() + " 개의 상품이 있습니다");

        System.out.println("번호\t상품\t수량\t단가\t총금액");

        // 방법 1
//        int n = 1;
//        for(ShopDTO dto: list) {
//            System.out.println(n++ + "\t" + dto.getSangpum() + "\t" + dto.getSu() + "\t" + dto.getDan() + "\t" + dto.getSu() * dto.getDan());
//        }

        // 방법 2
        int al = list.size();
        for(int i = 0; i < al; i++) {
            System.out.printf("%d\t%s\t%d\t%d\t%d\n", (i + 1), list.get(i).getSangpum(), list.get(i).getSu(), list.get(i).getDan(), list.get(i).getSu() * list.get(i).getDan());
        }

        list.remove(1); // 1번 인덱스 제거후 다시 출력
        al = list.size();
        for(int i = 0; i < al; i++) {
            System.out.printf("%d\t%s\t%d\t%d\t%d\n", (i + 1), list.get(i).getSangpum(), list.get(i).getSu(), list.get(i).getDan(), list.get(i).getSu() * list.get(i).getDan());
        }

        list.clear(); // 전체 삭제
        System.out.println(list.size());

    }
}
