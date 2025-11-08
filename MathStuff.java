import java.util.Scanner;

public class MathStuff {
    public static void main(String[] args) {

        /*
        double result;

        result = Math.pow(2, 3); //...to the power of...
        result = Math.abs(-5); //absolute power of...
        result = Math.sqrt(9); //square root of...
        result = Math.round(3.49); //round to 3.0
        result = Math.ceil(3.01); //round up to 4.0
        result = Math.floor(3.99); //round down to 3.0
        result = Math.max(10, 20); // max number from 10 to 20
        result = Math.min(10, 20); // min number from 10 to 20

        System.out.println(result);
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("This program finds the hypotenuse of the triangle");
        System.out.println();
        System.out.print("Type in the first side A: ");
        double a = sc.nextInt();
        System.out.print("Type in the first side B: ");
        double b = sc.nextInt();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("The hypotenuse of your triangle is: %.1fcm\n", + c);




    }
}
