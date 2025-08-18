package labsession24;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}

class SavingsAccount implements Account {
    double balance;
    double interestRate = 0.05;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }

    public void viewBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }

   
}

class CurrentAccount implements Account {
    double balance;
    double overdraftLimit = 1000;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        }
    }

    public void calculateInterest() {
        System.out.println("No interest for current account");
    }

    public void viewBalance() {
        System.out.println("Current Account Balance: " + balance);
    }

    
}

public class abstractBankAcc {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.deposit(1000);
        savings.withdraw(200);
        savings.calculateInterest();
        savings.viewBalance();
      

        CurrentAccount current = new CurrentAccount();
        current.deposit(500);
        current.withdraw(1200);
        current.calculateInterest();
        current.viewBalance();
    
    }
}
