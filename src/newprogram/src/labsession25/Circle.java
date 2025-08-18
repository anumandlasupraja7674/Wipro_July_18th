package labsession25;

public class Circle implements Shape{
	
	double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
	
	
     
    	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(22);
		c.getArea();

	}

}
