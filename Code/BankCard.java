 
/**
 * to set client name and display the bank details
 *
 * @author (Pabisha bhatta)
 * @version (17.0.4.1)
 */
public class BankCard { // creating a super class 
    private int card_id; 
    private String client_name;
    private String issuer_bank;
    private String bank_account;
    private int balance_amount;
    // creating a constructor BankCard with 4 parameters
    public BankCard(int balanceAmount, int cardId, String bankAccount, String issuerBank) { 
        this.balance_amount = balanceAmount; 
        this.card_id = cardId;
        this.bank_account = bankAccount;
        this.issuer_bank = issuerBank;
        this.client_name = "";
    }
    /**Calling accessor method for the following **/ 
    public int getCard_id() {
        return this.card_id;
    }
    public String getIssuer_bank() {
        return this.issuer_bank;
    }

    public String getBankAccount() {
        return this.bank_account;
    }

    public int getBalanceAmount() {
        return this.balance_amount;
    }
    /** calling mutator method **/
    public void setClientName(String client_name) {
        this.client_name = client_name;
    }

    public void setBalanceAmount(int balance_amount) {
        this.balance_amount = balance_amount;
    }
    // using display method to show the output
    public void display() { 
        if (client_name == "") { // if statement to check if the client name is empty or not
            System.out.println("Sorry the client name is not registered.");
        } else{ 
            System.out.println("Dear customer: " + this.client_name);
            System.out.println("the registered Card ID is: " + this.card_id);
            System.out.println("the registered  Issuer bank is: " + this.issuer_bank);
            System.out.println("the registered Bank account is: " + this.bank_account);
            System.out.println("your Balance amount is: " + this.balance_amount);
        }
    }
}



