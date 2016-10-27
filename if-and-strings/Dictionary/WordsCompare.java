package Dictionary;

public class WordsCompare{
    
    private String wordOne , wordTwo;
    
    private int compare;
    
    public WordsCompare(){
        
        wordOne = wordTwo = null;
        
        compare = 0;
        
    }
    
     public WordsCompare(String tempOne , String tempTwo){
         
         wordOne = tempOne;
         
         wordTwo = tempTwo;
         
         compare = wordOne.compareTo(wordTwo);
         
     }
     
     public void setWords(String tempOne , String tempTwo){
         
         wordOne = tempOne;
         
         wordTwo = tempTwo;
         
     }
     
     public void compareWords(){
         
         compare = wordOne.compareTo(wordTwo);
         
     }
     
     public String toString(){
         
         if(compare < 0)
             return wordOne + " should be placed before " + wordTwo + "\n";
         
         else
             return wordOne + " should be placed after " + wordTwo + "\n";
         
     }
    
    
}