import java.util.Date;

public class Account {

	private int id = 0;
	
	private double balance = 0.0;
	
	private double annualInterestRate = 0.0;
	
	private Date dateCreated = new java.util.Date();
	
	
	Account(){
	}
	
	Account(int newID, double initialBalance){
		id = newID;
		balance = initialBalance;
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int newID){
		id = newID;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate / 100;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12.0;
	}
	
	public double getMonthlyInterest() {
		return getMonthlyInterestRate() * balance;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}
