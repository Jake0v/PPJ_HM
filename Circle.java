public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCRadius() {
        return radius;
    }

    public double getCArea() {
        return Math.PI * radius * radius;
    }

    public double getCPerimeter() {
        return 2 * Math.PI * radius;
    }

    public Square getInscribedSquare() {
        double side = radius * Math.sqrt(2);
        return new Square(side);
    }

    public Square getCircumscribedSquare() {
        double side = 2 * radius;
        return new Square(side);
    }

    // Constructor
    public Circle(Square s) {
        double squareArea = s.getSide() * s.getSide();
        this.radius = Math.sqrt(squareArea / Math.PI);
    }

    public static Square[] getSquares(Circle[] arr) {

        Square[] arrOfSq = new Square[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrOfSq[i] = new Square(arr[i]);
        }

        return arrOfSq;
    }

    @Override
    public String toString() {
        return "Circle: ["+ radius +"]";
    }

}