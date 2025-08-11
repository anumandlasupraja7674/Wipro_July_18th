package labsession25;

class SavingsAccount implements Account{
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
	public void savings() {
		int b = 12233;
		System.out.println("Savings " + b);
	}

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		sa.deposit();
		sa.withdraw();
		sa.calculateInterest();
		sa.viewBalance();
		sa.savings();// TODO Auto-generated method stub

	}

}