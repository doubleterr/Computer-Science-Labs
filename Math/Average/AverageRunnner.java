package Average;

public class AverageRunnner {

    public static void main(String[] args) {
        
        Average giveAverage = new Average();
        
        giveAverage.setNums(5, 5);
        giveAverage.average();
        giveAverage.print();
        
        giveAverage.setNums(90, 100.0);
        giveAverage.average();
        giveAverage.print();
        
        giveAverage.setNums(100, 85.8);
        giveAverage.average();
        giveAverage.print();
        
        giveAverage.setNums(-100, 55);
        giveAverage.average();
        giveAverage.print();
        
        giveAverage.setNums(15236, 5642);
        giveAverage.average();
        giveAverage.print();
        
        giveAverage.setNums(1000, 555);
        giveAverage.average();
        giveAverage.print();
        
    }
    
}
