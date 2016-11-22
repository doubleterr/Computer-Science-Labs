package BoxWord;

class BoxWord{
    
private String word;

public void MakeBox(String temp){
    
    word = temp;
    
    String output="";
    
    String reverse = "";
    
    output += word + "\n";
    
    for(int i = 1; i < word.length() - 1; i++){
        
        output += word.charAt(i);
        
        for(int j = 1; j <= word.length() - 2; j++){
            
            output += " ";
        }
        
        output += word.charAt((word.length() - i - 1)) + "\n";
        
    }
    
    if(word.length() > 1){
        
        for(int x = word.length() - 1; x >= 0 ; x--){
        
        reverse += word.charAt(x);
        
        }
        
    }
    
    output += reverse;

    System.out.println(output+"\n");
    
    }

}