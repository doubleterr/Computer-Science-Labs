package VowelCounter;

public class VowelCounter{
    
    private String word;
    
    public boolean isVowel(char x){
        
        if( x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'|| x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
            
            return true;
    
        return false;
        
    }
    
    public String ReplaceVowels(String temp){
        
        word = "";
        
        int count = 0;
        
        for(int i = 0; i != temp.length(); i++){
            
            if(isVowel(temp.charAt(i))){
                
                if(count <= 9){
            
                    word += count;
                    
                    count++;
                    
                    
                }
                
                if(count > 9){
                    
                    count = 0;
                    
                }
                
            }
            
                else{
                
                    word += temp.charAt(i);
                    
                }  
            
        }
        
        return word;
        
    }
    
}