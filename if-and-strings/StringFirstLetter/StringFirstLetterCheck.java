package StringFirstLetter;

public class StringFirstLetterCheck{
    
    private String wordOne , wordTwo;
    
    public StringFirstLetterCheck(){
        
        wordOne = wordTwo = null;
        
    }
    
     public StringFirstLetterCheck(String tempOne , String tempTwo){
         
         wordOne = tempOne;
         
         wordTwo = tempTwo;
         
     }
     
     public void setWords(String tempOne , String tempTwo){
         
         wordOne = tempOne;
         
         wordTwo = tempTwo;
         
     }
     
    @Override
     public String toString(){
         
         if(wordOne.charAt(0) == wordTwo.charAt(0))
             return wordOne + " has the same first letter as " + wordTwo + "\n";
         
        return wordOne + " does not have the same first letter as " + wordTwo + "\n";
         
     }
         
}
