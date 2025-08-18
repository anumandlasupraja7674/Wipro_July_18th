package labsession24;

//Write a prgram with a base class named as Payment and child classes  Creditcard, UPI and 
//Netbanking , overide the methdod pay() in each class

class payment {
	public void pay() {
		System.out.println("Processing payment");
		
	}
}

class Creditcard extends payment {
	String cardNo;
	String holderName;
	public Creditcard(String cardNo, String holderName) {
		this.cardNo = cardNo;
		this.holderName = holderName;
	}
	public void pay() {
		
		System.out.println("name: "+holderName + "cardNo: "+cardNo);
	}
}

class UPI extends payment {
	String upiID;
	public UPI(String upiID) {
		this.upiID = upiID;
	}
	public void pay() {
		System.out.println("upiID :"+upiID);
		
	}
}

class Netbanking extends payment {
	String bankName;
	int accNo;
	public Netbanking(String bankName, int accNo) {
		this.bankName = bankName;
		this.accNo = accNo;
		
	}
	public void pay() {
		System.out.println("accNo"+accNo+"bankName: "+bankName);
		
	}
}
public class paymentcreditcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		payment np = new payment();
		np.pay();
		Creditcard cc = new Creditcard("1234", "Supraja");
		cc.pay();
		UPI upi = new UPI("sup@bank");
		upi.pay();
		Netbanking nb = new Netbanking("SBI",1234567 );
		nb.pay();
		

	}

}
