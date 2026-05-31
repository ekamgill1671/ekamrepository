import java.util.Scanner;

public class calculatorTest {


public calculatorTest() {
 
    
}

public static void main(String[] args) {

        System.out.println("Welcome to Ekam's Simple Calculator!");

            

            
            try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int a = scanner.nextInt();

            System.out.println("Enter second number: ");
            int b = scanner.nextInt();

            System.out.println("Choose operation (+, -, *, /): ");
            String op = scanner.next();
            Calculator calc = new Calculator();
            int result = 0;

            if (scanner.hasNextInt() == true) {
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
            } else {
                System.out.println("Invalid input. Please enter an integer.");
            }
                
            System.out.print("Enter a number: ");

    
           
            switch (op) {
                case "+":
                    result = calc.add(a, b);
                    break;
                case "-":
                    result = calc.subtract(a, b);
                    break;
                case "*":
                    result = calc.multiply(a, b);
                    break;
                case "/":
                    result = calc.divide(a, b);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    return;
            }

            
            System.out.println("Result: " + result);
            System.out.println("Thank you for using the Simple Calculator!");
        }
    
}



}
