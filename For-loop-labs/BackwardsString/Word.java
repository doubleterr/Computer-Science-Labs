package BackwardsString;

public class Word{
    
public void print(String word){
    
          System.out.println(word.charAt(0));
          
          System.out.println(word.charAt(word.length() - 1));
          
          for(int i = (word.length() - 1); i >= 0; i--)
              
              System.out.print(word.charAt(i));
          
          System.out.println("\n" + word +"\n\n");
              
    }

}