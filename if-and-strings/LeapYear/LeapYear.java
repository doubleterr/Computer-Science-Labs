package LeapYearLab;

import java.util.Scanner;

public class LeapYear{
    
    Scanner input = new Scanner(System.in);
    
    private int years;
    
    public LeapYear(){
        
        years = 0;
        
    }
    
    public String checkifleap(){
        
        System.out.print("Enter a year :: ");
        years = input.nextInt();
        
        if((years % 4 == 0)){
            
            return years + " is a leap year." + "\n";
            
        }
        
        if((years % 400 == 0)){
            
           return years + " is a leap year." + "\n";
            
        }
        
        return years + " is NOT a leap year." + "\n";
        
    }
    
}