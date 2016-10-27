
package SocialSecurity;

public class Social{
    
    private String wordOne,SSNO;
    
    private int total , index;
    
    public Social(){
        
        SSNO = wordOne = null;
        total = index = 0;
    }
    
     public Social(String temp){
         
         SSNO = wordOne = temp;
         
     }
     
     public void setSSN(String temp){
         
         SSNO = wordOne = temp;
         
     }
     
    @Override
     public String toString(){
         
        index = wordOne.indexOf("-");
        
        total = Integer.parseInt(wordOne.substring(0, index));
        
        wordOne = wordOne.substring(index + 1);
        
        index = wordOne.indexOf("-");
        
        total += Integer.parseInt(wordOne.substring(0, index));
        
        wordOne = wordOne.substring(index + 1);
        
        total += Integer.parseInt(wordOne);
        
        return "SS# " + SSNO + " has a total of " + total + "\n";
         
     }
    
}
