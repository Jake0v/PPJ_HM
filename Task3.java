import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Vehicle[] vs = {
                new Car("Toyota", 25000, 50.5),
                new Bicycle("Pinarello", 1800),
                new Car("Ford", 21000, 55.1),
                new Bicycle("Canyon", 1600)
        };

        Vehicle.sort(vs);

        String output = Arrays.toString(vs)
                .replaceAll(", ", "\n");

        System.out.println(output);
    }
}