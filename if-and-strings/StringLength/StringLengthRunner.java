package StringLength;

public class StringLengthRunner{
    
    public static void main(String[] args){
        
        StringLengthCheck test = new StringLengthCheck("hello" , "goodbye");
        
        System.out.println(test);
        
        test.setWords("one" , "two");
        
        System.out.println(test);
        
        test.setWords("three" , "four");
        
        System.out.println(test);
        
        test.setWords("TCEA" , "UIL");
        
        System.out.println(test);
        
        test.setWords("State" , "Champions");
        
        System.out.println(test);
        
        test.setWords("ABC", "DEF");
        
        System.out.println(test);
        
        test.setWords("four", "five");
        
        System.out.println(test);
        
        test.setWords("whoot", "what");
        
        System.out.println(test);
        
    }
    
}
