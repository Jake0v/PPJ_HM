public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
        this(1);
    }

    @Override
    public String toString() {
       return "Square [" + side + "]";
    }

    public double getSide() {
        return this.side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }

    public double getDiagonal() {
        return this.side * Math.sqrt(2);
    }

    public Square getDoubled() {
        return new Square(this.side * 2);
    }

    public static double getTotalArea(Square[] sqs) {

        double sum = 0;

        for(int i = 0; i < sqs.length; i++) {
            sum += sqs[i].getArea();
        }

        return sum;
    }

    public static Square getMax(Square[] sqs) {

        Square max = sqs[0];

        for (int i = 1; i < sqs.length; i++) {
            if (max.getSide() < sqs[i].getSide()) {
                max = sqs[i];
            }
        }

        return max;
    }


}
