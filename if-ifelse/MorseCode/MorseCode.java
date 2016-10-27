package MorseCode;

import java.util.Scanner;

public class MorseCode{
    
    Scanner input = new Scanner(System.in);
    
    private String morse;
    
    public MorseCode(){
    
        morse = "";
    
    }
     
    public void getVals(){
        
        morse = input.next();
          
     }
    
    @Override
     public String toString(){
         
         String letter;
         
         switch(morse){
             
             case ".-":  letter = "A";
                 break;
             
             case "-...":  letter = "B";
                 break;
             
             case "-.-.":  letter = "C";
                 break;
             
             case "-..":  letter = "D";
                 break;
             
             case ".":  letter = "E";
                 break;
             
             case "..-.":  letter = "F";
                 break;
             
            case "--.":  letter = "G";
                 break;
            
            case "....":  letter = "H";
                 break;
                 
            case "..":  letter = "I";
                 break;
                 
            case ".---":  letter = "J";
                 break;
                 
             case "-.-":  letter = "K";
                 break;
                 
             case ".-..":  letter = "L";
                 break;
                 
             case "--":  letter = "M";
                 break;
                 
             case "-.":  letter = "N";
                 break;
                 
             case "---":  letter = "O";
                 break;
                 
             case ".--.":  letter = "P";
                 break;
                 
             case "--.-":  letter = "Q";
                 break;
                 
             case ".-.":  letter = "R";
                 break;
                 
             case "...":  letter = "S";
                 break;
                 
             case "..-":  letter = "U";
                 break;
                 
             case "...-":  letter = "V";
                 break;
                 
             case ".--":  letter = "W";
                 break;
                 
             case "-..-":  letter = "X";
                 break;
                 
             case "-.--":  letter = "Y";
                 break;
                 
             case "--..":  letter = "Z";
                 break;
                 
             case "-----":  letter = "0";
                 break;
                 
             case ".----":  letter = "1";
                 break;
                 
             case "..---":  letter = "2";
                 break;
                 
             case "...--":  letter = "3";
                 break;
                 
             case "....-":  letter = "4";
                 break;
                 
             case ".....":  letter = "5";
                 break;
                 
             case "-....":  letter = "6";
                 break;
                 
             case "--...":  letter = "7";
                 break;
                 
             case "---..":  letter = "8";
                 break;
                 
             case "----.":  letter = "9";
                 break;
                 
             default: letter = "ERROR";
                 break;
             
         }
         
         return letter + " is " + morse + " in morse!" + "\n";
         
     }
    
}