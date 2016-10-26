package GradeCheck;

import java.util.Scanner;

public class Grade{
    
    Scanner input = new Scanner(System.in);
    
    private int grade;
    
    public Grade(){
    
        grade = 0;
    
    }
    
    public void getNums(){
        System.out.print("Enter a number grade :: ");
        
        grade = input.nextInt();
          
     }
    
    @Override
     public String toString(){
         
         if(grade >= 90)
             return grade + " is a A\n";
         
         else if(grade >= 80 && grade < 90)
             return grade + " is a B\n";
         
         else if(grade >= 75 && grade < 80)
             return grade + " is a C\n";
         
         else if(grade >= 70 && grade < 75)
             return grade + " is a D\n";
         
         else if(grade < 70)
             return grade + " is a F\n";
         
         return grade + " is a not a grade\n";
     }
    
}
