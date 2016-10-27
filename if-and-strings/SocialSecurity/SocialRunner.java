package SocialSecurity;

public class SocialRunner{
    
    public static void main(String[] args){
        
        Social test = new Social("456-56-234");
        
        System.out.println(test);
        
        test.setSSN("1-1-1");
        
        System.out.println(test);
       
        test.setSSN("102-2-12");
        
        System.out.println(test);
        
        test.setSSN("0-0-0");
        
        System.out.println(test);
        
    }
}     