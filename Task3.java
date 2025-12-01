import java.util.Arrays;

public class Task3 {
    public static void main (String[] args) {
        System.out.println("Wait...");
        System.out.println(FuncStat.fiboR(45));
        System.out.println(FuncStat.fiboI(45));

        int[] a = {3, 8, 2, 9, 7, 4};

        System.out.println("Max : " + FuncStat.maxElem(a, 0));
        System.out.println("Num even: " + FuncStat.numEven(a, 0));
        System.out.println("Before: " + Arrays.toString(a));

        FuncStat.reverse(a, 0);

        System.out.println("After : " + Arrays.toString(a));
    }

    public class FuncStat {

        public static int fiboR(int n) {
            // top part
            if (n == 1 || n == 0) {
                return n;
            }

            //bottom part
            int sum = fiboR(n-1) + fiboR(n-2);
            return sum;
        }


        public static int fiboI(int n) {

            if (n == 1 || n == 0) {
                return n;
            }

            int sum = 0;
            int var1 = 0;
            int var2 = 1;

            for (int i = 2; i <= n; i++) {
                sum = var1 + var2;
                var1 = var2;
                var2 = sum;
            }

            return var2;

        }

        public static int maxElem(int[] arr, int from) {

            if (from == arr.length - 1) {
                return arr[from];
            }

            int nextNum = maxElem(arr, from + 1);

            if (arr[from] < nextNum) {
                return nextNum;
            } else {
                return arr[from];
            }
        }

        public static int numEven(int[] arr, int from) {

            if (from == arr.length) {
                return 0;
            }

            int nextEven = numEven(arr, from+1); // continues until zero

            // the if starts when nextEven is = 0 (when return 0 happens)
            if (arr[from] % 2 == 0) {
                return nextEven + 1;
            } else {
                return nextEven;
            }

        }

        public static void reverse(int[] arr, int from) {

        int partnerInd = arr.length-1 - from;

        if (from >= partnerInd) {
            return;
        }

        int temp = arr[from];
        arr[from] = arr[partnerInd];
        arr[partnerInd] = temp;

        reverse(arr, from+1);

        }
    }

}