
public class account {

    String name;
    //String account;
    Double money;
    Double balance;
    boolean broke = true;
    

    

    public account(String name, double balance) {

        this.name = name;
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }


    public void withdraw(double money) {
        if (balance<=money) {
        balance = balance - money;
        broke = true;
        System.out.println("no can do");
        } else {
        balance = balance - money;
        broke = false;
         System.out.println("affirmative");
        }
    }


    
    public void greet() {
        if (broke) {
            System.out.println(name+":" + " I am IN DEBT because I only have " +balance);
        } else {
            System.out.println(name+":" + " I am not going broke because I have " +balance);
        } 
        

    }


}
