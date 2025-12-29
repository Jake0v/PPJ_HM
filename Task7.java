public class Task7 {

    public void findSaddlePoint(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i][0];
            int colIndex = 0;

            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    colIndex = j;
                }
            }

            boolean isSaddle = true;

            for (int k = 0; k < arr.length; k++) {

                if (arr[k][colIndex] > min) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle Point found: " + min);
            }
        }
    }
}