
package StarAndStripes;

public class StarAndStripes {
    
    public StarAndStripes(){
    
        System.out.println("StarsAndStripes");
        printTwoBlankLines();
        
}
    
    public void printTwentyStars(){
        
        System.out.println("********************");
        
}
    
    public void printTwentyDashes(){
        
        System.out.println("--------------------");
        
}
    
    public void printTwoBlankLines(){
    
        System.out.println("\n");
    
} 
    
    public void PrintASmallBox(){
        
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        
    }
    
    public void PrintALargeBox(){
        
        PrintASmallBox();
        PrintASmallBox();
        
    }
    
}