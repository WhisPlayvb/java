abstract class Shape {
    public abstract void RectangleArea(double length, double breadth);
    public abstract void SquareArea(double side);
    public abstract void CircleArea(double radius);
}

class Area extends Shape {
    public void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public void CircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of Circle: " + area);
    }
}

public class AbstractArea {
    public static void main(String[] args) {
        Area area = new Area();
        area.RectangleArea(5, 10);
        area.SquareArea(4);
        area.CircleArea(3);
    }
}
