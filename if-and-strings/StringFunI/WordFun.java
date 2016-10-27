package StringFunI;

public class WordFun{
    
    private String wordOne;
    
    public WordFun(){
        
        wordOne = null;
        
    }
    
     public WordFun(String tempOne){
         
         wordOne = tempOne;
         
     }
     
     public void setWords(String tempOne){
         
         wordOne = tempOne;
         
     }
     
    @Override
     public String toString(){
         
        return wordOne + "\n\n" + (wordOne = wordOne.toUpperCase()) + "\n\n" + (wordOne.replace(' ', '-') + "\n\n");
         
     }
         
}