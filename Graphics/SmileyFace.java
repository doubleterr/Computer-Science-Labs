package drawinglabs;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas{
    
    public SmileyFace(){
        
       setSize(WIDTH,HEIGHT);
       setBackground(Color.WHITE);
       setVisible(true);
        
    }
    
     public void paint(Graphics window){
        
        Face(window);
        
    }
     
     public void Face(Graphics window){
         
         window.setColor(Color.YELLOW);
         window.fillOval(175, 100, 350, 350);
         
         window.setColor(Color.magenta);
         window.fillOval(250, 175, 75, 75);
         window.fillOval(400, 175, 75, 75);
         
         window.setColor(Color.black);
         window.fillOval(275, 200, 25, 25);
         window.fillOval(425, 200, 25, 25);
         window.fillArc(285, 250, 150, 150, 180, 180);
         
         window.setColor(Color.red);
         window.fillOval(340, 230, 50, 75);
         
     }
    
}