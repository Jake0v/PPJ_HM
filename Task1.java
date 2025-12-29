public class Task1 {
    static int[] diags(int[][] arr) {

        if (arr == null || arr.length != arr[0].length) {
            throw new IllegalArgumentException("Not a square array");
        }

        int n = arr.length;

        int size = (n % 2 == 0) ? (2 * n) : (2 * n - 1);

        int[] result = new int[size];
        int k = 0;

        for(int i = 0; i < n; i++) {
            result[k++] = arr[i][i];

            int antiDiag = n - 1 - i;

            if (i != antiDiag) {
                result[k++] = arr[i][antiDiag];
            }
        }
        return result;
    }
}
