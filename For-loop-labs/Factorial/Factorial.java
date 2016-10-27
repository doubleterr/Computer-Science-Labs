package Factorial;

public class Factorial{
    
    public void CalcFactorial(int num){
        
        long factorial = 1;
        
        for(int i = 1; i <= num; i++){
            
           factorial *= i; 
            
        }
        
        System.out.println("factorial of " + num + " is " + factorial + "\n");
        
    }
    
}