package drawinglabs;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Robot extends Canvas {
    
    public Robot(){
        
       setSize(WIDTH,HEIGHT);
       setBackground(Color.WHITE);
       setVisible(true);
        
    }
    
    public void paint(Graphics window){
        
        Bot(window);
        
    }
    
    public void Bot(Graphics window){
        
        window.setColor(Color.GRAY);
        window.fill3DRect(300, 50, 125, 125, true);
        window.fill3DRect(260, 180, 200, 300, true);
        window.drawLine(275, 200, 120, 150);
        window.drawLine(375, 400, 120, 575);
        window.drawLine(450, 470, 650, 600);
        window.drawLine(450, 175, 650, 150);
        
        window.setColor(Color.BLACK);
        window.fill3DRect(325, 75, 25, 25, true);
        window.fill3DRect(375, 75, 25, 25, true);
        window.fill3DRect(325, 125, 75, 15, true);
    }
    
}
