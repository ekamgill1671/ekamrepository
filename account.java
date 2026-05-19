
public class account{ 

    String name;
    String occupation;
    Double money;
    int age;
    Double balance;
    boolean broke = true;
    boolean bozo;

    int 2025;

    

    

    public account(String name, double balance) {

        this.name = name;
        this.balance = balance;

    }



    public void getBalance() {
        System.out.println(balance);
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

    public void deposit(double money) {
       balance = balance + money;
       System.out.println("gained money!");
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void getInfo() {
        System.out.println(name);
        System.out.println(occupation);
        System.out.println(balance);
        System.out.println(age);
    }

    public void bozo() {
        if (occupation.equals("Software Engineer") && age < 30) {
            System.out.println("Thou are not a bozo");
        } else {
            System.out.println("Thou are a bozo");
        }
    }

    public void areyouabozo(boolean bozo) {
        if (bozo) {
            System.out.println("Thou are a bozo");
        } else {
            System.out.println("Thou are not a bozo");
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
