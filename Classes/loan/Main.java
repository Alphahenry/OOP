package loan;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

       System.out.println("Enter annual Interst rate: ");
       double annualInterestRate = sc.nextDouble();

       System.out.println("Enter Loan amount: ");
       double loanAmount = sc.nextDouble();

       System.out.println("Enter Number of years: ");
       int numOfYears= sc.nextInt();

       Loan loan1 = new Loan(annualInterestRate, numOfYears, loanAmount);

       System.out.printf("The loana was taken on %s\n, The total payment is %.2f\n, Monthly payment is %.2f\n", 
           loan1.loanDate.toString(),loan1.getTotalPayment(), loan1.getMonthlyPayment()
          );



        sc.close();
    }

}
