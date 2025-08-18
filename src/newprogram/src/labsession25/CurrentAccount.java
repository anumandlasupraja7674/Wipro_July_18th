package labsession25;

class CurrentAccount implements Account{
	public void deposit()
	{
		System.out.println("Deposited");
	}
	public void withdraw() {
		System.out.println("Withdrawed");
	}
	public void calculateInterest() {
		int b = 20000;
		float r  = 0.1f;
		double i = b*r;
		System.out.println("Interest" + i);
	}
	public void viewBalance() {
		System.out.println("View balance");
		
	}
	public void current() {
		int b = 12233;
		System.out.println("Savings in current account " + b);
	}

	public static void main(String[] args) {
		CurrentAccount ca = new CurrentAccount();
		ca.deposit();
		ca.withdraw();
		ca.calculateInterest();
		ca.viewBalance();
		ca.current();
	}
}
