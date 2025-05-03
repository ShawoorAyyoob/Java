public class InterfaceShape {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        System.out.println("Area of the Circle: " + circle.getArea());
        System.out.println("Perimeter of the Circle: " + circle.getPerimeter());

        System.out.println();

        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
    }
}

interface Shape {
    double getArea();
    double getPerimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (22 / 7) * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * (22 / 7) * radius;
    }
}

class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}