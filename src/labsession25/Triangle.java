package labsession25;

public class Triangle implements Shape{
	double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle(23,34);
		t.getArea();
		

	}

}
