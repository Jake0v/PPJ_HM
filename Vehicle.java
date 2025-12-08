class Vehicle implements Comparable<Vehicle> {

    private String name;
    private int price;
    private double mpg;

    public Vehicle(String n, int p, double f) {
        this.name = n;
        this.price = p;
        this.mpg = f;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name + " ($" + price;
    }

    public String getName() {
        if (this.getClass() == Vehicle.class) {
            throw new UnsupportedOperationException();
        } else {
            return this.name;
        }
    }

    public int getPrice() {
        if (this.getClass() == Vehicle.class) {
            throw new UnsupportedOperationException();
        } else {
            return this.price;
        }
    }

    public double getMpg() {
        if (this.getClass() == Bicycle.class || this.getClass() == Vehicle.class) {
            throw new UnsupportedOperationException();
        } else {
            return this.mpg;
        }
    }

    public int compareTo(Vehicle v) {
        if (v instanceof Bicycle && this instanceof Car) {
            return 1;
        } else if (this instanceof Bicycle && v instanceof Car) {
            return -1;
        }

        if (this.getClass() == Car.class) {
            return Double.compare(v.mpg, this.mpg);

        } else if (this.getClass() == Bicycle.class) {
            return this.price - v.price;
        }

        return 0;
    }

    public static void sort(Vehicle[] vs) {
        java.util.Arrays.sort(vs);
    }
}