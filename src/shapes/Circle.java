package shapes;

public class Circle extends Shape {
    protected double radius;
    public Circle(double radius){
        this.radius = radius;
        this.perimeter = calculatePerimeter();
        this.area = calculateArea();
    }

    private double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    private double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }
}
