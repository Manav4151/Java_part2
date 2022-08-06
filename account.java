// 21CE097 Manav Patel
/*
 (Subclasses  of  Account)  In  Programming  Exercise  2,  the  Account  class  wasdefined to model a bank account. An account has the properties account number,balance,  annual  interestrate,  and  date  created,  and  methods  to  deposit  and withdrawfunds.  Create  two  subclasses  for  checking  and  saving  accounts.  A checkingaccount  has  an  overdraft  limit,  but  a  savings  account  cannot  be overdrawn.Draw  the  UML  diagram  for  the  classes  and  then implement  them. Writea  test  program  that  creates  objects  of  Account,  SavingsAccount,  andCheckingAccount and invokes their toString() methods.
 */
import java.sql.Date;

public class account {
    
    private int id;
    private double balance=500;
    private static double annualInterestRate=7;
    private Date dateCreated;

    
    account() {
        this(0, 0); 
    }

   
    account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 7;
        dateCreated = new Date(id);
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public void setAnnualInterestRate(double annualInterestRate) {
        account.annualInterestRate = annualInterestRate;
    }
  
    
    public int getId() {
        return id;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

  
    public String getDateCreated() {
        return dateCreated.toString();
    }

    
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    
    public void withdraw(double amount) {
        balance = balance- amount;
    }

    
    public void deposit(double amount) {
        balance = balance + amount;
    }

    /* Return a String decription of Account class */
    public String toString() {
        return "\nAccount ID: " + id + 
             "\nBalance: " + String.format("%.2f", balance) + 
            "\nMonthly interest: " + String.format("%.2f", getMonthlyInterest());
    }
}
