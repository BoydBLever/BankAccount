//Create a BankAccount class
public class BankAccount {
    //The class should have the following attributes: 
    //(double) checking balance   
    private double checkingBalance;
    //(double) savings balance     
    private double savingsBalance;
    //Create a class member (static) for # of accounts created thus far
    private static int numberOfAccounts = 0;
    //Create a class member (static) tracking the total amount of money stored in every account created
    private static int totalAmountOfMoney = 0;
    //In the constructor, be sure to increment the account count
    public BankAccount(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
        numberOfAccounts++;
    }
    //Create a getter method for the user's checking account balance
    public double getCheckingBalance() {
        return checkingBalance;
    }
    //Create a getter method for the user's saving account balance
    public double getSavingsBalance() {
        return savingsBalance;
    }
    //Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored
    public void deposit(int amount, String accountType){
        if (accountType == "checking"){
            this.checkingBalance = checkingBalance + amount;
        }
        if (accountType == "savings"){
            this.savingsBalance = savingsBalance + amount;
        }
    }
    //Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds
    //Create a method to see the total money from the checking and saving
    //Users should not be able to set any of the attributes from the class
}
// Heidi posted her solution: https://www.youtube.com/playlist?list=PLLoH7_fR3791PgcCSNLoK1KUOWKjkNO0E