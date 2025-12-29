public class Task2 {
    static int[][] rotate(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;
        int[][] res = new int[cols][rows];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; i++) {
                res[j][rows - i - 1] = arr[i][j];
            }
        }
        return res;
    }
}
