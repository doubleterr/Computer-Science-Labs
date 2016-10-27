package Decoder;

import java.util.Scanner;

public class Decoder{
    
    Scanner input = new Scanner(System.in);
    
    private String dchar;
    
    private char ichar;
    
    public Decoder(){
    
        dchar = "";
        
        ichar = ' ';
    
    }
     
    public void getVals(){
        
        System.out.print("Enter a letter :: ");
        
        dchar = input.next();
        
        ichar = dchar.charAt(0);
     }
    
    @Override
     public String toString(){
        
         if(Character.isUpperCase(dchar.charAt(0)) == true)
             return dchar + " decodes to " + dchar.toLowerCase() + "\n";
         
         else if(Character.isLowerCase(dchar.charAt(0)) == true)
             return dchar + " decodes to " + dchar.toUpperCase() + "\n";
         
         else if(Character.isDigit(dchar.charAt(0)) == true)
             return dchar + " decodes to " + (char)(ichar + 17) + "\n";
         
        return dchar + " decodes to #" + "\n";
         
     }
    
}
