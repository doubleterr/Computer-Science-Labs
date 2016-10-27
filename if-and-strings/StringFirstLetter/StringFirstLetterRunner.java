package StringFirstLetter;

public class StringFirstLetterRunner{
    
    public static void main(String[] args){
        
        StringFirstLetterCheck test = new StringFirstLetterCheck("hello" , "howdy");
        
        System.out.println(test);
        
        test.setWords("one" , "two");
        
        System.out.println(test);
        
        test.setWords("three" , "two");
        
        System.out.println(test);
        
        test.setWords("TCEA" , "UIL");
        
        System.out.println(test);
        
        test.setWords("State" , "Champions");
        
        System.out.println(test);
        
        test.setWords("ABC", "DEF");
        
        System.out.println(test);
        
    }
    
}
