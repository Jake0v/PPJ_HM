public class Task4 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {7, 8, 9},
                {4, 5, 6}
        };

        for(int[] row : arr) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        int indx1 = 1;
        int indx2 = 2;

        int[] tempRow = arr[indx2];
        arr[indx2] = arr[indx1];
        arr[indx1] = tempRow;

        for(int[] row : arr) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
