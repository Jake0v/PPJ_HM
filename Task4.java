import java.util.Scanner;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program says distinct numbers in your array");
        System.out.println();
        System.out.print("Type how many numbers do you want an array to have: ");
        int size = sc.nextInt();
        System.out.println();
        if (size >= 2) {

            int[] n = new int[size];;

            for (int i = 0; i < size; i++) {
                System.out.print("Enter array number: ");
                n[i] = sc.nextInt();
            }

            Arrays.sort(n);
            //System.out.println(Arrays.toString(n));

            int count = 1;
            System.out.println("Your distinct number " + count + " is: " + n[0]);

            for (int i = 1; i < size ; i++) {
                if (n[i] != n[i - 1]) {
                    count++;
                    System.out.println("Your distinct number " + count + " is: " + n[i]);
                }
            }

            System.out.println("The number of distinct numbers in your array is: " + count);


        } else {
            System.out.println("The array must contain 2 ot more numbers");
        }
    }
}