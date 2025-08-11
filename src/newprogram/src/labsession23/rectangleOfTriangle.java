package labsession23;

class Shape {
    public double getArea() {
        System.out.println("Calculating area of shape.");
        return 0.0;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   
    public double getArea() {
        return length * width;
    }
    public class rectangleOfTriangle {

    public static void main(String[] args) {
        Shape genericShape = new Shape();
        System.out.println("Area of generic shape: " + genericShape.getArea());

        Rectangle myRectangle = new Rectangle(5.0, 10.0);
        System.out.println("Area of rectangle: " + myRectangle.getArea());

        Shape anotherShape = new Rectangle(7.0, 3.0);
        System.out.println("Area of another shape (which is a rectangle): " + anotherShape.getArea());
    }
}
}

