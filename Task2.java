import java.util.Arrays;

public class Task2 {
    public static void main (String[] args) {
        int[] a = {1, 4, 5, 7, 9, 10};
        for (int i = a[0]; i <= a[a.length - 1]; ++i)
            System.out.printf("what=%2d ind=%2d%n",
                    i, binSearchRec(a, i, 0, a.length - 1));

        System.out.println("**************");

        int[] b = {-1, 1, 3, 4, 6};
        for (int i = b[0]; i <= b[b.length - 1]; ++i)
            System.out.printf("what=%2d ind=%2d%n",
                    i, binSearchRec(b, i, 0, b.length - 1));
    }

    public static int binSearchRec (int[] a, int what, int from, int to) {

        if (from > to) {
            return - 1;
        }

        int middle = (from + to) / 2;

        if (a[middle] == what) {
            return middle;
        }

        if (a[middle] > what) {
            return binSearchRec(a, what, from, middle - 1);
        } else {
            return binSearchRec(a, what, middle + 1, to);
        }



    }
}