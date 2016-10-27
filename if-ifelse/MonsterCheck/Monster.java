package MonsterCheck;

import java.util.Scanner;

public class Monster{

    Scanner input = new Scanner(System.in);
    
    private String name1 , name2;
    
    private int size1 , size2;
    
    public Monster(){
        
        name1 = name2 = "";
        
        size1 = size2 = 0;
        
    }
    
    public void getMonster(){
        
        System.out.print("Enter 1st monster's name : ");
        name1 = input.next();
        
        System.out.print("Enter 1st monster's size : ");
        size1 = input.nextInt();
        
        System.out.print("Enter 2nd monster's name : ");
        name2 = input.next();
        
        System.out.print("Enter 2nd monster's size : ");
        size2 = input.nextInt();
        
        System.out.print("\n");
        
        System.out.println("Monster 1 - " + name1 + " " + size1);
        System.out.println("Monster 2 - " + name2 + " " + size2 + "\n");
        
    }
    
    @Override
    public String toString(){
        
        if(size1 > size2){
            
        System.out.println("Monster one is bigger than Monster two");
        
            if(name1.compareTo(name2) != 0){
                
                return "Monster one does not have the same name as Monster two\n\n";
                    
            }
            
            else if(name1.compareTo(name2) == 0){
                
                return "Monster one has the same name as Monster two\n\n";
                
            }
            
        }
                        
        
        else if(size1 < size2){
            
        System.out.println("Monster one is smaller than Monster two");
        
            if(name1.compareTo(name2) != 0){
                
                return "Monster one does not have the same name as Monster two\n\n";
                
            }
            
            else if(name1.compareTo(name2) == 0){
                
                return "Monster one has the same name as Monster two\n\n";
                
            }
            
        }
        
        else if(size1 == size2){
            
        System.out.println("Monster one is equal to Monster two");
        
            if(name1.compareTo(name2) != 0){
                
                return "Monster one does not have the same name as Monster two\n\n";
                
            }
            
            else if(name1.compareTo(name2) == 0){
                
                return "Monster one has the same name as Monster two\n\n";
                
            }
            
        }
        
        return "\n\n";
        
    } 
    
}