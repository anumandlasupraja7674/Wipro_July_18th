package labsession24;

//Billing System
//Abstract class Bill:
//Abstract method generateBill()
//Subclasses:
//ElectricityBill
//WaterBill
//Each subclass should implement bill generation logic.

abstract class bill {
	abstract void generateBill();
}


class eleBill extends bill {
	public void generateBill() {
	        int units = 150;
	        double rate = 5.0;
	        double amount = units * rate;
	        System.out.println("Electricity Bill: " + amount);
	}
	
	
}

class waterbill extends bill {
	public void generateBill() {
        int liters = 500;
        double rate = 2.0;
        double amount = liters * rate;
        System.out.println("Water Bill: " + amount);
    }
}



public class generatebillingSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eleBill eb = new eleBill();
		eb.generateBill();
		
		waterbill wb = new waterbill();
		wb.generateBill();
		

	}

}
