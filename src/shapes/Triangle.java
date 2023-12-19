package shapes;

public class Triangle extends Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double angleA;
    protected double angleB;
    protected double angleC;
    protected double semiPerimeter;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.angleA = calculateAngleA();
        this.angleB = calculateAngleB();
        this.angleC = calculateAngleC();
        this.perimeter = calculatePerimeter();
        this.semiPerimeter = this.perimeter / 2;
        this.area = calculateArea();
    }
    private double calculateArea() {
        return Math.sqrt((this.semiPerimeter * (this.semiPerimeter - this.sideA) * (this.semiPerimeter - this.sideB) * (this.semiPerimeter - this.sideC)));
    }

    private double calculatePerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    private double calculateAngleA() {
        return Math.toDegrees(Math.acos((((Math.pow(this.sideB, 2)) + (Math.pow(this.sideC, 2)) - (Math.pow(this.sideA, 2))) / (2 * this.sideB * this.sideC))));
    }

    private double calculateAngleB() {
        return Math.toDegrees(Math.acos((((Math.pow(this.sideA, 2)) + (Math.pow(this.sideC, 2)) - (Math.pow(this.sideB, 2))) / (2 * this.sideA * this.sideC))));
    }

    private double calculateAngleC() {
        return Math.toDegrees(Math.acos((((Math.pow(this.sideA, 2)) + (Math.pow(this.sideB, 2)) - (Math.pow(this.sideC, 2))) / (2 * this.sideA * this.sideB))));
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }
    public double getAngleA() {
        return this.angleA;
    }

    public double getAngleB() {
        return this.angleB;
    }

    public double getAngleC() {
        return this.angleC;
    }
}
