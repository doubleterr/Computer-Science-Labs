package BigOrSmall;

public class BigorSmallRunner{
    
    public static void main(String[] args){
        
        BigorSmall Czech = new BigorSmall();
        
        System.out.println(Czech.check(10, 20));
        
        System.out.println(Czech.check(20, 10));
        
        System.out.println(Czech.check(20, 20));
        
        System.out.println(Czech.check(10, 10));
        
        System.out.println(Czech.check(0, 1));
        
        System.out.println(Czech.check(1, 0));
        
        System.out.println(Czech.check(3, 5));
        
        System.out.println(Czech.check(5, 3));
        
        System.out.println(Czech.check(55342, 323));
        
    }
    
}