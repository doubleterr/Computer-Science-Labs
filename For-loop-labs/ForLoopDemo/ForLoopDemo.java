package ForLoopDemo;

public class ForLoopDemo{
    
    public void CreateDemo(int start , int stop , int increment){
        
        System.out.println("start " + start +" : stop " + stop + " : increment " + increment);
        
        for(int i = start; i < stop; i += increment){
            
            System.out.print(i + " ");
            
        }
        
        System.out.println("\n");
        
    }
    
}