package StringsEndsWith;

import java.util.Scanner;

public class StringUtilites{
    
    Scanner input = new Scanner(System.in);
    
    private String word , lookfor , compare;
    
    private int loc;
    
    public StringUtilites(){
    
        word = null;
        
        lookfor = null;
        
        loc = 0;
    
    }
    
    public boolean endswith(String temp , String templ){
        
        word = temp;
        
        lookfor = templ;
        
        loc = word.indexOf(lookfor);
        
        if(word.substring(word.length() - lookfor.length()).equals(lookfor))
            return true;
        
        return false;
        
    }
    
}