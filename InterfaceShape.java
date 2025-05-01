public class InterfaceShape {
    public static void main(String[] args) {
        Shape circle = new Circle();
        form(circle);

        System.out.println();

        Shape rectangle = new Rectangle();
        form(rectangle);
    }
    static void form(Shape shape){
        shape.getArea();
        shape.getPerimeter();
    }
}

interface Shape {
    double getArea();
    double getPerimeter();
}

class Circle implements Shape {
    double radius;

    @Override
    public double getArea() {
        System.out.println("Area of the Circle");
        return 22 / 7 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Perimeter of the Circle");
        return 2 * 22 / 7 * radius;
    }
}

class Rectangle implements Shape {
    double length;
    double width;

    @Override
    public double getArea() {
        System.out.println("Area of the Rectangle");
        return length * width;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Perimeter of the Rectangle");
        return 2 * (length + width);
    }
}