package drawinglabs;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas {
    
    public BigHouse(){
        
       setSize(WIDTH,HEIGHT);
       setBackground(Color.WHITE);
       setVisible(true);
        
    }
    
    public void paint(Graphics window){
        
        House(window);
        
    }
    
    public void House(Graphics window){
        
        window.setColor(Color.CYAN); //sky
        window.fillRect(0, 0, 800, 450);
        
        window.setColor(Color.green);// yard
        window.fillRect(0, 450, 800, 150);
        
        window.setColor(Color.LIGHT_GRAY);//walk way
        window.fillRect(370, 450, 80, 150);
        
        window.setColor(Color.WHITE);//house
        window.fillRect(175, 200, 450, 250);
        
        window.setColor(Color.red);//roof
        window.fillRect(150, 200, 500, 50);
        
        window.setColor(Color.DARK_GRAY);//door
        window.fillRect(370, 300, 80, 150);
        
        window.setColor(Color.black);//windows
        window.drawRect(225, 300, 100, 100);
        window.drawRect(500, 300, 100, 100); 
        window.fillRect(275, 300, 5, 100);
        window.fillRect(225, 350, 100, 5);
        window.fillRect(550, 300, 5, 100);
        window.fillRect(500, 350, 100, 5);
        
        window.setColor(Color.WHITE);//cloud
        window.fillOval(0, 25, 50, 50);
        window.fillOval(15, 50, 50, 50);
        window.fillOval(35, 25, 50, 50);
        window.fillOval(55, 50, 50, 50);
        window.fillOval(75, 25, 50, 50);
        window.fillOval(95, 50, 50, 50);
        window.fillOval(115, 25, 50, 50);
        window.fillOval(135, 50, 50, 50);
    }
    
}