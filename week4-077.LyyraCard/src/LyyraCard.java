/**
 * Created by Mark on 11/17/2016.
 */
public class LyyraCard {
    private double balance;
    //private double starting;

    public LyyraCard(double balanceAtStart){
        this.balance = balanceAtStart;
       // this.starting = balanceAtStart;
    }
    public String toString(){
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if ((this.balance - 2.50) >= 0) {
            this.balance = this.balance - 2.50;
        }
    }

    public void payGourmet(){
        if ((this.balance - 4.00) >= 0){
        this.balance = this.balance - 4.00;
        }
    }

    public void loadMoney(double amount) {

        if (amount > 0) {
            if (this.balance + amount < 150) {
                this.balance = this.balance + amount;
            } else if (this.balance + amount >= 150)
                this.balance = 150;
        }
    }
}



