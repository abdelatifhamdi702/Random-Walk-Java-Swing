package fanetproject;

import javax.swing.JFrame;


public class FANETproject {

    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        myDraws s1 = new myDraws();
        f.add(s1);
         f.setVisible(true);
         f.setSize(505, 510);
         f.setTitle("Radar");
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
}}
