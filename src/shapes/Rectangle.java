package shapes;

public class Rectangle extends Shapes {

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.perimeter = 2 * (this.sideA + this.sideB);
        this.area = this.sideA * this.sideB;

    }
}
