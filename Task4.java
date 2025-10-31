import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        double[] arr = new double[10];


        for (int i = 0; i < arr.length; i++) {
            arr[i]  = Math.random() * 100;
        }

        System.out.println("The string of array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("\n");
        System.out.println("All even numbered arrays are: ");

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("\n");
        System.out.println("All odd numbers arrays in reverse order are: ");

        for (int i = arr.length; i >= 0; i--) {
            if  (i % 2 == 1) {
                System.out.println(arr[i - 1]);
            }
        }


    }
}