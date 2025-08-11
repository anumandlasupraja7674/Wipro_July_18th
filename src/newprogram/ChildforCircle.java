package newprogram;

public class ChildforCircle implements CircleShapeInterface{
	
	//method coming from interface shapeInterface 
	
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	//method coming from circleShape Interface
	public void radius() {
		System.out.println("radius is  units");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildforCircle c = new ChildforCircle();
		c.draw();
		c.radius();
	}

}
