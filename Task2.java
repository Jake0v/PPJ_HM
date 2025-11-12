import java.util.Scanner;

public class Task2 {
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
        System.out.println();

        System.out.println("Original array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + (i < size - 1 ? ", " : " "));
        }
        System.out.println();

        int count = 0;
        int startInt = 0;
        int mask = arr[startInt];

        System.out.println();
        System.out.println("Even elements appear before odd one's + the number of even elements: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[startInt];
                arr[startInt] = arr[i];
                arr[i] = temp;
                count++;
                startInt++;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + (i < size - 1 ? ", " : " "));
        }
        System.out.print(" Number of even numbers: " + count);
        System.out.println();

    }
}
