package labsession25;

public class Rectangle implements Shape{
	 double length;
	 double width;
	
	Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
	
	public double getArea() {
		return length * width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(12,34);
		rect.getArea();

	}

}
