import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        Child[] arr = new Child[3];
        for(int i = 0; i < arr.length; i++) {
            counter++;
            System.out.println("Enter your " + counter + " child's name: " );
            String storeName = sc.nextLine();
            arr[i] = new Child(storeName);
        }

        System.out.println("Entering the name of the 'giver' starting with 'q' terminates the program");

        while(true) {
            System.out.print("Enter names of 'giver' and 'receiver': ");
            String giverName = sc.next();

            if (giverName.startsWith("q")) {
                break;
            }

            String receiverName = sc.next();

            Child giver = Child.getChildByName(arr, giverName);
            Child receiver = Child.getChildByName(arr, receiverName);

            if (giver == null) {
                System.out.println("No child with name: " + giverName);
            } else if (receiver == null) {
                System.out.println("No child with name: " + receiverName);
            } else {
                //Firstly, making the trade:
                giver.givesCandieTo(receiver);

                //Secondly, printing status:
                Child.printChildren(arr);
            }

        }

    }
}
