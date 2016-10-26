package VowelCounter;

public class VowelCounterRunner{
    
    public static void main(String[] agrs){
        
        VowelCounter vc = new VowelCounter();
        
        System.out.println(vc.ReplaceVowels("abcdef"));
        
        System.out.println(vc.ReplaceVowels("hhhhhhh"));
        
        System.out.println(vc.ReplaceVowels("aaaaaaa"));
        
        System.out.println(vc.ReplaceVowels("catpigdatrathogbogfrogmoosegeese"));
        
        System.out.println(vc.ReplaceVowels("hhhhhhh123456HHHHDH"));
        
        System.out.println(vc.ReplaceVowels("AEIOUaeiou87878alkjdaslwlejrlajflawkflwj"));
        
        System.out.println(vc.ReplaceVowels(""));
        
        System.out.println(vc.ReplaceVowels(""));
        
        System.out.println(vc.ReplaceVowels("x"));
        
        System.out.println(vc.ReplaceVowels("e"));
        
    }
    
}
