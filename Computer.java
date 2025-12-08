public class Computer extends Calculator {

    public Computer(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        double mul = x * y;
        double div = x / y;

        return super.calculate(x, y) + "; " + x + "*" + y + "=" + mul + "; " + x + "/" + y + "=" + div;
    }
}
