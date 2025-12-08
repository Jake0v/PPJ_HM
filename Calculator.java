public class Calculator extends CalculatingDevice {

    public Calculator(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        double sub = x - y;
        return super.calculate(x, y) + "; " + x + "-" + y + "=" + sub;
    }
}
