package input;

import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int intOne,intTwo;
        double doubleOne,doubleTwo;
        
        String FirstName,LastName;
        
        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();
        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();
        
        System.out.print("Enter a double :: ");
        doubleOne = keyboard.nextDouble();
        System.out.print("Enter a double :: ");
        doubleTwo = keyboard.nextDouble();
        
        System.out.print("Enter your first name :: ");
        FirstName = keyboard.next();
        System.out.print("Enter your last name :: ");
        LastName = keyboard.next();
        
        System.out.println("\n");
        
        System.out.println("integer one = " + intOne + "\ninteger two = " + intTwo + "\n");
        System.out.println("double one = " + doubleOne + "\ndouble two = " + doubleTwo + "\n");
        System.out.println("Hello " + FirstName + " " + LastName);
        
    }
    
}
