public class Task1 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Ball.makeBall());
        }
        System.out.println();
        Ball.showCounter();
    }
}