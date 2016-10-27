package drawinglabs;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Initials extends Canvas {
    
    public Initials(){
        
       setSize(WIDTH,HEIGHT);
       setBackground(Color.WHITE);
       setVisible(true);
        
    }
    
    public void paint(Graphics window){
        
        letters(window);
        
    }
    
    public void letters(Graphics window){
        
        window.setColor(Color.green);
        window.fillRect(0, 0, 800, 600);
        window.fillRect(75, 75, 75, 75);
        
        window.setColor(Color.CYAN);
        window.fillRect(0, 0, 50, 300);
        window.fillRect(0, 0, 125, 125);
        window.fillRect(150, 0, 50, 300);
        window.fillRect(150, 250, 250, 50);
        window.fillRect(150, 0, 250, 50);
        window.fillRect(350, 150, 50, 150);
        window.fillRect(250, 100, 150, 50);
        window.fillRect(450, 0, 50, 300);
        window.fillRect(500, 25, 50, 50);
        window.fillRect(550, 75, 50, 50);
        window.fillRect(600, 25, 50, 50);
        window.fillRect(650, 0, 50, 300);
        
        
        window.setColor(Color.green);
        window.fillRect(50, 35, 45, 45);
        
        
        
    }
    
}