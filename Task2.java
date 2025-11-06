import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program finds the array element closest to the arithmetic mean");
        System.out.println();
        System.out.print("Type how many numbers do you want an array to have: ");
        int size = sc.nextInt();
        System.out.println();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter array number: ");
            arr[i] = sc.nextInt();
        }

        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double mean = sum / size;
        int closestNum = arr[0];
        double minDifference = Math.abs(arr[0] - mean);



        for (int i = 1; i < arr.length; i++) {
            double currentDiff = Math.abs(arr[i] - mean);
            if (currentDiff < minDifference) {
                minDifference = currentDiff;
                closestNum = arr[i];
            }
        }

        System.out.println("The element in array closest to the arithmetic difference of it is: " + closestNum + " and the difference is: " + minDifference);

    }
}