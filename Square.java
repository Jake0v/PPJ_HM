public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public Circle getInscribedCircle() {
        double radius = (side * Math.sqrt(2)) / 2.0;
        return new Circle(radius);
    }

    public Circle getCircumscribedCircle() {
        double radius = side / 2.0;
        return new Circle(radius);
    }

    // Constructor
    public Square(Circle c) {
        double circleArea = Math.PI * c.getCRadius() * c.getCRadius();
        this.side = Math.sqrt(circleArea);
    }

    public static Circle[] getCircles(Square[] arr) {
        Circle[] arrOfCi = new Circle[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrOfCi[i] = new Circle(arr[i]);
        }

        return arrOfCi;
    }

    @Override
    public String toString() {
        return "Square: ["+ side +"]";
    }

}