package StringFunI;

public class WordFunRunner{
    
    public static void main(String[] args){
        
        WordFun test = new WordFun("Hello World");
        
        System.out.println(test);
        
        test.setWords("Jim Bob");
        
        System.out.println(test);
        
        test.setWords("Computer Science");
        
        System.out.println(test);
        
        test.setWords("UIL TECA");
        
        System.out.println(test);
        
        test.setWords("State Champions");
        
        System.out.println(test);
        
    }
    
}
