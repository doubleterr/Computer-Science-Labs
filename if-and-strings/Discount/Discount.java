package Discount;

import java.util.Scanner;

public class Discount{
    
    Scanner input = new Scanner(System.in);
    
    private double bill;
    
    public Discount(){
        
        bill = 0;
        
    }
    
    public void applyDiscount(){
        
       System.out.print("Enter the original bill amount :: ");
       bill = input.nextDouble();
       
       if(bill <= 2000){
           
           System.out.print("Bill after discount :: ");
           
           System.out.printf("%.2f" + "\n\n", bill);
           
       }
       
       if(bill > 2000){
       
       bill = bill - (double)(bill * .15);
       
       System.out.print("Bill after discount :: ");
       System.out.printf("%.2f" + "\n\n", bill);
       
       }
        
    }
    
}