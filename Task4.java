public class Task4 {

    public int[][] sortArr(int[][] arr) {

        int temp = 0;
        int col = arr[0].length;
        int row = arr.length;

        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row - 1; j++) {
                for(int k = 0; k < row - 1 - j; k++) {
                    if (arr[k][i] < arr[k + 1][i]) {
                        temp = arr[k][i];
                        arr[k][i] = arr[k + 1][i];
                        arr[k + 1][i] = temp;
                    }
                }
            }
        }
        return arr;
    }
}
