package NumberCompare;

public class NumberCompare{
    
    private int num1 , num2;
    
    public NumberCompare(){
        
        num1 = num2 = 0;
        
    }
    
     public NumberCompare(int tempOne , int tempTwo){
         
         num1 = tempOne;
         
         num2 = tempTwo;
         
     }
     
      public void getNums(int tempOne , int tempTwo){
          
         num1 = tempOne;
         
         num2 = tempTwo;
          
      }
     
     
     public String toString(){
         
         if(num1 > num2)
             return num1 + " -- " + num2 + "\n" + "largest == " + num1 +"\n" + "Smallest == " + num2 + "\n" + "\n" ;
         
         else
             return num1 + " -- " + num2 + "\n" + "largest == " + num2 +"\n" + "Smallest == " + num1 + "\n" + "\n" ;
         
     }
    
    
}