package shapes;

public class Triangle extends Shapes {

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.angleA = Math.toDegrees(Math.acos((((Math.pow(this.sideB, 2)) + (Math.pow(this.sideC, 2)) - (Math.pow(this.sideA, 2))) / (2 * this.sideB * this.sideC))));
        this.angleB = Math.toDegrees(Math.acos((((Math.pow(this.sideA, 2)) + (Math.pow(this.sideC, 2)) - (Math.pow(this.sideB, 2))) / (2 * this.sideA * this.sideC))));
        this.angleC = Math.toDegrees(Math.acos((((Math.pow(this.sideA, 2)) + (Math.pow(this.sideB, 2)) - (Math.pow(this.sideC, 2))) / (2 * this.sideA * this.sideB))));
        this.perimeter = this.sideA + this.sideB + this.sideC;
        this.semiPerimeter = this.perimeter / 2;
        this.area = Math.sqrt((this.semiPerimeter * (this.semiPerimeter - this.sideA) * (this.semiPerimeter - this.sideB) * (this.semiPerimeter - this.sideC)));
    }
}
