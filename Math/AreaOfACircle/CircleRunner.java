package Area_of_a_Circle;

public class CircleRunner {

    public static void main(String[] args) {
       
        Circle Area = new Circle();
        
        Area.setNum(7.5);
        Area.calculate();
        Area.print();
        
        Area.setNum(10);
        Area.calculate();
        Area.print();
        
        Area.setNum(72.534);
        Area.calculate();
        Area.print();
        
        Area.setNum(55);
        Area.calculate();
        Area.print();
        
        Area.setNum(101);
        Area.calculate();
        Area.print();
        
        Area.setNum(99.952);
        Area.calculate();
        Area.print();
        
    }
    
}
