package DistanceFormula;

import java.util.Scanner;

public class Distance {
    
    private double x1 , x2 , y1 , y2 , distanceA , distanceB;
    
    Scanner input = new Scanner(System.in);
    
    public Distance(){
        
       x1 = 0;
       x2 = 0;
       y1 = 0;
       y2 = 0;
       distanceA = 0;
       distanceB = 0;
        
    }
    
    public String calc(){
        
        System.out.print("Enter X1 :: ");
        x1 = input.nextDouble();
        
        System.out.print("Enter Y1 :: ");
        y1 = input.nextDouble();
        
        System.out.print("Enter X2 :: ");
        x2 = input.nextDouble();
        
        System.out.print("Enter Y2 :: ");
        y2 = input.nextDouble();
        
        System.out.print("\n");
        
        distanceA = Math.sqrt(Math.pow((x2 - 0) , 2) + Math.pow((y2 - 0) , 2));
        
        distanceB = Math.sqrt(Math.pow((x1 - 0) , 2) + Math.pow((y1 - 0) , 2));
        
        if(distanceA > distanceB){
            
            return "A is closer to (0,0)" + "\n";
            
        }
        
        return "B is closer to (0,0)" +"\n";
        
    }
    
}
