package CoolNumbers;

public class CoolNumbers{
    
    public boolean isCoolNumber(int num){
        
        return (num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 ==1);
        
    }
    
    public int countCoolNumbers(int stop){
        
        int count = 0;
        
        for(int i = 6; i <= stop; i++){
            
            if(isCoolNumber(i))
                count++;
            
        }
        
        return count;
        
    }
    
}