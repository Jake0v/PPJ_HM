import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] alphabet = new char[26];

        System.out.print("Enter the number to make an alphabetic pyramid: ");
        int n = sc.nextInt();

        // Part 1 counting from top to middle:
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                alphabet[j] = (char)('a' + j);
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        // Part 2 counting from middle to bottom:
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }


    }
}
