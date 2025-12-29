public class Task1 {

    int[] flatten(int[][] matrix) {

        int countME = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                countME++;
            }
        }

        int[] result = new int[countME];
        int k = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                result[k++] = matrix[i][j];
            }
        }


        return result;
    }
}
