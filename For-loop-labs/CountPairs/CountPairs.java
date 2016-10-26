package CountPairs;

public class CountPairs{
    
    public CountPairs(){
        
    }
    
    public int CountPairs(String n){
        
        int a = 0;
                
        for(int i = 1; i < n.length(); i++) {
                    
            if(n.charAt(i-1) == n.charAt(i)) a++;
                        
            } 
        
        return a;
        
    }
    
}