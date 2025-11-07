import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("This program does a lot of stuff");
        System.out.println();
        System.out.print("Print the number of the elements you want to have in your array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sentenceNum = 0;

        for (int i = 0; i < size; i++) {
            sentenceNum++;
            System.out.print("Print the number " + sentenceNum + " in your array: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\n");
        System.out.println("Prints array numbers in one line with comas except for the last digit: ");
        for (int i = 0; i < size; i++) {

            System.out.print(arr[i]); // Or simply System.out.print(arr[i] + (i < size - 1 ? ", " : ""));

            if (i < size - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Shows the index of max and min in the array, excluding 0 (I did it for more understandable read): ");
        int maxIn = 0;
        int minIn = 0;

        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[maxIn]) {
                maxIn = i;
            } else if (arr[i] < arr[minIn]) {
                minIn = i;
            }
        }

        System.out.println();
        System.out.println((maxIn + 1) + " is max index without zero in the start, the number assigned to it is: " + arr[maxIn]);
        System.out.println((minIn + 1) + " is min index without zero in the start, the number assigned to it is: " + arr[minIn]);

        //Swaps the numbers under max and min indexes
        int inMask = arr[maxIn];
        arr[maxIn] = arr[minIn];
        arr[minIn] = inMask;

        System.out.println("\n");
        System.out.println();
        System.out.println("Prints an array with swapped numbers: ");
        for (int i = 0; i < size; i++) {

            System.out.print(arr[i]);

            if (i < size - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\n");
        System.out.println();
        System.out.println("Prints a reversed array: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }

    }
}
