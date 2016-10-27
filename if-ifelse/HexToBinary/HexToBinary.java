package HexToBinary;

import java.util.Scanner;

public class HexToBinary{
    
    Scanner input = new Scanner(System.in);
    
    private String hexchar;
    
    public HexToBinary(){
    
        hexchar = "";
    
    }
     
    public void getVals(){
        
        System.out.print("Enter a letter :: ");
        
        hexchar = input.next();
          
     }
    
    @Override
     public String toString(){
         
         String binary;
         
         switch(hexchar){
             
             case "A":  binary = "1010";
                 break;
             
             case "B":  binary = "1011";
                 break;
             
             case "C":  binary = "1100";
                 break;
             
             case "D":  binary = "1101";
                 break;
             
             case "E":  binary = "1110";
                 break;
             
             case "F":  binary = "1111";
                 break;
             
             default: binary = "ERROR";
                 break;
             
         }
         
         return hexchar + " is " + binary + " in binary!" + "\n";
         
     }
    
}
