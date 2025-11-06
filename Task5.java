import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program makes a histogram out of your array");
        System.out.println();
        System.out.print("Type how many numbers do you want an array to have: ");
        int size = sc.nextInt();
        System.out.println();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter array number: ");
            arr[i] = sc.nextInt();
        }

        int maxH = arr[0];
        int minH = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > maxH) {
                maxH = arr[i];
            } else if (arr[i] < minH) {
                minH = arr[i];
            }
        }

        //Outer loop
        for (int i = maxH; i > 0; i--) {

            //Inner loop
            for (int n = 0; n < size; n++) {
                if (arr[n] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }


    }
}