package Dictionary;

public class WordsCompareRunner{
    
    public static void main(String[] args){
        
        WordsCompare test = new WordsCompare("abe" , "ape");
        
        System.out.println(test);
        
        test.setWords("giraffe", "gorilla");
        
        test.compareWords();
        
        System.out.println(test);
        
        test.setWords("one", "two");
        
        test.compareWords();
        
        System.out.println(test);
        
        test.setWords("fun", "funny");
        
        test.compareWords();
        
        System.out.println(test);
        
        test.setWords("123", "19");
        
        test.compareWords();
        
        System.out.println(test);
        
        test.setWords("193", "1910");
        
        test.compareWords();
        
        System.out.println(test);
        
        test.setWords("goofy", "godfather");
        
        test.compareWords();
        
        System.out.println(test);
        
        test.setWords("funnel", "fun");
        
        test.compareWords();
        
        System.out.println(test);
        
    }
    
}
