import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        boolean[] rand =  new boolean[10];

        for (int i = 0; i < rand.length; i++) {
            rand[i] = Math.random() > 0.5;
        }

        for (int i = 0; i < rand.length; i++) {
            System.out.println(rand[i]);
        }

        System.out.println();
        System.out.println("How many true arrays the value contains: ");

        int count = 0;
        for (int i = 0; i < rand.length; i++) {
            if (rand[i]) {
                count++;
            }
        }

        System.out.println("The true count is: " + count);
        System.out.println();
        System.out.println("The array containing all true values: ");

        for  (int i = 0; i < rand.length; i++) {
            if (rand[i]) {
                System.out.println(rand[i]);
            }
        }

    }
}
