public class Task3 {
    public static void main(String[] args) {

        int rows = 5;
        int cols = 8;

        int[][] recArr = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                recArr[i][j] = (int)(Math.random() * 100);
            }
        }

        int sum = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum += recArr[i][j];
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(recArr[i][j] + "\t");
            }
            System.out.println();
        }

        double mean = (double) sum / (rows * cols);
        System.out.println("Mean: " + mean);


        double closeToMean = recArr[0][0];
        double minDif = Math.abs(mean - closeToMean);

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                double currentDif = Math.abs(mean - recArr[i][j]);

                if (currentDif < minDif) {
                    minDif = currentDif;
                    closeToMean = recArr[i][j];
                }

            }
        }

        System.out.println("Closest element to mean is: " + closeToMean);


    }
}
