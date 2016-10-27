package Average;

public class Average {
    
    private double one , two , average;
    
    public void setNums(double num1, double num2){
        
        one = num1;
        two = num2;
        
    }
    
    public void average(){
        
        average = (one + two) / 2;
        
    }
    
    public void print(){
        
        System.out.print(one + " + " + two + " has an average of ");
        System.out.printf("%.2f \n\n", average);

        
    }

}
