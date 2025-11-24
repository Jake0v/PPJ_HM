public class Task2 {
    public static void main(String[] args) {

        //size 8*8
        int size = 8;
        int[][] squareArr = new int[size][size];

        // fill with numbers
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                squareArr[i][j] = (int)(Math.random() * 100);
            }
        }

        //Calculate sums
        int sumDiag = 0;
        int sumAntiDiag = 0;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(i == j) {
                    sumDiag += squareArr[i][j];
                }

                if(i + j == size - 1) {
                    sumAntiDiag += squareArr[i][j];
                }
            }
        }

        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(squareArr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("The antidiagonal sum is: " + sumAntiDiag);
        System.out.println("The diagonal sum is: " + sumDiag);

    }
}
