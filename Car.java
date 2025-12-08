class Car extends Vehicle {
    public Car(String n, int p, double f) {
        super(n, p, f);
    }

    @Override
    public String toString() {
        return super.toString() + "; f c=" + getMpg() + ")";
    }
}