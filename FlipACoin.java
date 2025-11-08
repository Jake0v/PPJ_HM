import java.util.Random;
import java.util.Scanner;

public class FlipACoin {
    public static void main(String[] args) {

        System.out.println("----------------------------");
        System.out.println("Flip a Coin. Gambling game");
        System.out.println("----------------------------");
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Your starting balance in 5000$");
        double balance = 5000;

        System.out.print("Enter your desired target balance in $: ");
        double desBalance = sc.nextDouble();
        sc.nextLine(); // Consume the newline after reading the double

        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("Game starts! Current Balance: $%,.2f | Target: $%,.2f\n", balance, desBalance);
        System.out.println("----------------------------------------------------------------------------");

        //loop
        while (balance > 0 && balance < desBalance) {

            System.out.println();
            System.out.printf("Current Balance: $%,.2f\n", balance);
            System.out.printf("While your desired balance is: $%,.2f \n", desBalance);
            System.out.print("Place your bets in $. All your money lost, or doubled: ");

            if(!sc.hasNextDouble()) {
                System.out.println("Invalid bet amount! You should enter a number.");
                sc.nextLine();
                continue;
            }

            double bets = sc.nextDouble();
            sc.nextLine();

            if (bets <= 0) {
                System.out.println("Invalid bet! You should bet more than 0");
                continue;
            }


            System.out.print("Place your bet on Heads/Tails: ");
            String coinGuess = sc.nextLine().trim();


            if (!coinGuess.equalsIgnoreCase("heads") && !coinGuess.equalsIgnoreCase("tails")) {
                System.out.println("No bets placed, try again, choose heads/tails"); //.equalsIgnoreCase ignores case letters
            } else {

                boolean coinHeads;
                coinHeads = rd.nextBoolean();
                String coinSide;

                if (coinHeads) {
                    coinSide = "heads";
                    System.out.println("The coin flipped Heads!");
                } else {
                    coinSide = "tails";
                    System.out.println("The coin flipped Tails!");
                }

                if (coinGuess.equals(coinSide)) {

                    double winning = bets * 2; //update loop
                    balance += winning;

                    System.out.println("Good job, it's your luck day today \uD83C\uDF40! You won $"+ String.format("%,.2f", winning) + "!");
                    System.out.println(
                            "                                    \n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣄⣀⣀⣠⡴⠶⣄⠀⢀⣤⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣄⠀⠹⠤⠃⠀⡏⠉⠉⠳⢾⡿⣻⡆⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⡀⠀⠀⠀⠇⠀⠀⠀⣠⠞⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣴⡀⡀⠀⣴⣆⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣷⣷⣷⣶⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⣿⡿⢻⣿⢻⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠏⠜⠀⠈⢉⣿⡟⢿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡞⠁⠀⠀⠀⠀⠀⠉⠁⠈⢻⠳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⢀⣤⣄⠀⠀⠀⠀⠣⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⣰⠟⠀⠀⠀⠀⠀⠀⣿⣿⣿⠀⠀⠀⠀⠀⠰⠂⠙⣦⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⢀⡾⠁⠀⠀⠀⠀⣀⣴⣾⣿⣿⣿⣿⣶⣤⡀⠀⠀⠐⣂⠈⢳⡄⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⣠⠟⠀⠀⠀⠀⠀⣴⣿⣿⡿⣿⣿⣿⠿⣿⣿⣿⣆⠀⠀⠰⢒⠵⢻⣆⠀⠀⠀\n" +
                            "⠀⠀⣰⠏⠀⠀⠀⠀⠀⠀⣿⣿⣿⠀⣿⣿⣿⠀⠈⢿⣿⣿⠄⠀⠀⠄⢊⡡⠜⣦⠀⠀\n" +
                            "⠀⢠⡏⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣷⣿⣿⣿⠀⠀⠈⠙⠉⠀⠀⠀⢒⡡⠔⣋⠼⡇⠀\n" +
                            "⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⣷⣶⣄⠀⠀⠀⠀⠀⠐⣈⠤⠒⢻⡄\n" +
                            "⢀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣟⠛⢿⣿⣿⣷⠀⠀⠀⠐⣉⠤⠒⣉⠬⣇\n" +
                            "⢸⠇⢀⠀⠀⠀⠀⠀⠀⣠⣤⡀⠀⠀⣿⣿⣿⠀⠀⣹⣿⣿⡇⠀⠀⡈⠤⠒⣉⠤⠀⣿\n" +
                            "⢸⠀⠘⣆⡀⠀⠀⠀⠀⢿⣿⣿⣄⠀⣿⣿⣿⢀⣴⣿⣿⡿⠀⠀⠀⠤⠒⣉⠤⠒⠀⡿\n" +
                            "⢸⡆⢰⡆⠁⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠀⠀⠀⠠⢒⣉⠤⠒⠁⣸⠃\n" +
                            "⠀⢳⡀⠙⠒⢷⣀⠀⠀⠀⠀⠈⠛⠻⣿⣿⣿⠛⠉⠀⠀⠀⠀⠐⢊⣁⠤⠒⠋⣠⠏⠀\n" +
                            "⠀⠀⠳⣤⣧⡀⠸⡀⠀⠀⠀⠀⠀⠀⠻⣿⠟⠀⠀⠀⠀⠀⠔⣊⡡⠤⠒⢉⡴⠋⠀⠀\n" +
                            "⠀⠀⠀⠀⠙⠳⠦⣌⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣁⣤⣴⡾⠟⠋⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠒⠒⠶⠦⠤⠤⠤⠴⠶⠒⠒⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀");

                    System.out.println();
                    System.out.println("You can't just skip your lucky day, let's go another round!");

                } else {

                    balance -= bets; //update loop

                    System.out.println("Well, well, well, it seems like someone gambled all his money on the wrong side" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡒⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡖⠁⣸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⠈⢳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡄⠀⢹⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡿⠀⠀⢠⡗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⢻⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠁⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠈⣯⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡞⠀⠀⠀⠈⢻⡀⠀⠀⠀⠀⠀⣀⣤⡴⠶⠞⠛⠛⠛⠛⠛⠻⠶⢶⣤⣀⠀⠀⠀⠀⠀⠀⣿⠃⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠘⣷⡀⠀⣀⡴⢛⡉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⡛⢦⣄⠀⠀⣼⠇⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⢰⡀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠈⠳⣾⣭⢤⣄⠘⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⢀⡤⣈⣷⠞⠃⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⡄⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⢸⢷⡀⠀⠈⣿⠀⠀⠀⠀⠀⠀⠀⠀⠈⢉⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡍⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠃⠀⠀⡜⡇⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠈⣇⠱⣄⠀⠸⣧⠀⠀⠀⠀⠀⠄⣀⣀⣼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢷⣀⣀⠠⠀⠀⠀⠀⠀⣰⠇⠀⢀⠞⢰⠃⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⢿⠀⠈⢦⡀⠘⢷⣄⠀⢀⣀⡀⣀⡼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⣀⣀⡀⢀⠀⣠⡼⠋⢀⡴⠁⠀⣹⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠸⡄⠑⡀⠉⠢⣀⣿⠛⠒⠛⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠛⠒⠋⢻⣀⠴⠋⢀⠄⢀⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⢣⠀⠈⠲⢄⣸⡇⠀⠀⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢔⠀⠀⠀⠘⣏⣀⠔⠁⠂⡸⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⠀⠉⢻⡄⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡾⠋⠀⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢶⠀⠀⠀⢀⡿⠀⠤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠤⠀⢾⡀⠀⠀⠀⡴⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⡀⣸⠇⠀⠀⠀⠈⠹⡑⠲⠤⣀⡀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⣀⡤⠖⢊⠍⠃⠀⠀⠀⠘⣧⢀⡤⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⣿⠀⠀⠀⠀⠀⠀⠈⠒⢤⠤⠙⠗⠦⠼⠀⠀⠀⠠⠴⠺⠟⠤⡤⠔⠁⠀⠀⠀⠀⠀⠀⢸⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳⣄⠀⠀⡑⢯⡁⠀⠀⠀⠀⠀⠇⠀⠀⠀⠰⠀⠀⠀⠀⠀⢈⡩⢋⠀⠀⢠⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡆⠀⠈⠀⠻⢦⠀⠀⠀⡰⠀⠀⠀⠀⠀⢇⠀⠀⠀⡠⡛⠀⠁⠀⢰⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣇⠀⠀⠀⠀⢡⠑⠤⣀⠈⢢⠀⠀⠀⡴⠃⣀⠤⠊⡄⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢶⣄⠀⠀⠀⠳⠀⢀⠉⠙⢳⠀⡜⠉⠁⡀⠀⠼⠀⠀⠀⣠⡴⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣦⠀⠘⣆⠐⠐⠌⠂⠚⠀⠡⠊⠀⢠⠃⠀⣠⠞⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣧⠠⠈⠢⣄⡀⠀⠀⠀⢀⣀⠴⠃⠀⣴⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⡁⠐⠀⠈⠉⠁⠈⠁⠀⠒⢀⡴⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣦⠀⠀⠀⠀⠀⠀⠀⣰⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢧⣄⣀⣀⣀⣀⣼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

                    System.out.println();
                    System.out.println("Come on, you know that you are about to hit your lucky streak. Let's go another round!");
                }

            }

        } //loop while

        System.out.println("\n-------------------------------------");
        if (balance <= 0) {
            System.out.printf("GAME OVER! YOU RAN OUT OF MONEY. YOU OWE US: $%,.2f \n", balance);
        } else {
            System.out.printf("WHAT? YOU WON? IMPOSSIBLE... well, nothing I can do... here's your money: $%,.2 \n", balance, "AND BE SURE TO COME BACK, YOU HEAR ME!");
        }
        System.out.println("Final Balance: $" + String.format("%,.2f", balance));
        System.out.println("-------------------------------------");

        sc.close();
    }
}
