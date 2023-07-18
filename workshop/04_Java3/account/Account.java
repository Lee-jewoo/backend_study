package account;

public class Account {
	
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public double calculateInterest() {
		double interest = balance * interestRate / 100;
		return interest;
	}
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		if (balance < money) {
			System.out.println("출금할 수 없습니다.");
		} else {
			balance -= money;
		}

	}

	public String getAccount() {
		return account;
	}

	public int getBalance() {
		return balance;
	}


}
