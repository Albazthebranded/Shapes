package shapes;

public abstract class Shapes {

    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double angleA;
    protected double angleB;
    protected double angleC;
    protected double perimeter;
    protected double semiPerimeter;
    protected double area;

    public double getPerimeter(){
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
