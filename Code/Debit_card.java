 

/**
 * to withdraw money from the bank and deduct from the balance amount 
 *
 * @author (Pabisha bhatta)
 * @version (17.0.4.1)
 */
public class Debit_card extends BankCard { 
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    // creating a constructor Debit_card with 5 parameters
    public Debit_card(int balanceAmount, int cardId, String bankAccount, String issuerBank,String client_name,int pinNumber){
        super(balanceAmount, cardId, bankAccount, issuerBank);// calling the constructor of BankCard class
        setClientName(client_name); 
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;}
    /**Calling accessor method for the following **/
    public int getPinNumber() {
        return this.pinNumber;
    }

    public int getWithdrawal_Amount() {
        return this.withdrawalAmount;
    }

    public String getDate_Of_Withdrawal() {
        return this.dateOfWithdrawal;
    }

    public boolean getHas_Withdrawn() {
        return this.hasWithdrawn;
    }
    /** calling mutator method for te following **/
    public void setWithdrawalAmount(int newWithdrawalAmount) {
        this.withdrawalAmount = newWithdrawalAmount;
    }

    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber){
        if (pinNumber == this.pinNumber && withdrawalAmount <= getBalanceAmount()) { 
            setBalanceAmount(getBalanceAmount() - withdrawalAmount); // setting new balance amount if user withdraws amount
            this.withdrawalAmount = withdrawalAmount;
            this.dateOfWithdrawal = dateOfWithdrawal;
            this.hasWithdrawn = true;
        } else {
            System.out.println("please check your pin number or your balance amount.");}
    }

    public void display() { // creating display method to use if statement and to display output
        super.display(); // calling the display method of BankCard class
        if (hasWithdrawn == true){
            System.out.println("Pin number is " + this.pinNumber);
            System.out.println("Withdrawal amount is" + this.withdrawalAmount);
            System.out.println("Date of withdrawal is " + this.dateOfWithdrawal);
        } else {
            System.out.println("No transaction has been carried out yet." );
            System.out.println("remaining balance is " + getBalanceAmount());
        }
    }
}