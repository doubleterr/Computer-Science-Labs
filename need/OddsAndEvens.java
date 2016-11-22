package OddsAndEvens;

public class OddsAndEvens{
    
    private int numbers[] , evenNumbers[] , oddNumbers[];
    
    private int numEvens;
    
    public void SetArray(int temp[]){
        
        numEvens = 0;
        
        numbers = new int[temp.length];
        
        for(int i = 0; i < temp.length; i++){
            
            if(temp[i] % 2 == 0)
                
                numEvens++;
            
            numbers[i] = temp[i];
            
        }
        
        evenNumbers = new int [numEvens];
        
        oddNumbers = new int [numbers.length - numEvens];
         
    }
    
    public void PrintOddNums(){
        
        System.out.print("Odds - [");
        
        int index = 0;
        
        for(int i = 0; i < numbers.length; i++){
            
            if(numbers[i] % 2 != 0){
                
                oddNumbers[index] = numbers[i];
                
                index++;
            }
            
        }
        
        for(int i = 0; i < oddNumbers.length; i++){

           if(i < oddNumbers.length - 1)

                System.out.print(oddNumbers[i] + ", ");

            else

                 System.out.print(oddNumbers[i]);
           
        }
        
        System.out.println("]");
            
        }
    
    public void PrintEvenNums(){
        
        System.out.print("Evens - [");
        
        int index = 0;
        
        for(int i = 0; i < numbers.length; i++){
            
            if(numbers[i] % 2 == 0){
                
                evenNumbers[index] = numbers[i];
                
                index++;
            }
            
        }
        
        for(int i = 0; i < evenNumbers.length; i++){

           if(i < evenNumbers.length - 1)

                System.out.print(evenNumbers[i] + ", ");

            else

                 System.out.print(evenNumbers[i]);
           
        }
        
        System.out.println("]\n\n");
         
        }
    
    }
