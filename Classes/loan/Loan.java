package loan;
//program to calculate Loan
import java.util.Date;
public class Loan {
    //data fields

    double annualInterestRate = 2.5;
    int numOfYears = 1;
    double loanAmount = 1000;
    Date loanDate = new Date();

   //constructor
   public Loan(double annualInterestRate, int numOfYears, double loanAmount){
         this.annualInterestRate = annualInterestRate;
         this.numOfYears = numOfYears;
         this.loanAmount = loanAmount;
         this.loanDate = new Date();


   }

   //getter methods

   public double getAnnualInterestRate(){
      return annualInterestRate;
   }

   public double getLoanAmount(){
    return loanAmount;
   }

   public Date getloanDate(){
     return loanDate;
   }
   public int getNumOfYears(){
     return numOfYears;

   }

   //setter methods

   public void setAnnualInterestRate(double annualInterestRate){
     this.annualInterestRate = annualInterestRate;
   }

   public void setNumOfYears(int numOfYears){

      this.numOfYears = numOfYears;
   }


   public void setLoanAmount(double loanAmount){
      this.loanAmount = loanAmount; 

   }


  public double getMonthlyPayment(){
     double  monthlyInterestRate = annualInterestRate /1200;

     double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1+ monthlyInterestRate, numOfYears * 12)));

     return monthlyPayment;
  }


  public double getTotalPayment(){
    double totalPayment = getMonthlyPayment() * numOfYears * 12;
    return totalPayment;
  }

  










}
