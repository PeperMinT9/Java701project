package day0307_2;

public class Shop {
    private String sangpum;
    private int price;

    // 다른 패키지에서 생성자 호출이 가능하게 하려면
    // 앞에 접근지정자 public이 있어야한다
    public Shop() {
        System.out.println("디폴트 생성자 호출");
        sangpum = "사과";
        price = 1000;
    }
    public Shop(String sangpum) {
        this.sangpum = sangpum;
    }
    public Shop(int price) {
        this.price = price;
    }
    public Shop(String sangpum, int price) {
        this.sangpum = sangpum;
        this.price = price;
    }

    public void writeShop() {
        System.out.println("상품명: " + sangpum + ", 가격: " + price);
    }
}
