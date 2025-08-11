package labsession31;

public class Products {
	String name;
	int Price;
	
	Products(String name,int Price ) {
		this.name=name;
		this.Price = Price;
	
	}
	public String toString() {
		return name+ " "+Price;
	}

}