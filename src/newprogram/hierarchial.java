package newprogram;

 class Animal {
	public void eat() {
		System.out.println("Animal eat food");
	}
}
//subclass1 
class dog extends Animal {
	public void bark() {
		System.out.println("Dog barks");
	}
}

class cat extends Animal {
	public void meow() {
		System.out.println("cat meow");
	}
}
class cow extends Animal {
	public void moo() {
		System.out.println("cow moo");
	}
}


public class hierarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dog d = new dog();
		d.eat();
		d.bark();
		
		cat c = new cat();
		c.eat();
		c.meow();
		
		cow cw = new cow();
		cw.eat();
		cw.moo();
	}

}
