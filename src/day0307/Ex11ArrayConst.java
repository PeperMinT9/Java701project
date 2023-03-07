package day0307;

class  MyShop {
    private String sangpum;
    private int su;
    private int dan;
    
    MyShop() {
        this("사과", 1, 2000);
    }
    MyShop(String sangpum, int su) {
        this(sangpum, su, 1000);
    }
    MyShop(String sangpum, int su, int dan) {
        this.sangpum = sangpum;
        this.su = su;
        this.dan = dan;
    }
    
    public void setSangpum(String sangpum) {
        this.sangpum = sangpum;
    }
    public void setSu(int su) {
        this.su = su;
    }
    public void setDan(int dan) {
        this.dan = dan;
    }

    public void writeMyShop() {
        System.out.println("상품이름: " + sangpum + " 수량: " + su + "가격: " + dan);
    }
}

public class Ex11ArrayConst {
    public static void main(String[] args) {
        MyShop[] my = new MyShop[4];
        my[0] = new MyShop();
        my[1] = new MyShop("딸기우유", 2, 1000);
        my[2] = new MyShop("눈깔사탕", 5);
        my[3] = new MyShop("초콜렛", 4, 1200);

        System.out.println("** MyShop 초기값 출력 **");
        for(MyShop s: my) {
            s.writeMyShop();
        }

        System.out.println("** 0번지 데이터 수정 **");
        my[0].setSangpum("참외");
        my[0].setSu(3);
        my[0].setDan(3500);
        for(MyShop s: my) {
            s.writeMyShop();
        }
    }
}
