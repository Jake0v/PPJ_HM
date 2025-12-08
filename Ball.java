public class Ball {

    private double radius;
    private int number;
    private static int ballCounter;

    public static Ball makeBall() {
        Ball b = new Ball();
        b.radius = Math.random() * 10 + 10;
        b.ballCounter++;
        b.number = ballCounter;
        return b;
    }

    static void showCounter() {
        System.out.println("U created: " + ballCounter + " balls so far");
    }

    @Override
    public String toString() {
        return "Number: " + number + " Radius: " + radius;
    }
}
