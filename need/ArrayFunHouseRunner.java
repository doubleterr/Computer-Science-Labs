package ArrayFunHouse;

public class ArrayFunHouseRunner{
    
    public static void main (String[] args){
        
        ArrayFunHouse Hez = new ArrayFunHouse();
        
        int array1[] = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
        
        int array2[] = {7 , 4, 2, 7,3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8, 7};
        
        Hez.SetArray(array1);
        
        Hez.FindSum(3, 6);
        
        Hez.FindSum(2, 9);
        
        Hez.CountNumOf(4);
        
        Hez.CountNumOf(9);
        
        Hez.CountNumOf(7);
        
        Hez.RemoveANum(7);
        
        
        Hez.SetArray(array2);
        
        Hez.FindSum(3, 16);
        
        Hez.FindSum(2, 9);
        
        Hez.CountNumOf(0);
        
        Hez.CountNumOf(3);
        
        Hez.CountNumOf(7);
        
        Hez.RemoveANum(7);
        
    }
    
}
