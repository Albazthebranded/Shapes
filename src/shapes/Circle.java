package shapes;

public class Circle extends Shapes {

    public Circle(double radius){
        this.radius = radius;
        this.perimeter = 2 * Math.PI * this.radius;
        this.area = Math.PI * Math.pow(this.radius, 2);
    }
}
