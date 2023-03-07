package day0307;

import day0307_2.Shop;

public class Ex8Constructor {
    public static void main(String[] args) {
        Shop s1 = new Shop();
        s1.writeShop();

        Shop s2 = new Shop(2000);
        s2.writeShop();

        Shop s3 = new Shop("딸기");
        s3.writeShop();

        Shop s4 = new Shop("바나나", 3000);
        s4.writeShop();
    }
}
