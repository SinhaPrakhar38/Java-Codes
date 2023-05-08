
class Shapes {
    int len;
    int breadth;

    public Shapes() {

    }

    public Shapes(int l, int b) {
        this.len = l;
        this.breadth = b;
    }

    public Shapes(int len) {
        this.len = len;
    }

    public int area() {
        return (this.len * this.breadth);
    }

}

class Square extends Shapes {

    public Square() {

    }

    public Square(int l) {
        this.len = l;
    }

    public int area() {
        return len * len;
    }

    public int perimeter() {
        return (2 * len + 2 * breadth);
    }

}

class Rectangle extends Square {
    public Rectangle(int l, int b) {
        this.len = l;
        this.breadth = b;
    }
}

class Circle extends Shapes {
    int radius;

    public Circle(int r) {
        this.radius = r;
    }

    public double areaC() {
        return (3.14 * radius * radius);
    }
}

public class ShapesInr {

    public static void main(String args[]) {
        Square s1 = new Square(5);
        System.out.println("Square area : " + s1.area());

        Rectangle r1 = new Rectangle(5, 6);
        System.out.println("Rectangle area : " + r1.area());

        Circle c1 = new Circle(4);
        System.out.println("Circle area : " + c1.areaC());
    }

}
