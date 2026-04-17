public class main {



public main() {

    
}

public static void main(String[] args) {

    account James = new account("James", 10.0);
    account Henry = new account("Henry", 2000.0);

   James.withdraw(820.0);
   James.greet();
   Henry.withdraw(200000);
   Henry.greet();
}
}
