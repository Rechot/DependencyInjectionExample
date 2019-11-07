package AccountManager;

public class Account {

    private int balance = 0;
    private String owner ;

    public Account(int balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deduct (int amount) throws Exception {
        balance -= amount;
        if(balance < 0){ throw new Exception("You don't do that") ;}
    }

    public void add(int amount){
        balance += amount;
    }

    public int getBalance(){
        return balance;
    }

    public String getOwner() {
        return owner;
    }

}
