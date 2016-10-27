package NumberCompare;

public class NumberCompareRunner{
    
    public static void main(String[] args){
        
        NumberCompare test = new NumberCompare(5 , 6);
        
        System.out.println(test);
        
        test.getNums(45 , 66);
        
        System.out.println(test);
         
        test.getNums(-25 , 10324);
        
        System.out.println(test);
        
        test.getNums(324 , 12312);
        
        System.out.println(test);
        
        test.getNums(34 , 33);
        
        System.out.println(test);
    }
    
}