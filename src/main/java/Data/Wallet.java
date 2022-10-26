package Data;

public class Wallet {
    private static Wallet instance = null;
    private double balance;

    private Wallet() {}

    public static Wallet getInstance(){
        if(instance == null) instance = new Wallet();
        return instance;
    }

    public void setBalance(double balance){this.balance = balance;}
    public double getBalance(){return balance;}
}
