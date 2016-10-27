package CharacterAnalyzer;

import java.util.Scanner;

public class CharacterAnalyzer{
    
    private String temp;
    
    private char toAscii;
    
    Scanner input = new Scanner(System.in);
    
    public CharacterAnalyzer(){
        
        toAscii = ' ';
        
    }
    
    public void giveVal(){
        
        System.out.print("Enter a letter :: ");
        
        temp = input.next();
        
        toAscii = temp.charAt(0);
        
        if((int)toAscii >= 65)
            if((int)toAscii <= 90)
                System.out.println(toAscii + " is an uppercase character. ASCII == " + (int)toAscii + "\n");
        
        if((int)toAscii >= 97)
            if((int)toAscii <= 122)
                System.out.println(toAscii + " is an lowercase character. ASCII == " + (int)toAscii + "\n");
        
        if((int)toAscii >= 48)
            if((int)toAscii <= 57)
                System.out.println(toAscii + " is an number. ASCII == " + (int)toAscii + "\n");
        
    }
    
    
}