package GCD;

public class GCD{
    
    public void FindGCD(int num1 , int num2){
        
        int GCD = 0, temp;
        
        for(int i = num1; i > 0; i--){
            
            if(num1 % 1 == 0 && num2 % i == 0){
                
               temp = i;
               
               if(temp > GCD)
                   
                   GCD = temp;
               
           }
          
        }
        
        System.out.println("the gcd of " + num1 + " and " + num2 + " is " + GCD + "\n");
        
    }
    
}