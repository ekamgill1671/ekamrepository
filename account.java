
public class account {

    String name;
    //String account;
    Double money;
    Double balance;

    public account(String name, double balance) {

        this.name = name;
        this.balance = balance;

    }


    public void withdraw(double money) {
        balance = balance - money;

    }

    public void greet() {
        System.out.println(name+":" + " I am going broke because I only have " +balance);
    }

    
}
