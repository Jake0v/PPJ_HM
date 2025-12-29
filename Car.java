import java.util.Random;

public class Car {

    Random rd = new Random();

    private int fuel = 35;
    private int km = 0;

    public void fill() {
        if (rd.nextInt(100) < 10) {
            throw new Explosion("BOOM!");
        }

        fuel += rd.nextInt(15, 36);
        System.err.println("Current fuel level: " + fuel);
    }

    public void drive100km() throws NotEnoughGas {
        if (fuel < 10) {
            throw new NotEnoughGas("Too low on fuel, refill it");
        }
        fuel -= 10;
        km += 100;
        System.err.println(km + "km driven, " + fuel + " liters left");
    }
}
