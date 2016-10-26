package DecreasingWord;

public class TriangleOne{
    
    public void PrintWordTriangle(String word){
        
        for(int x = (word.length()); x != 0; x--){
            
            System.out.println(word.substring(0, x));
            
        }
        
        System.out.println("\n");
        
    }
    
}