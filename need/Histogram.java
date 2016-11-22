package Histogram;

public class Histogram{
    
    private int numbers[];
    
    public void SetArray(int temp[]){
        
        
        numbers = new int[temp.length];
        
        for(int i = 0; i < temp.length; i++){
           
            numbers[i] = temp[i];
            
        }
      
    }
    
    public void CreateHistogram(){
        
        int count = 0;
        
        for(int i = 0; i <= 9; i++){
            
            count = 0;
            
            for(int x = 0; x < numbers.length; x++){
                
                if(numbers[x] == i)
                    
                    count++;
                
            }
            
            System.out.println(i + " - " + count);
            
        }
        
        System.out.println();
        
    }
}