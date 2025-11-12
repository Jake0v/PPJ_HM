import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type in the size of your array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int numInArr = 0;

        for (int i = 0; i < size; i++) {
            numInArr++;
            System.out.print("Type number " + numInArr + " in your array: ");
            arr[i] = sc.nextInt();
        }


        int a;
        int b;

        for (int i = 0; i < size; i++) {
            a = arr[i];
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    continue;
                }

                b = arr[j];

                if (a != 0 && b % a == 0) {
                    System.out.println("Pairs: " + a + ", " + b);
                } else if (b != 0 && a % b == 0) {
                    System.out.println("Pairs: " + a + ", " + b);
                }
            }
        }


    }
}
