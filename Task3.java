import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program counts how many sets of three consecutive numbers are either strictly increasing or strictly decreasing");
        System.out.println();
        System.out.print("Type how many numbers do you want an array to have: ");
        int size = sc.nextInt();
        System.out.println();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter array number: ");
            arr[i] = sc.nextInt();
        }

        int sequenceCount = 0;

        for (int i = 0; i < size - 2; i++) {
            int a = arr[i];
            int b = arr[i + 1];
            int c = arr[i + 2];
            if (a > b && b > c) {
                sequenceCount++;
                System.out.println("The three consecutive decreasing numbers are: " + a + ", " + b + ", " + c);
            } else if (a < b && b < c) {
                System.out.println("The three consecutive increasing numbers are: " + a + ", " + b + ", " + c);
                sequenceCount++;
            }
        }

        System.out.println("The number of three numbered consecutive groups is: " + sequenceCount);

    }
}