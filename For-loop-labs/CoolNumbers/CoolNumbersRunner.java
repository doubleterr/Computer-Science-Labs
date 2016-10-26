package CoolNumbers;

public class CoolNumbersRunner{
    
    public static void main(String[] agrs){
        
        CoolNumbers cn = new CoolNumbers();
        
        System.out.println(cn.countCoolNumbers(250) + " cool numbers between 6 - 250");
        
        System.out.println(cn.countCoolNumbers(1250) + " cool numbers between 6 - 1250");
        
        System.out.println(cn.countCoolNumbers(2250) + " cool numbers between 6 - 2250");
        
        System.out.println(cn.countCoolNumbers(5500) + " cool numbers between 6 - 5500");
        
        System.out.println(cn.countCoolNumbers(9500) + " cool numbers between 6 - 9500");
        
        System.out.println(cn.countCoolNumbers(23500) + " cool numbers between 6 - 23500");
        
        System.out.println(cn.countCoolNumbers(32500) + " cool numbers between 6 - 32500");
        
    }
    
}