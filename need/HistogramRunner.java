package Histogram;

public class HistogramRunner{
    
    public static void main (String[] args){
        
        int array1[] = {1, 5, 3, 4, 5, 5, 5, 4, 3, 2, 5, 5, 5, 3};
        
        int array2[] = {2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
        
        int array3[] = {2, 3, 4, 5, 6, 7, 8, 2, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
        
        Histogram test = new Histogram();
        
        test.SetArray(array1);
        
        test.CreateHistogram();
        
        test.SetArray(array2);
        
        test.CreateHistogram();
        
        test.SetArray(array3);
        
        test.CreateHistogram();
       
    }
    
}