package StringLength;

public class StringLengthCheck{
    
    private String wordOne , wordTwo;
    
    public StringLengthCheck(){
        
        wordOne = wordTwo = null;
        
    }
    
     public StringLengthCheck(String tempOne , String tempTwo){
         
         wordOne = tempOne;
         
         wordTwo = tempTwo;
         
     }
     
     public void setWords(String tempOne , String tempTwo){
         
         wordOne = tempOne;
         
         wordTwo = tempTwo;
         
     }
     
    @Override
     public String toString(){
         
         if(wordOne.length() == wordTwo.length())
             return wordOne + " has the same # of letters as " + wordTwo + "\n";
         
        return wordOne + " does not have the same # letters as " + wordTwo + "\n";
         
     }
         
}
