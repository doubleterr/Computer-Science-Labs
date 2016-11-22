package OddsAndEvens;

public class OddsAndEvensRunner{
    
    public static void main (String[] args){
        
        OddsAndEvens test = new OddsAndEvens();
        
        int array1[] = {2, 4, 6, 8, 10, 12, 14};
        
        int array2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        int array3[] = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};
        
        test.SetArray(array1);
        
        test.PrintOddNums();
        
        test.PrintEvenNums();
        
        test.SetArray(array2);
        
        test.PrintOddNums();
        
        test.PrintEvenNums();
        
        test.SetArray(array3);
        
        test.PrintOddNums();
        
        test.PrintEvenNums();
        
    }
    
}