public class test {
    
   
        public static void main(String[] args) {
            // Create Account, SavingsAccount and Checking Account objects
            Account account = new Account(2001, 25000);
            SavingAccount savings = new SavingAccount(1002, 20000);
            Checking checking = new Checking(1023, 20000,0);
            // Set annual interest rate of 8%
            account.setAnnualInterestRate(8);
            savings.setAnnualInterestRate(8);
            checking.setAnnualInterestRate(8);
    
            // Withdraw 500
            account.withdraw(500);
            savings.withdraw(500);
            checking.withdraw(500);
    
            // Deposit 2000
            account.deposit(2000);
            savings.deposit(2000);
            checking.deposit(2000);
    
            
            System.out.println(account.toString());
            System.out.println(savings.toString());
            System.out.println(checking.toString());
        }
    
}



