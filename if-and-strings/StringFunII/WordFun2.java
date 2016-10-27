package StringFunII;

public class WordFun2{
    
    private String wordOne , tombemoved;
    
    private int numchars;
    
    public WordFun2(){
        
        tombemoved = wordOne = null;
        
        numchars = 0;
        
    }
    
     public WordFun2(String tempOne , int tempi){
         
         wordOne = tempOne;
         
         numchars = tempi;
         
         
     }
     
     public void setWords(String tempOne , int tempi){
         
         wordOne = tempOne;
         
         numchars = tempi;
         
        
     }
     
    @Override
     public String toString(){
         
          if(numchars >= wordOne.length())
              return "no can do\n";
          
          tombemoved = wordOne.substring(0, numchars);
         
         return (wordOne = wordOne.replace(tombemoved , "")) + tombemoved + "\n";
         
     }
         
}