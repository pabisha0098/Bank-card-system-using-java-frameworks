 

/**
 * to set credit limit and grace period 
 *
 * @author (Pabisha bhatta)
 * @version (17.0.4.1)
 */
public class Credit_card extends BankCard // creating sub class of BankCard class i.e Credit_card
{
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    // creating a constructor of Credit_card class 
    public Credit_card(int balanceAmount, int cardId, String bankAccount, String issuerBank, String client_name, int cvcNumber, double interestRate, String expirationDate){
        super(balanceAmount,cardId,bankAccount,issuerBank);// calling constructor of BankCard class
        setClientName(client_name);// setting new client name
        this.cvcNumber=cvcNumber;
        this.interestRate=interestRate;
        this.expirationDate=expirationDate;
        this.isGranted=false;
    
    }
    /**Calling accessor method for the following **/ 
    public double getcreditLimit(){
        return this.creditLimit;
        
    }
    public int getcvcNumber(){
        return this.cvcNumber;
    }
    public double getinterestRate(){
        return this.interestRate;
    }
    public int getgracePeriod(){
        return this.gracePeriod;
    }
    public boolean getisGranted(){
        return this.isGranted;
    }
    /**Calling mutator method for the following **/ 
    public void setcreditLimit(int gracePeriod,double creditLimit){
        if(2.5*(super.getBalanceAmount())>=creditLimit){ // using if statement
            this.gracePeriod=gracePeriod;
            this.creditLimit=creditLimit;
            this.isGranted=true;
            
        }
        else{
            System.out.println("credit is not been able to issued");
        }
        
    }
    // this method is called to cancel user cerdit card
    public void cancel_creditCard(){
        this.cvcNumber=this.gracePeriod=0;
        this.creditLimit=0;
        this.isGranted=false;
    }
    public void display(){
        if(isGranted==true){
            super.display(); // display method of parent class is call
            System.out.println("CreditLimit:" + creditLimit);
            System.out.println("Graceperiod:" + gracePeriod);
            
        }
        else{
            System.out.println("No existence of the card");
            
        }
    }
    
}
