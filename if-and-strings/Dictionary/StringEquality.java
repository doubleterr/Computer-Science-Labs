package StringEquality;

public class StringEquality{
    
    private String wordOne , wordTwo;
    
    public StringEquality(){
        
        wordOne = wordTwo = null;
        
    }
    
     public StringEquality(String tempOne , String tempTwo){
         
         wordOne = tempOne;
         
         wordTwo = tempTwo;
         
     }
     
     public void setWords(String tempOne , String tempTwo){
         
         wordOne = tempOne;
         
         wordTwo = tempTwo;
         
     }
     
    @Override
     public String toString(){
         
         if(wordOne.equals(wordTwo))
             return wordOne + " does have the same letters as " + wordTwo + "\n";
         
        return wordOne + " does not have the same letters as " + wordTwo + "\n";
         
     }
         
}
