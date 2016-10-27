package SoddorEven;

import java.util.Scanner;

public class StringOddOrEven{
    
    Scanner input = new Scanner(System.in);
    
    private String word;
    
    public StringOddOrEven(){
        
        word = null;
        
    }
    
    public String getWord(){
        
        System.out.print("Enter a word :: ");
        word = input.next();
        
        if(word.length() % 2 == 0 ){
            
            return word + " is even" + "\n";
            
        }
        
        return word + " is odd" + "\n";
        
    }
    
    
        
}