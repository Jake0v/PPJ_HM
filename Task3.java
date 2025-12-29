public class Task3 {
    static int[][] convTo0(int[][] arr) {

        int n = arr.length;
        int rows = n;
        int cols = arr[0].length;

        boolean[] arrI = new boolean[rows];
        boolean[] arrJ = new boolean[cols];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < cols; j++) {

                if (arr[i][j] == 0) {
                    arrI[i] = true;
                    arrJ[j] = true;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cols; j++) {

                if (arrI[i] || arrJ[j]) {
                    arr[i][j] = 0;
                }

            }
        }

        return arr;
    }
}
