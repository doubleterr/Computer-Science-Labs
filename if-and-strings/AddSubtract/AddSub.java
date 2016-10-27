package AddSubtractLab;

public class AddSub{
    
    public AddSub(){
    
}
    
    public double check(int a , int b){
        
        if(a > b) 
            return a - b ;
        
        if(a < b) 
            return b - a ;
        
        
        return a + b ;
        
    }
    
}