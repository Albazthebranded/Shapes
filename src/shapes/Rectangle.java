package shapes;

public class Rectangle extends Shape {
    protected double sideA;
    protected double sideB;
    protected double angleA;
    protected double angleB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.perimeter = calculatePerimeter();
        this.area = calculateArea();
    }

    private double calculateArea() {
        return this.sideA * this.sideB;
    }

    private double calculatePerimeter() {
        return 2 * (this.sideA + this.sideB);
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }
}
