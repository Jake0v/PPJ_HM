public class CalculatingDevice {

    private String name;

    public CalculatingDevice(String name) {
        this.name = name;
    }

    public String calculate(double x, double y) {
        double sum = x + y;

        return name + ": " + x + "+" + y + "=" + sum;
    }

    public static void printRes(CalculatingDevice[] arr, double x, double y) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].calculate(x, y));
        }
    }
}
