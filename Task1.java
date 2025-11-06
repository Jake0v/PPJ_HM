import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program displays the arithmetic mean (average) of even numbers in your array");
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
        int count = 0;
        double arithm = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
                count++;
            }
        }

        if (count == 0) {
            System.out.println("There are no even elements in your array");
        } else {
            arithm = sum / count;
            System.out.println("Your arithmetic mean is: " + arithm);
        }


    }
}