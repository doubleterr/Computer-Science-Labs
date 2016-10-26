package Multiplication;
        
public class MultTable{
    
    public void PrintTable(int num , int too){
        
        System.out.println("multiplication table for " + num);
        
        for(int i = 1; i <= too; i++){
            
            System.out.println(i + "    " + i * num);
            
        }
        
        System.out.println("\n");
        
    }
    
}