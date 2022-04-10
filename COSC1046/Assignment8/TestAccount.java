
public class TestAccount {

	public static void main(String[] args) {
		
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.printf("The Balance of the account is %.2f, the monthly interest is %.2f, and the date the account was created is %s."
				, account.getBalance(), account.getMonthlyInterest(), account.getDateCreated());
	}
}
