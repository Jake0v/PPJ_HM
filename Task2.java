import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the current month: ");
        int month = sc.nextInt();
        System.out.println("Enter the current year: ");
        int year = sc.nextInt();

        int days = 0;

        switch (month) {
            case 2 -> {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
            }
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
        }

        System.out.println("In the year: " + year + " the month: " + month + " has: " + days);

    }
}
