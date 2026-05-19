public class bankTest {



public bankTest() {

    

    
}



public static void main(String[] args) {

    account James = new account("James", 10.0);
    account Henry = new account("Henry", 2000.0);



   //James.withdraw(5.0);
   //James.greet();
   Henry.withdraw(230.0);
   Henry.greet();
   Henry.setOccupation("Software Engineer");
   Henry.setAge(20);

   Henry.areyouabozo(false);

   //System.out.println("Henry's age is: " + Henry.age + " and his occupation is: " + Henry.occupation);

   

   // Henry.getInfo();

   

   


   


   Henry.deposit(100.0);
   
}
}
