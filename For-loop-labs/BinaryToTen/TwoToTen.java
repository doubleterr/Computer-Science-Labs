package BinaryToTen;

public class TwoToTen{
    
    public void ToBinary(String binary){
        
    int decimal = 0;
    
    for(int i = 0 ; i < binary.length() ; i++ ){
        
        if(binary.charAt(i) == '1')
            
         decimal += Math.pow( 2 , binary.length() - 1 - i);

        }
    
    System.out.println(binary + " == " + decimal + "\n");
    
    }
    
}