package account;

public class Main {
    public static void main(String[] args) {
        //create object for user
        Account user1 = new Account();

       user1.setId(1122);
       user1.setBalance(20_000);
       user1.setAnnualInterestRate(4.5);
       user1.withdraw(2000);
       user1.deposit(3000);

       System.out.println("User Id: " + user1.getId()+ "Your balance is: " + user1.getBalance());
       System.out.println("Monthly interest rate is: " + user1.getMonthlyInterestRate());
       System.out.println("Account created on: " + user1.getDatecreated());

    }

}
