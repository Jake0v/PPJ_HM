public class Task5 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 3, 2},
                {3, 4, 8},
                {2, 6, 8},
                {1, 8, 5}
        };

        for (int[] rows : arr) {
            for (int num : rows) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        int maxRowSum = 0; // let it be the first row
        int maxRowIndex = 0; // print out
        int currRowSum = 0; // checking if we need to change maxRowSum

        for (int j = 0; j < arr[0].length; j++) {
            maxRowSum += arr[0][j];
        }

        for (int i = 0; i < arr.length; i++) {
            currRowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                currRowSum += arr[i][j];
            }
            if (currRowSum > maxRowSum) {
                maxRowSum = currRowSum;
                maxRowIndex = i;
            }
        }

        System.out.println("Max row index: " + maxRowIndex);
        System.out.println();

        int minColIndex = 0;
        int minColSum = 0;
        int currColSum = 0;

        for(int i = 0; i < arr.length; i++) {
            minColSum += arr[i][0];
        }

        for(int i = 0; i < arr[0].length; i++) {
            currColSum = 0;
            for(int j = 0; j < arr.length; j++) {
                currColSum += arr[j][i];
            }
            if (currColSum < minColSum) {
                minColSum = currColSum;
                minColIndex = i;
            }
        }

        System.out.println("Min col index is: " + minColIndex);

    }
}
