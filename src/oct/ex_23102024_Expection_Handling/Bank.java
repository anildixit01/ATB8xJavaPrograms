package oct.ex_23102024_Expection_Handling;
import java.io.FileNotFoundException;
public class Bank {
    private  String currency;
    private int amount;

    public Bank(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Integer add(Bank bankName) throws FileNotFoundException,Exception {

        if (!bankName.currency.equalsIgnoreCase("INR")) {
//            throw new Exception("Currency Mismatch, Can't Proceed!");
//            throw new Exception("Currency Mismatch, Can't Proceed!");
            throw new Error();
        }
        return bankName.amount + this.amount;


    }


}
