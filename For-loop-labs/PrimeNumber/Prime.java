package PrimeNumber;

public class Prime{
    
    public void isPrime(int num){
        
        boolean prime = true;
        
        for(int i = num - 1; i > 1; i--){
          
            if(num % i == 0){
                prime = false;
            }
            
        }
        
        if(prime)
            
            System.out.println(num + " is prime");
        
        else
            
            System.out.println(num + " is not prime");
        
    }
    
}