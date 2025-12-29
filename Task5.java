public class Task5 {

    public int[] oneLineArr(int[][] arr) {

        int c = 0;
        int col = arr[0].length;
        int row = arr.length;
        int size = col * row;
        int[] newArr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newArr[c++] = arr[i][j];
            }
        }

        return newArr;
    }
}
