package newprogram;

public class EncapsulationEx {
	private String nameOf;
	private int age;
	
	public void setName(String nameOf) {
		this.nameOf = nameOf;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return nameOf;
	}
	
	public int getAge() {
		return age;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationEx en = new EncapsulationEx();
		en.setName("supraja");
		en.setAge(21);
		
		System.out.println(en.getAge());
		System.out.println(en.getName());

	}

}
