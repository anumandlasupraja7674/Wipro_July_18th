package labsession24;
//Create an abstract class Vehicle with abstract method move().
//Subclasses:
//Car, Bike, Bus
//Each subclass should override move() with specific output like:
////Car is moving on four wheels
//Bike is moving on two wheels

abstract class Vehicle {
	abstract void move();
}


class car extends Vehicle {
	public void move() {
		System.out.println("Car is moving on four wheels");
	}
	
	
}

class bike extends Vehicle {
	public void move() {
		System.out.println("Bike is moving on two wheels");
	}
}

class bus extends Vehicle {
	public void move() {
		System.out.println("Bus is moving on six wheels");
	}
}
public class VehicleInheritance {
	public static void main(String[] args) {
		car c = new car();
		c.move();
		
		bike b=new bike();
		b.move();
		
		bus bs = new bus();
		bs.move();
		
	}
	
	

}
