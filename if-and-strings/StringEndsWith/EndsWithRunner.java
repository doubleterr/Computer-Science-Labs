package StringsEndsWith;

public class EndsWithRunner {

    public static void main(String[] args) {
        
        StringUtilites Czech = new StringUtilites();
        
        System.out.println(Czech.endswith("chicken" , "en"));
        
        System.out.println(Czech.endswith("chicken" , "dog"));
        
        System.out.println(Czech.endswith("alligator" , "gator"));
        
        System.out.println(Czech.endswith("alligator" , "all"));
        
        System.out.println(Czech.endswith("apluscompsci" , "sci"));
        
        System.out.println(Czech.endswith("apluscompsci" , "comp"));
    }
}