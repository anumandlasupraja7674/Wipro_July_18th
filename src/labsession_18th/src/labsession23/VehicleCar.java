package labsession23;

class Vehicle {
	public void drive() {
		System.out.println("Vehicle drive");
	}
}

class Car extends Vehicle {
	public void drive() {
		System.out.println("Repairing a car");
	}
}

public class VehicleCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle ve = new Vehicle();
		ve.drive();

	Car ca = new Car();
	ca.drive();

	}

}
