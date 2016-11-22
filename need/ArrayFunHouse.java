package ArrayFunHouse;

public class ArrayFunHouse{
    
    private int numbers[];

    public void SetArray(int temp[]){
        
        numbers = new int[temp.length];
        
        System.out.print("[");
        
        for(int i = 0; i < temp.length; i++){
            
            numbers[i] = temp[i];
            
            if(i < temp.length - 1)
                
                System.out.print(temp[i] + ", ");
            
            else
                
                 System.out.print(temp[i]);
            
        }
        
        System.out.println("]");
        
    }
    
    public void FindSum(int spot1 , int spot2){
        
        int sum = 0;
        
        for(int i = spot1; i <= spot2; i++){
            
            sum += numbers[i];
            
        }
        
        System.out.println("sum of spots " + spot1 + "-" + spot2 + " = " + sum);
        
    }
    
    public void CountNumOf(int search){
        
        int count = 0;
        
         for(int i = 0; i < numbers.length; i++){
             
             if (numbers[i] == search)
                 
                 count++;
             
         }
         
         System.out.println("# of " + search + "s" + " = " + count);
        
    }
    
    public void RemoveANum(int search){
        
        int count = 0;
        
        for(int i = 0; i < numbers.length; i++){
             
             if (numbers[i] == search)
                 
                 count++;
             
         }
        
        int newArray[] = new int [numbers.length - count];
        
        count = 0 ;
        
        for(int i = 0; i < numbers.length; i++){
             
             if (numbers[i] != search){
                 
                newArray[count] = numbers[i];
                 
                 count++;
                 
             }
             
         }
        
        System.out.print("new array with all 7s removed = ");
        
        System.out.print("[");
        
        for(int x = 0; x < newArray.length; x++){
            
            numbers[x] = newArray[x];
            
            if(x < newArray.length - 1)
                
                System.out.print(newArray[x] + ", ");
            
            else
                
                 System.out.print(newArray[x]);
        }
        
        System.out.println("]");
        
        count = 0;
        
         for(int y = 0; y < newArray.length; y++){
             
             if (newArray[y] == search)
                 
                 count++;
             
         }
         
         System.out.println("# of " + search + "s" + " = " + count + "\n\n");
        
    }
    
}