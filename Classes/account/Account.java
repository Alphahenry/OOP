package account;

/*
(The Account class) Design a class named Account that contains:
■■ A private int data field named id for the account (default 0).
■■ A private double data field named balance for the account (default 0)
■■ A private double data field named annualInterestRate that stores the cur-
rent interest rate (default 0). Assume that all accounts have the same interest rate.
■■ A private Date data field named dateCreated that stores the date when the
account was created.
■■ A no-arg constructor that creates a default account.
■■ A constructor that creates an account with the specified id and initial balance.
■■ The accessor and mutator methods for id, balance, and annualInterestRate.
■■ The accessor method for dateCreated.
■■ A method named getMonthlyInterestRate() that returns the monthly
interest rate.
■■ A method named getMonthlyInterest() that returns the monthly interest.
■■ A method named withdraw that withdraws a specified amount from the
account.
■■ A method named deposit that deposits a specified amount to the account.
The method
getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate. monthlyInteres-
tRate is annualInterestRate / 12. Note annualInterestRate is a per-
centage, for example 4.5%. You need to divide it by 100.)
Write a test program that creates an Account object with an account ID of 1122, a
balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw method
to withdraw $2,500, use the deposit method to deposit $3,000, and print the bal-
ance, the monthly interest, and the date when this account was created.
 * 
 */
import java.util.Date;
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate= 0;
    private  Date dateCreated = new Date();


   // default constructor
    public Account(){

    }

    //parameterized  constructor
    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        
        this.dateCreated = new Date();
    }

    //setter methods

    public void setId(int id){
       this.id = id;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    //getter methods

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    // get monthly interest rate

    public double getMonthlyInterestRate(){
        double monthlyInterestRate;
        monthlyInterestRate = (annualInterestRate / 12) /100;
        return monthlyInterestRate;
    }

    //get monthly interest
    public double getMonthlyInterest(double monthlyInterestRate){
            return balance * monthlyInterestRate;
    }

    //get  datecreated
    public String getDatecreated(){
        return dateCreated.toString();
    }

    // withdraw method

    public void withdraw(double amount){
        balance -= amount;
    }

    //deposit method
    public void deposit(double amount){
        balance += amount;
    }

}


