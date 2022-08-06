public class SavingAccount extends Account {

 	
 	public SavingAccount() {
 		super();
 	}

 	public SavingAccount(int id, double balance ){
 		super(id, balance);
 	}

 	
 	public void withdraw(double amount) {
 		double a=amount;
		if (a < getBalance()) {
 			setBalance(getBalance() - a);
 		}
 		else
 			System.out.println("Savings account overdrawn transtaction rejected");
 	}
}