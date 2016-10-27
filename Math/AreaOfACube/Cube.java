package AreaofaCube;

public class Cube {
    
    private int length , surfaceArea;
    
        public void setNum(int temp){
            
            length = temp;
            
        }
        
        public void calculate(){
            
            surfaceArea = 6 * (length * length);
            
        }
    
        public void print(){
            
            System.out.println("The surface area is :: " + surfaceArea + "\n\n");
            
        }
        
}
