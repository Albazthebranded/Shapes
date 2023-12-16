import shapes.Circle;
import shapes.Rectangle;
import shapes.Shapes;
import shapes.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Please select shape (triangle, rectangle, circle) or type exit to close.");
            String action = scan.next();

            if (action.equals("exit")) {
                isRunning = false;
            } else if (action.equals("triangle")) {
                System.out.println("Please enter the length of the triangle's sides.");

                try {

                    double sideA = scan.nextDouble();
                    double sideB = scan.nextDouble();
                    double sideC = scan.nextDouble();
                    Shapes triangle = new Triangle(sideA, sideB, sideC);
                    boolean isTriangle = true;

                    while (isTriangle) {
                        System.out.println("To know the triangle's perimeter, type 'perimeter'.\nTo know its area, type 'area'.\nTo know a particular angle, type A, B, or C.\nTo select a new shape, type 'back'.\nTo close, type 'exit'.");
                        action = scan.next();
                        if (action.equals("exit")) {
                            return;
                        } else if (action.equals("back")) {
                            isTriangle = false;
                        } else if (action.equals("perimeter")) {
                            System.out.println("The triangle's perimeter is " + triangle.getPerimeter());
                        } else if (action.equals("area")) {
                            System.out.println("The triangle's area is " + triangle.getArea());
                        } else if (action.equals("A")) {
                            System.out.printf("The angle A of the triangle is %f,5 degrees.", triangle.getAngleA());
                        } else if (action.equals("B")) {
                            System.out.printf("The angle B of the triangle is %f,5 degrees.", triangle.getAngleB());
                        } else if (action.equals("C")) {
                            System.out.printf("The angle C of the triangle is %f,5 degrees.", triangle.getAngleC());
                        } else {
                            System.out.println("Unknown command.");
                            continue;
                        }
                        Thread.sleep(2000);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Wrong input, please try again.");
                }
            } else if (action.equals("rectangle")) {
                System.out.println("Please enter the rectangle's sides.");

                try {
                    double sideA = scan.nextDouble();
                    double sideB = scan.nextDouble();
                    Shapes rectangle = new Rectangle(sideA, sideB);
                    boolean isRectangle = true;

                    while (isRectangle) {
                        System.out.println("To know the perimeter of the rectangle, type 'perimeter'.\nTo know the area of the rectangle, type 'area'.\nTo select a new shape, type 'back'.\nTo close, type 'exit'.");
                        action = scan.next();

                        if (action.equals("exit")) {
                            return;
                        } else if (action.equals("back")) {
                            isRectangle = false;
                        } else if (action.equals("perimeter")) {
                            System.out.println("The rectangle's perimeter is " + rectangle.getPerimeter());
                        } else if (action.equals("area")) {
                            System.out.println("The rectangle's area is " + rectangle.getArea());
                        } else {
                            System.out.println("Unknown command.");
                            continue;
                        }
                        Thread.sleep(2000);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Wrong input, please try again.");
                }
            } else if (action.equals("circle")) {
                System.out.println("Please enter the circle's radius.");

                try {
                    double radius = scan.nextDouble();
                    Shapes circle = new Circle(radius);
                    boolean isCircle = true;

                    while (isCircle) {
                        System.out.println("To know the perimeter of the circle, type 'perimeter'.\nTo know the area of the circle, type 'area'.\nTo select a new shape, type 'back'.\nTo close, type 'exit'.");
                        action = scan.next();

                        if (action.equals("exit")) {
                            return;
                        } else if (action.equals("back")) {
                            isCircle = false;
                        } else if (action.equals("perimeter")) {
                            System.out.println("The circle's perimeter is " + circle.getPerimeter());
                        } else if (action.equals("area")) {
                            System.out.println("The circle's area is " + circle.getArea());
                        } else {
                            System.out.println("Unknown command.");
                            continue;
                        }
                        Thread.sleep(2000);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Wrong input, please try again.");
                }
            } else {
                System.out.println("Unknown command.");
            }
        }
        System.exit(0);
    }
}
