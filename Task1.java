import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the char: ");
        char ch = scanner.next().charAt(0);

        /*
        switch (ch) {
            case 'a', 'o', 'i', 'u', 'e' -> {
                System.out.println("Your char is a vowel");
            }
            default -> {
                System.out.println("Your char is a consonant");
            }
        }
        */

        String result;

        result = switch (ch) {
            case 'a', 'o', 'i', 'u', 'e' -> "Your char is a vowel";
            default -> "Your char is a consonant";
        };
        System.out.println(result);


    }
}
