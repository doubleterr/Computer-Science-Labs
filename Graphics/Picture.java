package drawinglabs;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Picture extends Canvas {
    
    public Picture(){
        
       setSize(WIDTH,HEIGHT);
       setBackground(Color.WHITE);
       setVisible(true);
        
    }
    
    public void paint(Graphics window){
        
        Draw(window);
        
    }
    
    public void Draw(Graphics window){
        
        window.setColor(Color.RED);
        window.fillOval(200, 100, 400, 400);
        
        window.setColor(Color.WHITE);
        window.fillOval(225, 125, 350, 350);
        
        window.setColor(Color.RED);
        window.fillOval(375, 250, 50, 50);
    }
    
    
}
