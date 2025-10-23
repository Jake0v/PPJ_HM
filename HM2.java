public class HM2 {

    static int extractorLSB(int n) {
        return (n & 0xFF);
    }

    public static void main(String[] args) {

    /* Bitwise operators
    & - AND (multiplication)
    | - OR (addition)
    ^ - XOR (similar numbers = 1)
    << - LEFT SHIFT (shift the hole number to the left side)
    >> - RIGHT SHIFT (shift the hole number to the right side)
     */
        int n = -1;
        int k = extractorLSB(n);
        System.out.println("Input n: " + n);
        System.out.println("Calculated k: " + k);
        System.out.println("Verification, k = 255: " + (k == 255));

    }
}