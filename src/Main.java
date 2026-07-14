public class Main {

    public static void main(String[] args) {

        Product apple = new Product();
        apple.name = "사과";
        apple.price = 1000;
        apple.stock = 5;


        Product banana = new Product();
        banana.name = "바나나";
        banana.price = 500;
        banana.stock = 3;



        apple.sell(3);
        apple.sell(3);
        apple.restock(10);
        banana.sell(1);

        System.out.println(apple.name + " 재고 총 가치: " + apple.stockValue() + "원");
        System.out.println(banana.name + " 재고 총 가치: " + banana.stockValue() + "원");
    }

    static class Product {

        String name;
        int price;
        int stock;

        void restock(int quantity) {
            stock += quantity;
            System.out.println(name + " " + quantity + "개 입고 완료, 현재 재고: " + stock);
        }

        void sell(int quantity) {
            if (stock >= quantity) {
                stock -= quantity;
                System.out.println(name + " " + quantity + "개 판매 성공, 남은 재고: " + stock);
            } else {
                System.out.println(name + " 판매 실패, 재고 부족 (현재 재고: " + stock + ")");
            }
        }

        int stockValue() {
            return price * stock;
        }
    }
}