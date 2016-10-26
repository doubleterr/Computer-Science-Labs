package LoopStats;

public class LoopStats{
    
    public void print(int start , int end){
        
        int total = 0 , even = 0 , odd = 0;
       
        for(int i = start; i <= end; i++){
            
            if(i % 2 == 0)
                
                even++;
            
            else
                odd++;
            
            total += i;
            
        }
        
        System.out.println(start + " " + end);
        
        System.out.println("total " + total);
        
        System.out.println("even count " + even);
        
        System.out.println("odd count " + odd + "\n");
        
    }
    
}