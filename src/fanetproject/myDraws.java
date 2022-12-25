
package fanetproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import javax.swing.Timer;

public class myDraws extends JPanel implements ActionListener{

 Timer t = new Timer(5, this);
 double x=Math.random()*500 , y=Math.random()*500 , velX=Math.random()*5 , velY=Math.random()*5;
 double x2=Math.random()*500 , y2=Math.random()*500 , velX2=Math.random()*5 , velY2=Math.random()*5;
 
 @Override
    public void paintComponent(Graphics g){
      
    super.paintComponent(g);  
    Graphics2D g2 = (Graphics2D)g;
     Ellipse2D circel = new Ellipse2D.Double(x, y, 15, 15);
     g2.setColor(Color.red);
     g2.fill(circel);
     Graphics2D g3 = (Graphics2D)g;
     Ellipse2D circel2 = new Ellipse2D.Double(x2, y2, 15, 15);
     g3.setColor(Color.blue);
     g3.fill(circel2);
     t.start();
}

    @Override
    public void actionPerformed(ActionEvent e) {
    if (x<0 || x>460){
    velX = -velX;
    
    }
    if (x2<0 || x2>460){
    velX2 = -velX2;
    
    }
    if (y<0 || y>460){
    velY = -velY;
    
    }
    if (y2<0 || y2>460){
    velY2 = -velY2;
    
    }
    x += velX;
    y += velY;
     x2 += velX2;
    y2 += velY2;
    repaint();
    }
    
    
    
    }
 
  


