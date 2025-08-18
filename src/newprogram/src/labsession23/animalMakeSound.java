package labsession23;


class Animal {
	public void makeSound() {
		System.out.println("Animal make sound");
	}
}
class Cat extends Animal {
	public void makeSound() {
		System.out.println("bark");
	}
}
	class animalMakeSound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an = new Animal();
		an.makeSound();

	Cat ca = new Cat();
	ca.makeSound();
	}

}
