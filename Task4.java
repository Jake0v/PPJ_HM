import java.util.Scanner;

public class Task4 {
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

        int currentNum;
        int comCount = 0;
        boolean isRepetitive = false;

        for (int i = 0; i < size; i++) {
            currentNum = arr[i];
            isRepetitive = false;

            for (int j = 0; j < i; j++) {
                if (currentNum == arr[j]) {
                    isRepetitive = true;
                    break;
                }
            }

            if (isRepetitive == false) {
                comCount++;
                System.out.println("Unique element " + comCount + " is: " + currentNum);
            }
        }

        System.out.println("There are " + comCount + " unique numbers");
    }
}