package Area_of_a_Circle;

public class Circle {
    
    private double radius,ans;
    
    public void setNum(double temp){
        
        radius = temp;
        
    }
    
    public void calculate(){
        
        ans = (radius * radius) * Math.PI;
        
    }
    
    public void print(){
        
        System.out.print("The area is :: ");
        System.out.printf("%.4f \n\n\n", ans);

        
    }
    
}
