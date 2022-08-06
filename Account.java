// 21CE097 Manav Patel
/*
Design a class named Account that contains:
•A private int data field namedid for the account (default 0).
•A private double data field named balance for the account (default 500₹).
•A  private  double  data  field  named  annualInterestRate  that  stores  the  currentinterest rate (default 7%). Assume all accounts have the same interest rate.
•A  private  Date  data  field  named  dateCreated  that  stores  the  date  when  theaccount was created.
•A no-arg constructor that creates a default account.
•A constructor that creates an account with the specified id and initial balance.
•The accessor and mutator methods for id, balance, and annualInterestRate.
•The accessor method for dateCreated.
•A method named getMonthlyInterestRate() that returns the monthlyinterest rate.
•A method named getMonthlyInterest() that returns the monthly interest.
•A method named withdraw that withdraws a specified amount from theaccount.
•A method named deposit that deposits aspecified amount to the account.

 */

import java.util.Date;

public class Account {

    private int id=0;
    private double balance=500;
    private double annualInterestRate=7;
    private Date dateCreated= new Date();

    Account(){}
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public int  setDateCreated() {
        return setDateCreated();
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    Account(int a,double b,double c){
        id=a;
        balance=b;
        annualInterestRate=c;
    }
    Account(Date x){
        dateCreated=x;
    }

    public Date AccDate(){
        return dateCreated;
    }

    public void getMonthlyInterestRate(){
        
        double m_IR=annualInterestRate;

        System.out.println("Monthly interest rate: "+m_IR/(12));
    }

    public void getMonthlyInterest(){
        double m_=annualInterestRate;
        double  b2=balance;
        double m_in=(m_/(100*12));
        b2=b2*m_in;
        System.out.println("Monthly interest :"+ b2);
    }

    public void withdraw(double a){
        double b1=balance;
        b1=b1-a;
        System.out.println("Withdraw amount :"+a);
        System.out.println("After withdraw remaining balance:"+b1);
    }
   public void  deposit(double b){
    double b2=balance;
       b2=b2+b;
       System.out.println("Deposit amount :"+b);
       System.out.println("After Deposit balance: "+b2);
   }

   public static void main(String[] args) {
    Account a1=new Account(10,2500,7);
 
    a1.getMonthlyInterestRate();;
    a1.getMonthlyInterest();
    a1.deposit(250);
    a1.withdraw(100);
    a1.AccDate();
    System.out.println(a1.AccDate());
}
}