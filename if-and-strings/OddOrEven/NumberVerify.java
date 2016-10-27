package OddOrEven;

import java.util.Scanner;

public class NumberVerify{
    
   Scanner input = new Scanner(System.in);
    
    private int number;
    
    public NumberVerify(){
        
        number = 0;
        
    }
    
   public String isEven(){
        
        System.out.print("Enter a whole number :: ");
        number = input.nextInt();
        
        if (number % 2 == 0){
            
            return (number + " is odd :: false" + "\n" + number + " is even :: true" + "\n");
            
        }
        
        return (number + " is odd :: true" + "\n" + number + " is even :: false" + "\n");
       
    }

}