package LoopBox;

public class Box{
    
    private int numTimes;
   
    public void CreateBox(int temp){
        
        numTimes = temp;
        
        for(int x = 1; x <= numTimes; x++){
            
            for(int y = (numTimes - x); y >= 0; y--){
                
                System.out.print("*");
                
            }
            
            for(int z = (x - 1); z >= 0; z--){
                
                System.out.print("#");
                
            }
            
            System.out.println();
            
        }
        
        System.out.println("\n\n");
        
    }
    
}